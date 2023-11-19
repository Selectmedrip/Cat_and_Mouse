package com.example.catmouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 boolean youSawTom = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void eraseTom(View view) {
        if(youSawTom) {
            ImageView TomImage = findViewById(R.id.tomImage);
            TomImage.animate().alpha(0).rotation(TomImage.getRotation() + 3600).scaleY(0).scaleX(0).setDuration(3000);
            ImageView jerryImage = findViewById(R.id.jerryImage);
            jerryImage.animate().alpha(1).rotation(jerryImage.getRotation() + 3600).scaleY(1).scaleX(1).setDuration(3000);

            youSawTom = false;
        } else {
            ImageView TomImage = findViewById(R.id.tomImage);
            TomImage.animate().alpha(1).rotation(TomImage.getRotation() + 3600).scaleY(1).scaleX(1).setDuration(3000);
            ImageView jerryImage = findViewById(R.id.jerryImage);
            jerryImage.animate().alpha(0).rotation(jerryImage.getRotation() + 3600).scaleY(0).scaleX(0).setDuration(3000);
            youSawTom = true;
        }
    }

    public void vklad(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this, UsingVideo.class);
        startActivity(intent);
    }
}