package eshanbehal.flickrbrowser;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

enum DownloadStatus {IDLE , PROCESSING , NOT_INITIALISED , FAILED_OR_EMPTY , OK}


class GetRawData extends AsyncTask<String , Void , String> {
    private static final String TAG = "GetRawData";

    private DownloadStatus mDownloadStatus;

    public GetRawData() {
        mDownloadStatus = DownloadStatus.IDLE;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected String doInBackground(String... strings) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        if (strings == null) {
            mDownloadStatus = DownloadStatus.NOT_INITIALISED;
            return null;
        }

        try {
            mDownloadStatus = DownloadStatus.PROCESSING;
            URL url = new URL(strings[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            
            int response = connection.getResponseCode();
            Log.d(TAG, "doInBackground: The Response Code Was : " + response);

            StringBuilder result = new StringBuilder();

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while (null != ( line = reader.readLine())){
                result.append(line).append("\n");
            }
            mDownloadStatus = DownloadStatus.OK;
            return result.toString();


        }catch (MalformedURLException e){
            Log.e(TAG, "doInBackground: Invalid Url " + e.getMessage() );
        }
        catch (IOException e){
            Log.e(TAG, "doInBackground: IO Exception Reading Data " + e.getMessage() );
        }
        catch (SecurityException e){
            Log.e(TAG, "doInBackground: Security Exception. Needs Permission? " + e.getMessage() );
        }
        finally {
            if (connection != null){
                connection.disconnect();
            }
            if (reader != null){
                try {
                    reader.close();
                }catch (IOException e){
                    Log.e(TAG, "doInBackground: Erroe Closing Stream" + e.getMessage() );
                }
            }
        }
        mDownloadStatus = DownloadStatus.FAILED_OR_EMPTY;
        return null;
    }
}
