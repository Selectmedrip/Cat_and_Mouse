package com.example.catmouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {
        ImageView TomImage = findViewById(R.id.tomImage);
        TomImage.animate().alpha(0).setDuration(3000);
        ImageView jerryImage = findViewById(R.id.jerryImage);
        jerryImage.animate().alpha(1).setDuration(3000);
    }
}