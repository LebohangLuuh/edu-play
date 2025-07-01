package com.example.English;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.edu_play.R;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageButton buttonFace_Book = findViewById(R.id.Face_Book);
        ImageButton buttonApp = findViewById(R.id.whats_App);

        buttonApp.setOnClickListener(v -> {
            String url_App = "https://chat.whatsapp.com/I7Ni1m74Nfk8LKTHOCAasu";
            Intent intentApp = new Intent(Intent.ACTION_VIEW);
            intentApp.setData(Uri.parse(url_App));
            startActivity(intentApp);
        });
        buttonFace_Book.setOnClickListener(v -> {
            String url_FB = "https://www.fb.com/profile.php?id=100095021507007";
            Intent intent_FB = new Intent(Intent.ACTION_VIEW);
            intent_FB.setData(Uri.parse(url_FB));
            startActivity(intent_FB);
        });
    }
}