package Afrikaans;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.English.MainActivity;
import com.example.edu_play.R;
import com.google.android.material.navigation.NavigationView;

import Sesotho.Sesotho_Version;
import Zulu.Zulu_Version;

public class Afrikaans_Version extends AppCompatActivity {

    MediaPlayer startupSong;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private void  StartupSong()
    {
        startupSong = MediaPlayer.create(this,R.raw.stimela);
        startupSong.setOnCompletionListener(mp -> startupSong.release());
        startupSong.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        StartupSong();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrikaans_version);

        toolbar = findViewById(R.id.toolbar_Afr);
        drawerLayout = findViewById(R.id.drawer_Layout);
        navigationView = findViewById(R.id.nav_view_Afr);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));

        navigationView.setNavigationItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.about_App)
            {
                Intent intent = new Intent(Afrikaans_Version.this, About_Afr.class);
                startActivity(intent);
                startupSong.stop();
            } else if (menuItem.getItemId() == R.id.exit_App)
            {
                new AlertDialog.Builder(Afrikaans_Version.this)
                        .setMessage("Exit the App?").setCancelable(false)
                        .setPositiveButton("Yes", (dialog, which) -> finish()).setNegativeButton("No",null).show();
                startupSong.stop();
            }
            else if (menuItem.getItemId() == R.id.share_App)
            {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String subject = "Edu-Play App";
                String body = "Check this educational application for toddlers with multiple activities to learn from \nhttps://github.com/LebohangLuuh"; // include the app link
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
                shareIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(shareIntent,"Share Via"));
            }else if (menuItem.getItemId() == R.id.Eng_Version)
            {
                startupSong.stop();
                Intent intentEnglish = new Intent(Afrikaans_Version.this, MainActivity.class);
                startActivity(intentEnglish);
            }
            else if (menuItem.getItemId() == R.id.Sesotho_Version)
            {
                startupSong.stop();
                Intent intent_Sotho = new Intent(this, Sesotho_Version.class);
                startActivity(intent_Sotho);
            }
            else if (menuItem.getItemId() == R.id.Zulu_Version)
            {
                startupSong.stop();
                Intent intent_Zulu = new Intent(this, Zulu_Version.class);
                startActivity(intent_Zulu);
            }else if (menuItem.getItemId() == R.id.Afr_Version)
            {
                startupSong.stop();
                Intent intent_Afr = new Intent(this, Afrikaans_Version.class);
                startActivity(intent_Afr);
            }
            return true;
        });

        ImageButton buttonVowels = findViewById(R.id.vowels_Afr);
        ImageButton buttonAlphabets = findViewById(R.id.alphabets_Afr);
        ImageButton buttonCalendar = findViewById(R.id.calendar_Afr);
        ImageButton buttonCareers = findViewById(R.id.careers_Afr);
        ImageButton buttonColors = findViewById(R.id.colors_Afr);
        ImageButton buttonCount = findViewById(R.id.count_Afr);
        ImageButton buttonDays = findViewById(R.id.days_Afr);
        ImageButton buttonMoney = findViewById(R.id.money_Afr);
        ImageButton buttonPhonics = findViewById(R.id.phonics_Afr);
        ImageButton buttonProvince = findViewById(R.id.province_Afr);
        ImageButton buttonSeasons = findViewById(R.id.seasons_Afr);
        ImageButton buttonShapes = findViewById(R.id.shapes_Afr);
        ImageButton buttonAnimals = findViewById(R.id.animals_Afr);
        ImageButton buttonTraffic_Light = findViewById(R.id.traffic_Light_Afr);
        ImageButton buttonPlanets = findViewById(R.id.planets_Afr);

        buttonVowels.setOnClickListener(v -> {

            Intent intent_Afr = new Intent(Afrikaans_Version.this, Vowels_Afr.class);
            startActivity(intent_Afr);
            startupSong.stop();
        });
        buttonDays.setOnClickListener(v -> {

            Intent intentDays_Afr = new Intent(Afrikaans_Version.this, Weekdays_Afr.class);
            startActivity(intentDays_Afr);
            startupSong.stop();
        });
        buttonMoney.setOnClickListener(v -> {

            Intent intentMoney_Afr = new Intent(Afrikaans_Version.this, Money_Afr.class);
            startActivity(intentMoney_Afr);
            startupSong.stop();
        });
        buttonPhonics.setOnClickListener(v -> {

            Intent intentPhonics_Afr = new Intent(Afrikaans_Version.this, Phonics_Afr.class);
            startActivity(intentPhonics_Afr);
            startupSong.stop();
        });
        buttonSeasons.setOnClickListener(v -> {

            Intent intentSeason_Afr = new Intent(Afrikaans_Version.this, Seasons_Afr.class);
            startActivity(intentSeason_Afr);
            startupSong.stop();
        });
        buttonShapes.setOnClickListener(v -> {

            Intent intentShapes_Afr = new Intent(Afrikaans_Version.this, Shapes_Afr.class);
            startActivity(intentShapes_Afr);
            startupSong.stop();
        });
        buttonProvince.setOnClickListener(v -> {

            Intent intentProvince_Afr = new Intent(Afrikaans_Version.this, Provinces_Afr.class);
            startActivity(intentProvince_Afr);
            startupSong.stop();
        });
        buttonCareers.setOnClickListener(v -> {

            Intent intentCareer_Afr = new Intent(Afrikaans_Version.this, Career_Afr.class);
            startActivity(intentCareer_Afr);
            startupSong.stop();
        });
        buttonCalendar.setOnClickListener(v -> {

            Intent intentCalender_Afr = new Intent(Afrikaans_Version.this, Calender_Afr.class);
            startActivity(intentCalender_Afr);
            startupSong.stop();
        });
        buttonCount.setOnClickListener(v -> {

            Intent intentCount_Afr = new Intent(Afrikaans_Version.this, Numbers_Afr.class);
            startActivity(intentCount_Afr);
            startupSong.stop();
        });
        buttonColors.setOnClickListener(v -> {

            Intent intentColor_Afr = new Intent(Afrikaans_Version.this, Colors_Afr.class);
            startActivity(intentColor_Afr);
            startupSong.stop();
        });
        buttonAlphabets.setOnClickListener(v -> {

            Intent intentAlphabet_Afr= new Intent(Afrikaans_Version.this, Alphabets_Afr.class);
            startActivity(intentAlphabet_Afr);
            startupSong.stop();
        });
        buttonTraffic_Light.setOnClickListener(v -> {

            Intent intentRobot_Afr = new Intent(Afrikaans_Version.this, Traffic_Light_Afr.class);
            startActivity(intentRobot_Afr);
            startupSong.stop();
        });
        buttonPlanets.setOnClickListener(v -> {

            Intent intentPlanet_Afr = new Intent(Afrikaans_Version.this, Planets_Afr.class);
            startActivity(intentPlanet_Afr);
            startupSong.stop();
        });
        buttonAnimals.setOnClickListener(v -> {

            Intent intentAnimal_Afr = new Intent(Afrikaans_Version.this, Animals_Afr.class);
            startActivity(intentAnimal_Afr);
            startupSong.stop();
        });

    }
}