package com.scamero1.drinkdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrinkListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_list);
    }

    public void TapFabButtonAddDrink(View view) {
        Intent intent = new Intent(this,DrinkActivity.class);
        startActivity(intent);
    }
}
