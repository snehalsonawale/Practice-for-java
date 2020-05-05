package com.example.androidjavabasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    double sum;
    TextView tv1,tv2;
    int valuesis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1= findViewById(R.id.tv1);
        tv2= findViewById(R.id.tv2);
        tv1.setText(String.valueOf( RR(1.5,2.5))  );
        tv2.setText(String.valueOf(valuesis) );

       // RR(1.5,2.5);

        System.out.println("value of sum"+sum);
        Log.e("valu of sume is",""+sum);

        show(10,40);

    }

     void show(int a,int b) {

         valuesis=0;

        valuesis=a+b;

        System.out.println("valu of valesis"+valuesis);
    }


    double RR(double r,double k){

        sum= r+k;
        return sum;
    }







}
