package com.example.tutorials;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.tutorials.R;

import java.io.FileInputStream;
import java.io.InputStream;

public class CompleteScreenActivity extends AppCompatActivity
{

    private String thisClass = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_screen);
        Log.i(thisClass, "started ");
    }

    /** Called when the user taps the exit tutorial button */
    public void ExitTutorial(View view)
    {
        Log.i(thisClass, "exit tutorial button pressed");

        //reset tutorials complete status
        VideoPlayerActivity.video1IsComplete = false;
        VideoPlayerActivity.video2IsComplete = false;
        VideoPlayerActivity.video3IsComplete = false;
        VideoPlayerActivity.video4IsComplete = false;
        this.finish();

        //Reset the main screen
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);

        //return to the device's main screen
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }

    /** Called when the user taps the back button */
    public void ReturnToPreviousScreen(View view)
    {
        Log.i(thisClass, "back button pressed. Now closing");
        this.finish();
    }
}
