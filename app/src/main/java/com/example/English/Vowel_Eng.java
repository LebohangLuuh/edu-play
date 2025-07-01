package com.example.English;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.edu_play.R;


public class Vowel_Eng extends AppCompatActivity {

    ViewPager viewPager;
    Slider_Adaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel_eng);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Slider_Adaptor(this);
        viewPager.setAdapter(adaptor);
    }
}