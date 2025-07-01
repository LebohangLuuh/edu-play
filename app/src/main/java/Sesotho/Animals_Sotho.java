package Sesotho;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Animals_Slider;
import com.example.edu_play.R;

public class Animals_Sotho extends AppCompatActivity {

    ViewPager viewPager;
    Animals_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_sotho);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Animals_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}