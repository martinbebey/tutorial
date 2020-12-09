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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.tutorials.R;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class MainActivity extends AppCompatActivity {

    private String thisClass = this.getClass().getName();
    public static Button continueButton;
    public static ImageView video1_play_image;
    public static ImageView video2_play_image;
    public static ImageView video3_play_image;
    public static ImageView video4_play_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(thisClass, "started main activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continueButton = findViewById(R.id.continue_button);

        video1_play_image = findViewById(R.id.video1_play_image);
        video2_play_image = findViewById(R.id.video2_play_image);
        video3_play_image = findViewById(R.id.video3_play_image);
        video4_play_image = findViewById(R.id.video4_play_image);

        continueButton.setVisibility(View.INVISIBLE);//set to invisible until the user has completed the tutorial

        if(VideoPlayerActivity.video1IsComplete && VideoPlayerActivity.video2IsComplete && VideoPlayerActivity.video3IsComplete && VideoPlayerActivity.video4IsComplete)
        {
            findViewById(R.id.continue_button).setVisibility(View.VISIBLE);
        }
    }

    /** Called when the user taps the Continue button */
    public void Continue(View view)
    {
        Log.i(thisClass, "continue button pressed");

        //go to the next screen
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
                break;

            case R.id.video2_play_image:
            case R.id.video2_button:
                Log.i(thisClass, "updating video2 progress bar");
                Log.i(thisClass, "video2IsComplete value -> " + VideoPlayerActivity.video2IsComplete);
                break;

            case R.id.video3_play_image:
            case R.id.video3_button:
                Log.i(thisClass, "updating video3 progress bar");
                Log.i(thisClass, "video3IsComplete value -> " + VideoPlayerActivity.video3IsComplete);
                break;

            case R.id.video4_play_image:
            case R.id.video4_button:
                Log.i(thisClass, "updating video4 progress bar");
                Log.i(thisClass, "video4IsComplete value -> " + VideoPlayerActivity.video4IsComplete);
           break;
        }
    }

    /** Called when the user taps a video button */
    public void PlayVideo(View view)
    {
        view.bringToFront();
        Log.i(thisClass, "begin PlayVideo");
        Intent intent = new Intent(this, VideoPlayerActivity.class);

        Thread thread = new Thread()
        {
            public void run()
            {

                TextView videoTitle;

                switch(view.getId())//start selected video
                {
                    case R.id.video1_button:
                        Log.i(thisClass, "begin play video 1");
                        intent.putExtra("videoNumber","1");
                        videoTitle = (TextView)findViewById(R.id.video1_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;

                    case R.id.video2_button:
                        Log.i(thisClass, "begin play video 2");
                        intent.putExtra("videoNumber","2");
                        videoTitle = (TextView)findViewById(R.id.video2_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;

                    case R.id.video3_button:
                        Log.i(thisClass, "begin play video 3");
                        intent.putExtra("videoNumber","3");
                        videoTitle = (TextView)findViewById(R.id.video3_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;

                    case R.id.video4_button:
                        Log.i(thisClass, "begin play video 4");
                        intent.putExtra("videoNumber","4");
                        videoTitle = (TextView)findViewById(R.id.video4_title);
                        intent.putExtra("videoTitle", videoTitle.getText());
                        startActivity(intent);
                        break;
                }

                while(!VideoPlayerActivity.videoIsClosed)
                {

                }

                UpdateVideoProgressBar(view.getId());
            }
        };
        thread.start();

        Log.i(thisClass, "videoIsClosed value -> " + VideoPlayerActivity.videoIsClosed);
        Log.i(thisClass, "video1IsComplete value -> " + VideoPlayerActivity.video1IsComplete);
        Log.i(thisClass, "video2IsComplete value -> " + VideoPlayerActivity.video2IsComplete);
        Log.i(thisClass, "video3IsComplete value -> " + VideoPlayerActivity.video3IsComplete);
        Log.i(thisClass, "video4IsComplete value -> " + VideoPlayerActivity.video4IsComplete);

    }

    //monitor change in language settings
    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        Log.i(thisClass, "begin onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
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
