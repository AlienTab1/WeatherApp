package com.plcoding.weatherapp.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.plcoding.weatherapp.presentation.ui.theme.WeatherAppTheme

class TargetWeatherDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherAppTheme {

            }
        }
    }
}