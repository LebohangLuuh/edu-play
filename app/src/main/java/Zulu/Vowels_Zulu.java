package Zulu;

import static com.example.edu_play.R.layout.activity_vowels_zulu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Slider_Adaptor;
import com.example.edu_play.R;

public class Vowels_Zulu extends AppCompatActivity {

    ViewPager viewPager;
    Slider_Adaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_vowels_zulu);

        viewPager = findViewById(R.id.viewPagerZ);
        adaptor = new Slider_Adaptor(this);
        viewPager.setAdapter(adaptor);
    }
}