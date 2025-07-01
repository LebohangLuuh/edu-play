package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Seasons_Slider_Adaptor;
import com.example.edu_play.R;

public class Seasons_Afr extends AppCompatActivity {

    ViewPager viewPager;
    Seasons_Slider_Adaptor adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Seasons_Slider_Adaptor(this);
        viewPager.setAdapter(adaptor);
    }
}