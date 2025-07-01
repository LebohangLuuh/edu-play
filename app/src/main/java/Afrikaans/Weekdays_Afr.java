package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Weekdays_Slider;
import com.example.edu_play.R;

public class Weekdays_Afr extends AppCompatActivity {

    ViewPager viewPager;
    Weekdays_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekdays_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Weekdays_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}