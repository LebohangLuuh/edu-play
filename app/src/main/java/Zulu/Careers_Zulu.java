package Zulu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Careers_Slider;
import com.example.edu_play.R;

public class Careers_Zulu extends AppCompatActivity {

    ViewPager viewPager;
    Careers_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careers_zulu);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Careers_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}