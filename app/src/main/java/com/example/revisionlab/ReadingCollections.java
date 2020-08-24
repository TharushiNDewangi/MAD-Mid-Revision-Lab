package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ReadingCollections extends AppCompatActivity {
Button book,paper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_collections);
        book=findViewById(R.id.btn1);
        paper=findViewById(R.id.btn2);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast part simple way
                Toast.makeText(getApplicationContext(), "wellcome you" +
                        " Please enter what you read", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ReadingCollections.this,AddReading.class);
                intent.putExtra("input","1");
                startActivity(intent);
            }
        });

       paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast part simple way
                Toast.makeText(getApplicationContext(), "wellcome you" +
                        " Please enter what you read", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ReadingCollections.this,AddReading.class);
                intent.putExtra("input","2");
                startActivity(intent);
            }
        });
    }
}