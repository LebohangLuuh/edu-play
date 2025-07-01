package Sesotho;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Calender_Slider;
import com.example.edu_play.R;

public class Calender_Sotho extends AppCompatActivity {

    ViewPager viewPager;
    Calender_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_sotho);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Calender_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}