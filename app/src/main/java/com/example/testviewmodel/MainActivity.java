package com.example.testviewmodel;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        //its not recognising ViewModelProvider

        mainViewModel = ViewModelProvider.of(this).get(MainViewModel.class);


        tv.setText(mainViewModel.num);

        


    }
}