package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Planets_Slider;
import com.example.edu_play.R;

public class Planets_Afr extends AppCompatActivity {

    ViewPager viewPager;
    Planets_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Planets_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}