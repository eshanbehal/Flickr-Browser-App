

               HEYS GUYS JUST STARTED WITH CREATING A NEW APP #FLICKR BROWSER.....

1.Just starting off a new project flickr browser that will allow us to search for 
  different types of photos from the flickr.

2. For those who dont know whats flickr - Its an image sharing website.

   so my app will allow users to search through flickr using sepperate tags and then
   show the results on the screen.

3. Will be using API from the flickr and download some of the images to my application.

   for more info : https://www.flickr.com/
                   
                 : https://www.flickr.com/services/api/

4. Added some Log codes for the app in order to view the process of debugging in the logcat.

5. now after entering the log codes firstly i will be downloading data ie raw data from the 
   internet and add it using Async task method by creating different java class.

   under this java class i have enterend code for the handeling of the url data for us.
   nd here created the http connection and entered the code for the various exception that
   can occur while downloading data in the seperate thread.



      19th june
   ==============

1. jst starting off today with writing the code for the calling of the getrawdata class
   in the main activity class just by creating mcallback method and it will do all the work.

2. ended todays code by making new java classes for downloading the data from the async task
   method and then creating other classes one for the photos for adding various fields to the
   photo class like title , author , author_id.
   \and the getflickrjson data class for parsing the data downloading in this this class and 
    to be called later in the main activity class...




     20th june
  ===============

1.Starting off today by adding some info regarding my project....

2. In my app i have basically used the concept of notifying the calling class that the data has been
   downloaded and made avialabke to it.

3. so here the basic concept that i have used is that calling class uses the getrawdata to download the 
   data from the url and getrawdata then does the downloading and when its finished it calls the class
   back using the callback method.

4. ending today with setting up the layout interface of my app by using various widgets like cardview,
   scrollbar view , textview , imageview etc.

5. forgot to add also used the concept of the nesting linear layouts with the Photo detail ativity.
   and also added various features to the widgets by changing their attributes like layout weight etc.



    21st june
  =============

1. starting off today by writing the code for the recycler view adapter and creating other java aclasses
   needed.

2. just added code for the layout design for my app.



     24th june
   =============

1. just starting off today by adding code to the onbindviewholder method used in my code to download the 
   images and show them on the call from the layout.

2. got the picasso added to my app working perfectly along with the recyclerview and also used the adapters
   along with it in order to put the data into the adapter.


   links for more info: https://developer.android.com/reference/android/support/v7/widget/RecyclerView.OnItemTouchListener.html

3. added the code for the gesture detectors in my app for viewing the image in app not only in a thumbnail but 
   full image on the other screen properly by adding feature for long press and press while tapping onto the images.

   for more info : https://www.littlerobots.nl/blog/Handle-Android-RecyclerView-Clicks/

4. added the code for the touch events under the class Recycleritemclicklistener.

   more info : https://developer.android.com/reference/android/view/GestureDetector.SimpleOnGestureListener.html


    25th june
  =============

1. starting off today by adding the code for handling the touch events in my app.

2. after the functionality of adding the touch events with the help of the concepts of the gestures now
   adding code for displaying the full photo when one of the items in the recycler view gets clicked or 
   tapped.

3. just started writing code for the photo details activity in order to display the photo in the full screen.

4. completed adding code for photodetailsactivity and made add working now photo can be seen by pressing on 
   it in next page.


     27th june
   =============

1. Starting off today by using the googles most used concept in designing layouts...
   MATERIAL DESIGN - It relates to how the applications we create look and how our users interact with our 
                     apps.

   for more info : https://material.io/design/

                 : https://www.materialpalette.com/icons

2. Another thing that i bave added to my app is the funtionality or the support for the older versions of
   the android.ie the Backwards compatibility.
    
   for more info : https://developer.android.com/topic/libraries/support-library/index.html

3. just starting off by changing the theme style and the colours for my app by using the material designs
   principles as defined by the google.

4. just made a few changes for the bakgroud color  and other changes for the themes and styles for the app.

   for more info : https://developer.android.com/guide/topics/ui/themes.html

5. ending today with some other material design changes to the stylw sheets of the app.


      29th june
   ===============

1. starting off today by adding v21 styles sheet to my app nd changing the colour of the navigationbar.

2 just made some minor changes for handeling the string hardcoded text warnings.\

3. also added search menu to app and added the code for it but not made workinhg till now will be working
   soon.




       1st july
    =============

1. Just starting off today by adding a search view for my app so that search option can be made usefull.

2. for making the code for search view configurable just took idea from the below site.
   for more info : https://developer.android.com/reference/android/support/v7/widget/SearchView.html

                 : https://developer.android.com/training/search/setup.html





















               for more info do follow............:)





         BY ESHAN_BEHAL





