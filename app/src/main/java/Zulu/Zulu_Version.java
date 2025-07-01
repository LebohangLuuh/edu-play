package Zulu;

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

import Afrikaans.Afrikaans_Version;
import Sesotho.Sesotho_Version;

public class Zulu_Version extends AppCompatActivity {


    MediaPlayer startupSong;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private void  StartupSong()
    {
        startupSong = MediaPlayer.create(this, R.raw.stimela);
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
        setContentView(R.layout.activity_zulu_version);

        toolbar = findViewById(R.id.toolbar_Zulu);
        drawerLayout = findViewById(R.id.drawer_Layout);
        navigationView = findViewById(R.id.nav_view_Zulu);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));

        navigationView.setNavigationItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.about_App)
            {
                Intent intent = new Intent(Zulu_Version.this, About_Zulu.class);
                startActivity(intent);
                startupSong.stop();
            } else if (menuItem.getItemId() == R.id.exit_App)
            {
                new AlertDialog.Builder(Zulu_Version.this)
                        .setMessage("Exit the App?").setCancelable(false)
                        .setPositiveButton("Yes", (dialog, which) -> finish()).setNegativeButton("No",null).show();
                startupSong.stop();
            }
            else if (menuItem.getItemId() == R.id.share_App)
            {
                startupSong.stop();
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String subject = "Edu-Play App";
                String body = "Check this educational application for toddlers with multiple activities \nhttps://github.com/LebohangLuuh"; // include the app link
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
                shareIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(shareIntent,"Share Via"));
            }else if (menuItem.getItemId() == R.id.Eng_Version)
            {
                startupSong.stop();
                Intent intentEnglish = new Intent(Zulu_Version.this, MainActivity.class);
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

        ImageButton buttonVowels = findViewById(R.id.vowels_Zulu);
        ImageButton buttonAlphabets = findViewById(R.id.alphabets_Zulu);
        ImageButton buttonCalendar = findViewById(R.id.calendar_Zulu);
        ImageButton buttonCareers = findViewById(R.id.careers_Zulu);
        ImageButton buttonColors = findViewById(R.id.colors_Zulu);
        ImageButton buttonCount = findViewById(R.id.count_Zulu);
        ImageButton buttonDays = findViewById(R.id.days_Zulu);
        ImageButton buttonMoney = findViewById(R.id.money_Zulu);
        ImageButton buttonPhonics = findViewById(R.id.phonics_Zulu);
        ImageButton buttonProvince = findViewById(R.id.province_Zulu);
        ImageButton buttonSeasons = findViewById(R.id.seasons_Zulu);
        ImageButton buttonShapes = findViewById(R.id.shapes_Zulu);
        ImageButton buttonAnimals = findViewById(R.id.animals_Zulu);
        ImageButton buttonTraffic_Light = findViewById(R.id.traffic_Light_Zulu);
        ImageButton buttonPlanets = findViewById(R.id.planets_Zulu);

        buttonVowels.setOnClickListener(v -> {

            Intent intent_Zulu = new Intent(Zulu_Version.this, Vowels_Zulu.class);
            startActivity(intent_Zulu);
            startupSong.stop();
        });
        buttonDays.setOnClickListener(v -> {

            Intent intentDays_Zulu = new Intent(Zulu_Version.this, Weekdays_Zulu.class);
            startActivity(intentDays_Zulu);
            startupSong.stop();
        });
        buttonMoney.setOnClickListener(v -> {

            Intent intentMoney_Zulu = new Intent(Zulu_Version.this, Money_Zulu.class);
            startActivity(intentMoney_Zulu);
            startupSong.stop();
        });
        buttonPhonics.setOnClickListener(v -> {

            Intent intentPhonics_Zulu = new Intent(Zulu_Version.this, Phonics_Zulu.class);
            startActivity(intentPhonics_Zulu);
            startupSong.stop();
        });
        buttonSeasons.setOnClickListener(v -> {

            Intent intentSeason_Zulu = new Intent(Zulu_Version.this, Seasons_Zulu.class);
            startActivity(intentSeason_Zulu);
            startupSong.stop();
        });
        buttonShapes.setOnClickListener(v -> {

            Intent intentShapes_Zulu = new Intent(Zulu_Version.this, Shapes_Zulu.class);
            startActivity(intentShapes_Zulu);
            startupSong.stop();
        });
        buttonProvince.setOnClickListener(v -> {

            Intent intentProvince_Zulu = new Intent(Zulu_Version.this, Provinces_Zulu.class);
            startActivity(intentProvince_Zulu);
            startupSong.stop();
        });
        buttonCareers.setOnClickListener(v -> {

            Intent intentCareer_Zulu = new Intent(Zulu_Version.this, Careers_Zulu.class);
            startActivity(intentCareer_Zulu);
            startupSong.stop();
        });
        buttonCalendar.setOnClickListener(v -> {

            Intent intentCalender_Zulu = new Intent(Zulu_Version.this, Calender_Zulu.class);
            startActivity(intentCalender_Zulu);
            startupSong.stop();
        });
        buttonCount.setOnClickListener(v -> {

            Intent intentCount_Zulu = new Intent(Zulu_Version.this, Numbers_Zulu.class);
            startActivity(intentCount_Zulu);
            startupSong.stop();
        });
        buttonColors.setOnClickListener(v -> {

            Intent intentColor_Zulu = new Intent(Zulu_Version.this, Colors_Zulu.class);
            startActivity(intentColor_Zulu);
            startupSong.stop();
        });
        buttonAlphabets.setOnClickListener(v -> {

            Intent intentAlphabet_Zulu = new Intent(Zulu_Version.this, Alphabets_Zulu.class);
            startActivity(intentAlphabet_Zulu);
            startupSong.stop();
        });
        buttonTraffic_Light.setOnClickListener(v -> {

            Intent intentRobot_Zulu = new Intent(Zulu_Version.this, Traffic_Light_Zulu.class);
            startActivity(intentRobot_Zulu);
            startupSong.stop();
        });
        buttonPlanets.setOnClickListener(v -> {

            Intent intentPlanet_Zulu = new Intent(Zulu_Version.this, Planets_Zulu.class);
            startActivity(intentPlanet_Zulu);
            startupSong.stop();
        });
        buttonAnimals.setOnClickListener(v -> {

            Intent intentAnimal_Zulu = new Intent(Zulu_Version.this, Animals_Zulu.class);
            startActivity(intentAnimal_Zulu);
            startupSong.stop();
        });
    }
}