package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.Button1);
        b2 = findViewById(R.id.Button2);

        randonNumberGenerator();

    }

    private void randonNumberGenerator(){

        Random num = new Random();
        int number1 = num.nextInt(11-1)+1;
        int number2 = num.nextInt(11-1)+1;

        b1.setText(Integer.toString(number1));
        b2.setText(Integer.toString(number2));

    }

}
