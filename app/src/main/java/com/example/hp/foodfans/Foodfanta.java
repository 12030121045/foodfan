package com.example.hp.foodfans;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Foodfanta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodfanta);
    }


    public void buttonOnClick(View v) {

        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), cuisine.class));



    }
}
