package com.example.hp.foodfans;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;



public class cuisine extends ActionBarActivity {
    private RadioGroup radioGroup;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
        }

        public void eventOnClick(View view) {
        Intent intent;
            switch (view.getId()){

                case R.id.rbindian:
                    intent = new Intent(this, indian.class);
                    startActivity(intent);
                    break;
                case R.id.rbsouth:
                    intent = new Intent(this, south.class);
                    startActivity(intent);
                    break;
                case R.id.rbchinese:
                    intent = new Intent(this, chinese.class);
                    startActivity(intent);
                    break;
                case R.id.rbitalian:
                    intent = new Intent(this, italian.class);
                    startActivity(intent);
                    break;
            }

        }

    }




