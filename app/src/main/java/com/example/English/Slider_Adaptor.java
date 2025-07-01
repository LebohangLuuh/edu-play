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

public class Slider_Adaptor extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public int[] list_Images = new int[]{
            R.drawable.aa,
            R.drawable.ee,
            R.drawable.ii,
            R.drawable.oo,
            R.drawable.uu,
    };

    public String[] list_Letter = {
            "Letter Aa",
            "Letter Ee",
            "Letter Ii",
            "Letter Oo",
            "Letter Uu"
    };

    public String[] list_Letter_Desc = {
            "Letter Aa sounds like aah",
            "Letter Ee sounds like eeh",
            "Letter Ii sounds like iii",
            "Letter Oo sounds like ohh",
            "Letter Uu sounds like uhh"
    };

    public int[] list_B_Color = new int[]{
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
            Color.rgb(255, 175, 66),
    };

    public Slider_Adaptor(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.vowel_slider, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.vowel_Slider);
        ImageView imageView = view.findViewById(R.id.vowel_img_slider);
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
