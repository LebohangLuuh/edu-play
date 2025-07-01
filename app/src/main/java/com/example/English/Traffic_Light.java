package com.example.English;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.edu_play.R;
public class Traffic_Light extends AppCompatActivity {

    ViewPager viewPager;
    traffic_Light_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_light);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new traffic_Light_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}