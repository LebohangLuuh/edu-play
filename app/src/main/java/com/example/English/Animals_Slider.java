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

public class Animals_Slider extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public int[] list_Images = {
            R.drawable.monday,
            R.drawable.tuesday,
            R.drawable.wednesday,
            R.drawable.thursday,
            R.drawable.friday,
            R.drawable.saturday,
            R.drawable.sunday,
            R.drawable.monday,
            R.drawable.tuesday,
            R.drawable.wednesday,
            R.drawable.thursday,
            R.drawable.friday,
            R.drawable.saturday,
            R.drawable.sunday,
            R.drawable.monday,
            R.drawable.tuesday,
            R.drawable.wednesday,
            R.drawable.thursday,
            R.drawable.friday,
            R.drawable.saturday,
            R.drawable.sunday,
            R.drawable.monday,
            R.drawable.tuesday,
            R.drawable.wednesday,
            R.drawable.thursday,
            R.drawable.friday,
    };

    public String[] list_Letter = {
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
    };

    public String[] list_Letter_Desc = {
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
            "saturday is the sixth day of the week",
            "sunday is the seventh day of the week",
            "monday is the first day of the week",
            "tuesday is the second day of the week",
            "wednesday is the third day of the week",
            "thursday is the forth day of the week",
            "friday is the fifth day of the week",
    };

    public int[] list_B_Color = new int[]{
            Color.rgb(255, 175, 66), //first slide
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66), //first slide
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66), //first slide
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66), //first slide
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(0, 0, 255), //sec etc
    };

    public Animals_Slider(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.weekday_slider, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.Weekdays_Slider);
        ImageView imageView = view.findViewById(R.id.Weekdays_img_slider);
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
