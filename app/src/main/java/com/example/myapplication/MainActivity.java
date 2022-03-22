package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topImageText, String bottomImageText) {
        Bottom_Activity bottomFragment
                = (Bottom_Activity) this.getSupportFragmentManager()
                .findFragmentById(R.id.fragment_bottom);
        bottomFragment.showText(topImageText, bottomImageText);
    }
}