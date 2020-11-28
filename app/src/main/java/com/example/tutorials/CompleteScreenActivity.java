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

//        //Add back button
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //load the all apps icon
//        ImageView iv= findViewById(R.id.apps_image);
//        //String path = "android.resource://" + getPackageName() + "/" + R.raw.apps;
//        InputStream is = this.getResources().openRawResource(R.raw.apps);//new FileInputStream(path);
//        Drawable icon = new BitmapDrawable(is);
////        Log.i("Fnord", "width="+icon.getIntrinsicWidth()+
////                " height="+icon.getIntrinsicHeight());
//        iv.setImageDrawable(icon);


    }

    /** Called when the user taps the exit tutorial button */
    public void ExitTutorial(View view)
    {
        Log.i(thisClass, "exit tutorial button pressed");
        this.finish();
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

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)//previous screen button substitute function
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
}
