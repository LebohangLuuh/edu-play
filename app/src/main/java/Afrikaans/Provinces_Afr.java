package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Provinces_Slider;
import com.example.edu_play.R;

public class Provinces_Afr extends AppCompatActivity {

    ViewPager viewPager;
    Provinces_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinces_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Provinces_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}