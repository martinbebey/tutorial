package com.example.tutorials;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.ImageView;
import android.widget.MediaController;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.tutorials.R;

public class VideoPlayerActivity extends Activity
{

    private TextView textView, captionView;
    private Intent intent;
    private String videoTitle = "video", thisClass = this.getClass().getName();
    private int elapsedTime = 0;
    public static boolean video1IsComplete = false;
    public static boolean video2IsComplete = false;
    public static boolean video3IsComplete = false;
    public static boolean video4IsComplete = false;
    public static boolean videoIsClosed = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        Log.i(thisClass, "started VideoPlayerActivity");

        //getting the title and video from previous page
        intent = getIntent();
        textView = (TextView) findViewById(R.id.video_title);
        textView.setText(intent.getStringExtra("videoTitle"));
        videoTitle += intent.getStringExtra("videoNumber");

        Log.i(thisClass, "selected " + videoTitle);

        //video 1
        if (intent.getStringExtra("videoNumber").equals("1"))
        {
            //preparing the video
            VideoView videoView = findViewById(R.id.videoView);

            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;//"raw/" + videoTitle;
            Uri uri1 = Uri.parse(videoPath);
            videoView.setVideoURI(uri1);
            android.widget.MediaController mediaController = new MediaController(this, false);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            //mediaController.show();
            video1IsComplete = false;

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    video1IsComplete = true;
                    mp.release();
                    Close(findViewById(R.id.close_button));
                }
            });

            videoView.start();

//            while(!video1IsComplete)
//            {
//                elapsedTime = videoView.getDuration();
//
//                if(elapsedTime >= 0 && elapsedTime < 3000)
//                {
//                    captionView.setText(R.string.video1_caption_0sTo3s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else if(elapsedTime >= 3000 && elapsedTime < 6000)
//                {
//                    captionView.setText(R.string.video1_caption_3sTo6s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else if(elapsedTime >= 8000 && elapsedTime < 10000)
//                {
//                    captionView.setText(R.string.video1_caption_8sTo10s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else
//                {
//                    captionView.setText(" ");
//                    captionView.setVisibility(View.INVISIBLE);
//                }
//            }
        }

        //video 2
        if (intent.getStringExtra("videoNumber").equals("2"))
        {
            //preparing the video
            VideoView videoView = findViewById(R.id.videoView);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video2;//+ videoTitle;
            Uri uri1 = Uri.parse(videoPath);
            videoView.setVideoURI(uri1);
            android.widget.MediaController mediaController = new MediaController(this, false);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            video2IsComplete = false;

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    video2IsComplete = true;
                    mp.release();
                    Close(findViewById(R.id.close_button));
                }
            });

            videoView.start();

//            while(!video2IsComplete)
//            {
//                elapsedTime = videoView.getDuration();
//
//                if(elapsedTime >= 0 && elapsedTime < 5000)
//                {
//                    captionView.setText(R.string.video2_caption_0sTo5s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else if(elapsedTime >= 5000 && elapsedTime < 8000)
//                {
//                    captionView.setText(R.string.video2_caption_5sTo8s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else if(elapsedTime >= 8000 && elapsedTime < 19000)
//                {
//                    captionView.setText(R.string.video2_caption_8sTo19s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else
//                {
//                    captionView.setText("");
//                    captionView.setVisibility(View.INVISIBLE);
//                }
//            }
        }

        //video 3
        if (intent.getStringExtra("videoNumber").equals("3"))
        {
            //preparing the video
            VideoView videoView = findViewById(R.id.videoView);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video3;// videoTitle;
            Uri uri1 = Uri.parse(videoPath);
            videoView.setVideoURI(uri1);
            android.widget.MediaController mediaController = new MediaController(this, false);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            video3IsComplete = false;

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    video3IsComplete = true;
                    mp.release();
                    Close(findViewById(R.id.close_button));
                }
            });

            videoView.start();

//            while(!video3IsComplete)
//            {
//                elapsedTime = videoView.getDuration();
//
//                if(elapsedTime >= 0 && elapsedTime < 8000)
//                {
//                    captionView.setText(R.string.video3_caption_0sTo8s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else if(elapsedTime >= 8000 && elapsedTime < 15000)
//                {
//                    captionView.setText(R.string.video3_caption_8sTo15s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else
//                {
//                    captionView.setText("");
//                    captionView.setVisibility(View.INVISIBLE);
//                }
//            }
        }

        //video 4
        if (intent.getStringExtra("videoNumber").equals("4"))
        {
            //preparing the video
            VideoView videoView = findViewById(R.id.videoView);
            String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video4;//+ videoTitle;
            Uri uri1 = Uri.parse(videoPath);
            videoView.setVideoURI(uri1);
            android.widget.MediaController mediaController = new MediaController(this, false);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            video4IsComplete = false;

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    video4IsComplete = true;
                    mp.release();
                    Close(findViewById(R.id.close_button));
                }
            });

            videoView.start();

//            while(!video4IsComplete)
//            {
//                elapsedTime = videoView.getDuration();
//
//                if(elapsedTime >= 0 && elapsedTime < 3000)
//                {
//                    captionView.setText(R.string.video4_caption_0sTo3s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else if(elapsedTime >= 3000 && elapsedTime < 6000)
//                {
//                    captionView.setText(R.string.video4_caption_3sTo6s);
//                    captionView.setVisibility(View.VISIBLE);
//                }
//
//                else
//                {
//                    captionView.setText("");
//                    captionView.setVisibility(View.INVISIBLE);
//                }
//            }
        }

        Log.i(thisClass, "started " + videoTitle);
    }

    /** Called when the user taps the exit (X) button */
    public void Close(View view)
    {
        videoIsClosed = true;
        Log.i(thisClass, "closing video " + videoTitle);

        if(video1IsComplete & video2IsComplete & video3IsComplete & video4IsComplete)
        {
            MainActivity.continueButton.setVisibility(View.VISIBLE);
        }

        switch(intent.getStringExtra("videoNumber").toString())
        {
            case "1":

                if (VideoPlayerActivity.video1IsComplete)
                {
                    ImageView playImage = MainActivity.video1_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    //playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = MainActivity.video1_play_image;
                    //playImage = findViewById(R.id.video1_play_image);
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                break;

            case "2":

                if (VideoPlayerActivity.video2IsComplete)
                {
                    ImageView playImage = MainActivity.video2_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = MainActivity.video2_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                break;

            case "3":

                if (VideoPlayerActivity.video3IsComplete)
                {
                    ImageView playImage = MainActivity.video3_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = MainActivity.video3_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }


                break;

            case "4":

                if (VideoPlayerActivity.video4IsComplete)
                {
                    ImageView playImage = MainActivity.video4_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_full);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                else
                {
                    ImageView playImage = MainActivity.video4_play_image;
                    playImage.setImageResource(R.drawable.ic_media_play_half);
                    playImage.bringToFront();
                    //i.setContentDescription(getResources().getString(R.string.my_image_desc));

                    // set the ImageView bounds to match the Drawable's dimensions
                    playImage.setAdjustViewBounds(true);
//                    playImage.setLayoutParams(new ViewGroup.LayoutParams(
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT));
                }

                break;

        }

        this.finish();
    }
}
