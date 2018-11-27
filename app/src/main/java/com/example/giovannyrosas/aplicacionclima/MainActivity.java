package com.example.giovannyrosas.aplicacionclima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
public final String  DarkSkyApiKey= "https://api.darksky.net/forecast/529aaed9c51938d5e406a44cb1fcf8d1/37.8267,-122.4233";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ForecastConfiguration configuration=
                new ForecastConfigurarion.Builder(DarkSkyApiKey)
                .setDefaultLanguage(Language.SPANISH)
                .setDefaultUnit(Unit.SI)
                .setCacheDirectory(getCacheDir())
                .buil();
        ForecastClient.create(configuration);
    }
}
