package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    TextView msg;
    int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.Button1);
        b2 = findViewById(R.id.Button2);
        msg = findViewById(R.id.message);

        randonNumberGenerator();

    }

    public void randonNumberGenerator(){

        Random num = new Random();
        number1 = num.nextInt(11-1)+1;

        while (true){
            number2 = num.nextInt(11-1)+1;

            if(number1!= number2){
                b1.setText(Integer.toString(number1));
                b2.setText(Integer.toString(number2));
                break;
            }
        }
    }

    public void leftButton(View view){
        if(number1>number2){
            msg.setText("CONGRATULATIONS ^_^");
        }else{
            msg.setText("Wrong: "+ number2 + ">" + number1 );
        }
        randonNumberGenerator();
    }
    public void rightButton(View view){
        if(number2>number1){
            msg.setText("CONGRATULATIONS ^_^");
        }else{
            msg.setText("Wrong: "+ number1 + ">" + number2 );
        }
        randonNumberGenerator();
    }
}
