package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.traffic_Light_Slider;
import com.example.edu_play.R;

public class Traffic_Light_Afr extends AppCompatActivity {

    ViewPager viewPager;
    traffic_Light_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_light_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new traffic_Light_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}