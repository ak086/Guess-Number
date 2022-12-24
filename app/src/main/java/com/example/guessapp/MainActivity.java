package com.example.guessapp;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;

    public void generateRandomNumber(){

        Random ran=new Random();
        random=ran.nextInt(20) + 1;

    }

    public void guessRandom(View view){

        EditText editText=(EditText)findViewById(R.id.editTextNumber);
        Log.i("Entered Number",editText.getText().toString());
        int enteredNumber=Integer.parseInt(editText.getText().toString());

        String message;

        if(random>enteredNumber){
            message="higher";
        }
        else if(random<enteredNumber){
            message="Lower";
        }
        else{
            message="You got it!!!";
            generateRandomNumber();
        }

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        Log.i("info", Integer.toString(random));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();

    }
}