package com.example.English;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.edu_play.R;

public class Calender_Slider extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public int[] list_Images = {
            R.drawable.january,
            R.drawable.february,
            R.drawable.march,
            R.drawable.april,
            R.drawable.may,
            R.drawable.june,
            R.drawable.july,
            R.drawable.august,
            R.drawable.september,
            R.drawable.october,
            R.drawable.november,
            R.drawable.decemnber,
    };

    public String[] list_Letter = {
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "sunday is the seventh day of the week",
    };

    public String[] list_Letter_Desc = {
            "monday is the first day of the week for work or school",
            "tuesday is the second day of the week for work or school",
            "wednesday is the third day of the week for work or school",
            "thursday is the forth day of the week for work or school",
            "friday is the fifth day of the week and the beginning of weekend",
            "saturday is weekend",
            "sunday is the day for church",
            "thursday is the forth day of the week for work or school",
            "friday is the fifth day of the week and the beginning of weekend",
            "saturday is weekend",
            "sunday is the day for church",
            "sunday is the day for church",
    };

    public int[] list_B_Color = new int[]{
            Color.rgb(255, 175, 66), //first slide
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
    };

    public Calender_Slider(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.planets_slider, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.Planet_Slider);
        ImageView imageView = view.findViewById(R.id.Planets_img_slider);
        linearLayout.setBackgroundColor(list_B_Color[position]);
        imageView.setImageResource(list_Images[position]);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return list_Letter.length;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }
}
