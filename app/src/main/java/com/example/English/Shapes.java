package com.example.English;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.edu_play.R;

public class Shapes extends AppCompatActivity {

    ViewPager viewPager;
    Shapes_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Shapes_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}