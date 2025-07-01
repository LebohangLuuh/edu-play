package Sesotho;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.edu_play.R;

public class Planets_Sotho extends AppCompatActivity {

    ViewPager viewPager;
    Planets_Sotho_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets_sotho);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Planets_Sotho_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}