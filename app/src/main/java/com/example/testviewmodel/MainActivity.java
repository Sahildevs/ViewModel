package com.example.testviewmodel;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //its not recognising ViewModelProvider

        mainViewModel = ViewModelProvider.of(this).get(MainViewModel.class);

        


    }
}