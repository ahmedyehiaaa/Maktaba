package com.example.ahmedyehia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Firstbook extends AppCompatActivity {

    Button f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstbook);

        f1=(Button)findViewById(R.id.f1);
        f2=(Button)findViewById(R.id.f2);
        f3=(Button)findViewById(R.id.f3);
        f4=(Button)findViewById(R.id.f4);
        f5=(Button)findViewById(R.id.f5);
        f6=(Button)findViewById(R.id.f6);
        f7=(Button)findViewById(R.id.f7);
        f8=(Button)findViewById(R.id.f8);
        f9=(Button)findViewById(R.id.f9);
        f10=(Button)findViewById(R.id.f10);


        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook1.class);
                startActivity(intent);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook2.class);
                startActivity(intent);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook3.class);
                startActivity(intent);
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook4.class);
                startActivity(intent);
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook5.class);
                startActivity(intent);
            }
        });

        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook6.class);
                startActivity(intent);
            }
        });

        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook7.class);
                startActivity(intent);
            }
        });

        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook8.class);
                startActivity(intent);
            }
        });

        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,Firstbook9.class);
                startActivity(intent);
            }
        });
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstbook.this,firstbook10.class);
                startActivity(intent);
            }
        });

    }
}
