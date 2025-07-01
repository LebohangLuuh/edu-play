package Afrikaans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Shapes_Slider;
import com.example.edu_play.R;

public class Shapes_Afr extends AppCompatActivity {

    ViewPager viewPager;
    Shapes_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_afr);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Shapes_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}