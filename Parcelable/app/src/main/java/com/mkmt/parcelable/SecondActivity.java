package com.mkmt.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Item item = intent.getParcelableExtra("Item");

        Toast.makeText(getApplicationContext(), item.getName(), Toast.LENGTH_LONG).show();
    }
}