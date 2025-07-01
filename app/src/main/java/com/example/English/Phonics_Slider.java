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

public class Phonics_Slider extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public int[] list_Images = {
            R.drawable.aaa,
            R.drawable.bee,
            R.drawable.cee,
            R.drawable.dee,
            R.drawable.eee,
            R.drawable.fff,
            R.drawable.gee,
            R.drawable.hhh,
            R.drawable.iii,
            R.drawable.jay,
            R.drawable.kay,
            R.drawable.ell,
            R.drawable.mmm,
            R.drawable.nnn,
            R.drawable.ou,
            R.drawable.pii,
            R.drawable.que,
            R.drawable.rrr,
            R.drawable.sss,
            R.drawable.tee,
            R.drawable.uuu,
            R.drawable.vee,
            R.drawable.www,
            R.drawable.xxx,
            R.drawable.yyy,
            R.drawable.zet,
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

    public Phonics_Slider(Context context) {
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
