package com.example.revisionlab;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddReading extends AppCompatActivity {

    EditText title,author;
    TextView lbtitle,lbauthor;
    Button btn;
    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reading);

        Intent intent=getIntent();
        flag=intent.getStringExtra("input");
        lbtitle = findViewById(R.id.title);
        lbauthor = findViewById(R.id.author);
        title = findViewById(R.id.txt1);
        author = findViewById(R.id.txt2);
        changeFragment();

        btn=findViewById(R.id.btnview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });
    }

    private void changeFragment()
    {
        if(flag.equals("1"))
        {
            lbauthor.setText("Author : ");
            lbtitle.setText("Book Title : ");
            Fragment fragment1;
            fragment1 = new Book();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment4,fragment1);
            ft.commit();
        }
        else
        {
            lbauthor.setText("Title of the Article : ");
            lbtitle.setText("Editor : ");
            Fragment fragment2;
            fragment2 = new PaperFragment();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment4,fragment2);
            ft.commit();
        }

    }
    public void alert()
    {
        AlertDialog dialog;
        AlertDialog.Builder builder=new AlertDialog.Builder(AddReading.this);
        builder.setTitle("you are reading");
        builder.setMessage(title.getText().toString()+" by "+author.getText().toString());
        builder.setPositiveButton("OK",null);
        dialog = builder.create();
        dialog.show();
    }
}