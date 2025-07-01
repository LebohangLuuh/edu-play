package Zulu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Alphabets_Slider;
import com.example.edu_play.R;

public class Alphabets_Zulu extends AppCompatActivity {

    ViewPager viewPager;
    Alphabets_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_zulu);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Alphabets_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}