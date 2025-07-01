package com.example.English;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.edu_play.R;

public class Provinces extends AppCompatActivity {

    ViewPager viewPager;
    Provinces_Slider adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronvices);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Provinces_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}