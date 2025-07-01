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

public class traffic_Light_Slider extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public int[] list_Images = {
            R.drawable.winter,
            R.drawable.summer,
            R.drawable.autumn,

    };

    public String[] list_Letter = {
            "Red",
            "Yellow",
            "Green",

    };

    public String[] list_Letter_Desc = {
            "Red means stop",
            "Yellow means prepare to stop ahead",
            "Green means you are allowed to pass",

    };

    public int[] list_B_Color = new int[]{
            Color.rgb(255, 175, 66), //first slide
            Color.rgb(0, 0, 255), //sec etc
            Color.rgb(255, 175, 66),
    };

    public traffic_Light_Slider(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.seasons_slider, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.seasons_Slider);
        ImageView imageView = view.findViewById(R.id.seasons_img_slider);
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
