package com.example.catmouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 boolean youSawTom = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView TomImage = findViewById(R.id.tomImage);
        TomImage.animate().scaleY(0.5f).scaleX(0.5f).setDuration(3000);
    }

    public void eraseTom(View view) {
        if(youSawTom) {
            ImageView TomImage = findViewById(R.id.tomImage);
            TomImage.animate().alpha(0).setDuration(3000);
            ImageView jerryImage = findViewById(R.id.jerryImage);
            jerryImage.animate().alpha(1).setDuration(3000);

            youSawTom = false;
        } else {
            ImageView TomImage = findViewById(R.id.tomImage);
            TomImage.animate().alpha(1).setDuration(3000);
            ImageView jerryImage = findViewById(R.id.jerryImage);
            jerryImage.animate().alpha(0).setDuration(3000);
            youSawTom = true;
        }
    }
}