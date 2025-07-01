package Sesotho;

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
import Zulu.Zulu_Version;

public class Sesotho_Version extends AppCompatActivity {

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

  /*  @Override
    public void onBackPressed() {
        new AlertDialog.Builder(Sesotho_Version.this)
                .setMessage("Exit the App?").setCancelable(false)
                .setPositiveButton("Yes", (dialog, which) -> finishAffinity()).setNegativeButton("No",null).show();
        startupSong.release();
        super.onBackPressed();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesotho_version);

        toolbar = findViewById(R.id.toolbar_Sotho);
        drawerLayout = findViewById(R.id.drawer_Layout);
        navigationView = findViewById(R.id.nav_view_Sotho);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));

        navigationView.setNavigationItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.about_App)
            {
                Intent intent = new Intent(Sesotho_Version.this, About_Sotho.class);
                startActivity(intent);
                startupSong.stop();
            } else if (menuItem.getItemId() == R.id.exit_App)
            {
                new AlertDialog.Builder(Sesotho_Version.this)
                        .setMessage("Exit the App?").setCancelable(false)
                        .setPositiveButton("Yes", (dialog, which) -> finish()).setNegativeButton("No",null).show();
                startupSong.stop();
            }
            else if (menuItem.getItemId() == R.id.share_App)
            {
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
                Intent intentEnglish = new Intent(Sesotho_Version.this, MainActivity.class);
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

        ImageButton buttonVowels = findViewById(R.id.vowels_Sotho);
        ImageButton buttonAlphabets = findViewById(R.id.alphabets_Sotho);
        ImageButton buttonCalendar = findViewById(R.id.calendar_Sotho);
        ImageButton buttonCareers = findViewById(R.id.careers_Sotho);
        ImageButton buttonColors = findViewById(R.id.colors_Sotho);
        ImageButton buttonCount = findViewById(R.id.count_Sotho);
        ImageButton buttonDays = findViewById(R.id.days_Sotho);
        ImageButton buttonMoney = findViewById(R.id.money_Sotho);
        ImageButton buttonPhonics = findViewById(R.id.phonics_Sotho);
        ImageButton buttonProvince = findViewById(R.id.province_Sotho);
        ImageButton buttonSeasons = findViewById(R.id.seasons_Sotho);
        ImageButton buttonShapes = findViewById(R.id.shapes_Sotho);
        ImageButton buttonAnimals = findViewById(R.id.animals_Sotho);
        ImageButton buttonTraffic_Light = findViewById(R.id.traffic_Light_Sotho);
        ImageButton buttonPlanets = findViewById(R.id.planets_Sotho);

        buttonVowels.setOnClickListener(v -> {

            Intent intent_Sotho = new Intent(Sesotho_Version.this, Vowels_Sotho.class);
            startActivity(intent_Sotho);
            startupSong.stop();
        });
        buttonDays.setOnClickListener(v -> {

            Intent intentDays_Sotho = new Intent(Sesotho_Version.this, Weekdays_Sotho.class);
            startActivity(intentDays_Sotho);
            startupSong.stop();
        });
        buttonMoney.setOnClickListener(v -> {

            Intent intentMoney_Sotho = new Intent(Sesotho_Version.this, Money_Sotho.class);
            startActivity(intentMoney_Sotho);
            startupSong.stop();
        });
        buttonPhonics.setOnClickListener(v -> {

            Intent intentPhonics_Sotho = new Intent(Sesotho_Version.this, Phonics_Sotho.class);
            startActivity(intentPhonics_Sotho);
            startupSong.stop();
        });
        buttonSeasons.setOnClickListener(v -> {

            Intent intentSeason_Sotho = new Intent(Sesotho_Version.this, Seasons_Sotho.class);
            startActivity(intentSeason_Sotho);
            startupSong.stop();
        });
        buttonShapes.setOnClickListener(v -> {

            Intent intentShapes_Sotho = new Intent(Sesotho_Version.this, Shapes_Sotho.class);
            startActivity(intentShapes_Sotho);
            startupSong.stop();
        });
        buttonProvince.setOnClickListener(v -> {

            Intent intentProvince_Sotho = new Intent(Sesotho_Version.this, Provinces_Sotho.class);
            startActivity(intentProvince_Sotho);
            startupSong.stop();
        });
        buttonCareers.setOnClickListener(v -> {

            Intent intentCareer_Sotho = new Intent(Sesotho_Version.this, Career_Sotho.class);
            startActivity(intentCareer_Sotho);
            startupSong.stop();
        });
        buttonCalendar.setOnClickListener(v -> {

            Intent intentCalender_Sotho = new Intent(Sesotho_Version.this, Calender_Sotho.class);
            startActivity(intentCalender_Sotho);
            startupSong.stop();
        });
        buttonCount.setOnClickListener(v -> {

            Intent intentCount_Sotho = new Intent(Sesotho_Version.this, Numbers_Sotho.class);
            startActivity(intentCount_Sotho);
            startupSong.stop();
        });
        buttonColors.setOnClickListener(v -> {

            Intent intentColor_Sotho = new Intent(Sesotho_Version.this, Colors_Sotho.class);
            startActivity(intentColor_Sotho);
            startupSong.stop();
        });
        buttonAlphabets.setOnClickListener(v -> {

            Intent intentAlphabet_Sotho = new Intent(Sesotho_Version.this, Alphabets_Sotho.class);
            startActivity(intentAlphabet_Sotho);
            startupSong.stop();
        });
        buttonTraffic_Light.setOnClickListener(v -> {

            Intent intentRobot_Sotho = new Intent(Sesotho_Version.this, Traffic_Light_Sotho.class);
            startActivity(intentRobot_Sotho);
            startupSong.stop();
        });
        buttonPlanets.setOnClickListener(v -> {

            Intent intentPlanet_Sotho = new Intent(Sesotho_Version.this, Planets_Sotho.class);
            startActivity(intentPlanet_Sotho);
            startupSong.stop();
        });
        buttonAnimals.setOnClickListener(v -> {

            Intent intentAnimal_Sotho = new Intent(Sesotho_Version.this, Animals_Sotho.class);
            startActivity(intentAnimal_Sotho);
            startupSong.stop();
        });
    }
}