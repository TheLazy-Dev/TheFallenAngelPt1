package com.denish.thefallenangelpt1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        change();


    }
    void change(){
        Intent I = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(I);
        finish();
    }
}
