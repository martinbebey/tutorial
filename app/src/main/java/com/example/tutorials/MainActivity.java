//Videos are numbered from left to right starting from the top row
//Enjoy :D

package com.example.tutorials;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.tutorials.R;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    //public ImageView playImage;
    private String thisClass = this.getClass().getName();
    public static boolean speedLockoutPopupIsEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(thisClass, "started main activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LayoutInflater inflater = this.getLayoutInflater();
//        View view = inflater.inflate(R.layout.activity_main, null);
//        playImage = view.findViewById(R.id.video1_button);//.video1_play_image);
//        if(playImage == null)
//        {
//            Log.d(thisClass, "onCreate: playimage is null");
//        }
//        playImage.setImageResource(R.drawable.ic_media_play);


        //Add back button
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Instantiate an ImageView and define its properties for play image
        //Log.i(thisClass, "loading video play images");
        //SetPlayImage();



//        //video 1
//        VideoView videoView1 = findViewById(R.id.video_view1);
//        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.video;
//        Uri uri1 = Uri.parse(videoPath1);
//        videoView1.setVideoURI(uri1);
//        MediaController mediaController1 = new MediaController(this);
//        videoView1.setMediaController(mediaController1);
//        mediaController1.setAnchorView(videoView1);
//
//        //video 2
//        VideoView videoView2 = findViewById(R.id.video_view2);
//        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.video;
//        Uri uri2 = Uri.parse(videoPath2);
//        videoView2.setVideoURI(uri2);
//        MediaController mediaController2 = new MediaController(this);
//        videoView2.setMediaController(mediaController2);
//        mediaController2.setAnchorView(videoView2);
//
//        //video 3
//        VideoView videoView3 = findViewById(R.id.video_view3);
//        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.video;
//        Uri uri3 = Uri.parse(videoPath3);
//        videoView3.setVideoURI(uri3);
//        MediaController mediaController3 = new MediaController(this);
//        videoView3.setMediaController(mediaController3);
//        mediaController3.setAnchorView(videoView3);
//
//        //video 4
//        VideoView videoView4 = findViewById(R.id.video_view4);
//        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.video;
//        Uri uri4 = Uri.parse(videoPath4);
//        videoView4.setVideoURI(uri4);
//        MediaController mediaController4 = new MediaController(this);
//        videoView4.setMediaController(mediaController4);
//        mediaController4.setAnchorView(videoView4);
    }

