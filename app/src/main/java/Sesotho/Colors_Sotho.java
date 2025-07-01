package Sesotho;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Colors_Slider;
import com.example.edu_play.R;

public class Colors_Sotho extends AppCompatActivity {

    ViewPager viewPager;
    Colors_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors_sotho);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Colors_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}