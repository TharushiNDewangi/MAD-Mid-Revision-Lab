package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Button btnok;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnok=findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast part simple way
                Toast.makeText(getApplicationContext(), "wellcome you" +
                        " Please enter what you read", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,ReadingCollections.class);
                startActivity(intent);
            }
        });

    }
}