//    private void SetPlayImage()
//    {
//        playImage = findViewById(R.id.video1_play_image);
//
//        playImage.setImageResource(R.drawable.ic_media_play);
//        //i.setContentDescription(getResources().getString(R.string.my_image_desc));
//
//        // set the ImageView bounds to match the Drawable's dimensions
//        playImage.setAdjustViewBounds(true);
//        playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        playImage = findViewById(R.id.video2_play_image);
//
//        playImage.setImageResource(R.drawable.ic_media_play);
//        //i.setContentDescription(getResources().getString(R.string.my_image_desc));
//
//        // set the ImageView bounds to match the Drawable's dimensions
//        playImage.setAdjustViewBounds(true);
//        playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        playImage = findViewById(R.id.video3_play_image);
//
//        playImage.setImageResource(R.drawable.ic_media_play);
//        //i.setContentDescription(getResources().getString(R.string.my_image_desc));
//
//        // set the ImageView bounds to match the Drawable's dimensions
//        playImage.setAdjustViewBounds(true);
//        playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        playImage = findViewById(R.id.video4_play_image);
//
//        playImage.setImageResource(R.drawable.ic_media_play);
//        //i.setContentDescription(getResources().getString(R.string.my_image_desc));
//
//        // set the ImageView bounds to match the Drawable's dimensions
//        playImage.setAdjustViewBounds(true);
//        playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));
//    }

    /** Called when the user taps the Continue button */
    public void Continue(View view)
    {
        Log.i(thisClass, "continue button pressed");
        Intent intent = new Intent(this, CompleteScreenActivity.class);
        startActivity(intent);
    }

    public void UpdateVideoProgressBar(int videoID)
    {
        Log.i(thisClass, "started UpdateVideoProgressBar");
        switch (videoID)
        {
            case R.id.video1_play_image:
            case R.id.video1_button:
                Log.i(thisClass, "updating video1 progress bar");
                Log.i(thisClass, "video1IsComplete value -> " + VideoPlayerActivity.video1IsComplete);
                // Instantiate an ImageView and define its properties for play image
               // playImage = findViewById(R.id.video1_play_image);

                if (VideoPlayerActivity.video1IsComplete)
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }
                break;

            case R.id.video2_play_image:
            case R.id.video2_button:
                // Instantiate an ImageView and define its properties for play image
                Log.i(thisClass, "updating video2 progress bar");
                Log.i(thisClass, "video2IsComplete value -> " + VideoPlayerActivity.video2IsComplete);
                //playImage = findViewById(R.id.video2_play_image);

                if (VideoPlayerActivity.video2IsComplete)
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }
                break;

            case R.id.video3_play_image:
            case R.id.video3_button:
                // Instantiate an ImageView and define its properties for play image
                Log.i(thisClass, "updating video3 progress bar");
                Log.i(thisClass, "video3IsComplete value -> " + VideoPlayerActivity.video3IsComplete);
                //playImage = findViewById(R.id.video3_play_image);

                if (VideoPlayerActivity.video3IsComplete)
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }
                break;

            case R.id.video4_play_image:
            case R.id.video4_button:
                // Instantiate an ImageView and define its properties for play image
                Log.i(thisClass, "updating video4 progress bar");
                Log.i(thisClass, "video4IsComplete value -> " + VideoPlayerActivity.video4IsComplete);
                //playImage = findViewById(R.id.video4_play_image);

                if (VideoPlayerActivity.video4IsComplete)
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }
                break;
        }
    }

    /** Called when the user taps a video button */
    public void PlayVideo(View view)
    {
        Log.i(thisClass, "begin PlayVideo");
        Intent intent = new Intent(this, VideoPlayerActivity.class);

        Thread thread = new Thread()
        {
            public void run()
            {

                TextView videoTitle;

                switch(view.getId())
                {
                    case R.id.video1_play_image:
                    case R.id.video1_button:
                        Log.i(thisClass, "begin play video 1");
                        intent.putExtra("videoNumber","1");
                        videoTitle = (TextView)findViewById(R.id.video1_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;

                    case R.id.video2_play_image:
                    case R.id.video2_button:
                        Log.i(thisClass, "begin play video 2");
                        intent.putExtra("videoNumber","2");
                        videoTitle = (TextView)findViewById(R.id.video2_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;

                    case R.id.video3_play_image:
                    case R.id.video3_button:
                        Log.i(thisClass, "begin play video 3");
                        intent.putExtra("videoNumber","3");
                        videoTitle = (TextView)findViewById(R.id.video3_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;

                    case R.id.video4_play_image:
                    case R.id.video4_button:
                        Log.i(thisClass, "begin play video 4");
                        intent.putExtra("videoNumber","4");
                        videoTitle = (TextView)findViewById(R.id.video4_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;
                }

                //startActivity(intent);

                while(!VideoPlayerActivity.videoIsClosed)
                {

                }

                Log.i(thisClass, "videoIsClosed value -> " + VideoPlayerActivity.videoIsClosed);

                UpdateVideoProgressBar(view.getId());
            }
        };
        thread.start();

    }

    /** Called when the user taps the back button */
    public void ReturnToPreviousScreen(View view)
    {
        Log.i(thisClass, "back button selected");
        this.finish();
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)//previous screen button
//    {
//        int id = item.getItemId();
//
//        if(id == android.R.id.home)
//        {
//            this.finish();
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    //monitor change in language settings
    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        Log.i(thisClass, "begin onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
        // your code here, you can use newConfig.locale if you need to check the language
        // or just re-set all the labels to desired string resource
        UpdateLanguage();
    }

    //to update language based on language setting
    public void UpdateLanguage()
    {
        Log.i(thisClass, "begin UpdateLanguage");
        //get system locale
        Locale myLocale = new Locale(Resources.getSystem().getConfiguration().locale.getLanguage());

        //set app locale
        myLocale.setDefault(new Locale("en", "US"));
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);

        //refresh page
        Intent refresh = new Intent(this, MainActivity.class);
        finish();
        startActivity(refresh);
    }
}
