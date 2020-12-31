package com.mkmt.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToSecondActivity = findViewById(R.id.buttonGoToSecondActivity);

        goToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item item = new Item("pencil", (long) 1);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Item", item);

                startActivity(intent);
            }
        });
    }
}