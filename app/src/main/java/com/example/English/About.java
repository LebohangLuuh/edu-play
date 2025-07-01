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

        ImageButton buttonFaceBook = findViewById(R.id.Face_Book);
        ImageButton buttonApp = findViewById(R.id.whats_App);

        buttonApp.setOnClickListener(v -> {
            String urlApp = "https://chat.whatsapp.com/I7Ni1m74Nfk8LKTHOCAasu";
            Intent intentApp = new Intent(Intent.ACTION_VIEW);
            intentApp.setData(Uri.parse(urlApp));
            try {
                startActivity(intentApp);
            } catch (Exception e) {
                // Handle case where no app can handle this intent
                e.printStackTrace();
            }
        });
        buttonFaceBook.setOnClickListener(v -> {
            String urlFB = "https://www.fb.com/profile.php?id=100095021507007";
            Intent intentFB = new Intent(Intent.ACTION_VIEW);
            intentFB.setData(Uri.parse(urlFB));
            try {
                startActivity(intentFB);
            } catch (Exception e) {
                // Handle case where no app can handle this intent
                e.printStackTrace();
            }
        });
    }
}