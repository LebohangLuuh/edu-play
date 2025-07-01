package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Slider_Adaptor;
import com.example.edu_play.R;

public class Vowels_Afr extends AppCompatActivity {
    ViewPager viewPager;
    Slider_Adaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowels_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Slider_Adaptor(this);
        viewPager.setAdapter(adaptor);
    }
}