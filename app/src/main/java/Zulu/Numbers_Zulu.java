package Zulu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Numbers_Slider;
import com.example.edu_play.R;

public class Numbers_Zulu extends AppCompatActivity {

    ViewPager viewPager;
    Numbers_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_zulu);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Numbers_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}