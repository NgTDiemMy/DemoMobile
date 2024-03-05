package com.example.laplich;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TodoActivity extends AppCompatActivity {
    private ImageButton imgbtBack, imgbtAdd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_main);
        imgbtAdd = findViewById(R.id.imgbtnAdd);
        imgbtBack = findViewById(R.id.imgbtnBack);

        imgbtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}