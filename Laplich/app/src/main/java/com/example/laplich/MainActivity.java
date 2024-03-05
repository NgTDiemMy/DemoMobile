package com.example.laplich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgbtBack, imgbtEvents, imgbtTodo, imgbtMemo, imgbtDiary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtBack = findViewById(R.id.imgbtnBack);
        imgbtEvents = findViewById(R.id.imgbtnEvent);
        imgbtTodo = findViewById(R.id.imgbtnTodo);
        imgbtMemo = findViewById(R.id.imgbtnMemo);
        imgbtDiary = findViewById(R.id.imgbtnDiary);

        imgbtTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, TodoActivity.class);
                i.putExtra("","");
                startActivity(i);
            }
        });

        imgbtEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, EventsActivity.class);
                i.putExtra("","");
                startActivity(i);
            }
        });

        imgbtMemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, MemoActivity.class);
                i.putExtra("","");
                startActivity(i);
            }
        });

        imgbtDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, DiaryActivity.class);
                i.putExtra("","");
                startActivity(i);
            }
        });
    }
}