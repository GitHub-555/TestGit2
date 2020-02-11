package com.example.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    boolean tomIsShowing = true;

    public void fade(View view)
    {
        Log.i("Info","Image tapped");

        ImageView tomImageView = (ImageView) findViewById(R.id.tomImageView);
        ImageView jerryImageView = (ImageView) findViewById(R.id.jerryImageView);

        if(tomIsShowing)
        {
            tomImageView.animate().alpha(0).setDuration(2000);
            jerryImageView.animate().alpha(1).setDuration(2000);
        }
        else
        {
            tomImageView.animate().alpha(1).setDuration(2000);
            jerryImageView.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
