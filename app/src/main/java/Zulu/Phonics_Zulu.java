package Zulu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Phonics_Slider;
import com.example.edu_play.R;

public class Phonics_Zulu extends AppCompatActivity {

    ViewPager viewPager;
    Phonics_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonics_zulu);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Phonics_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}