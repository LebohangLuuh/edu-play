package Zulu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.English.Money_Slider;
import com.example.edu_play.R;

public class Money_Zulu extends AppCompatActivity {

    ViewPager viewPager;
    Money_Slider adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_zulu);

        viewPager = findViewById(R.id.viewPager);
        adaptor = new Money_Slider(this);
        viewPager.setAdapter(adaptor);
    }
}