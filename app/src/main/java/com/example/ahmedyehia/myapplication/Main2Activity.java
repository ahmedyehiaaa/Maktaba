package com.example.ahmedyehia.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.service.chooser.ChooserTarget;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    ImageButton firstbook , secondbook, thirdbook,fourbook,fivebook,sixbook,sevenbook,eightbook,ninebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





        firstbook = (ImageButton) findViewById(R.id.firstbook);
        secondbook = (ImageButton) findViewById(R.id.secondbook);
        thirdbook = (ImageButton) findViewById(R.id.thirdbook);
        fourbook = (ImageButton) findViewById(R.id.fourbook);
        fivebook = (ImageButton) findViewById(R.id.fivebook);
        sixbook = (ImageButton) findViewById(R.id.sixbook);
        sevenbook = (ImageButton) findViewById(R.id.sevenbook);
        eightbook = (ImageButton) findViewById(R.id.eightbook);
        ninebook = (ImageButton) findViewById(R.id.ninebook);

        firstbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Firstbook.class);
                startActivity(intent);
            }
        });
        secondbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Secondbook.class);
                startActivity(intent);
            }
        });
        thirdbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Thirdbook.class);
                startActivity(intent);
            }
        });
        fourbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Fourbook.class);
                startActivity(intent);
            }
        });
        fivebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Fivebbok.class);
                startActivity(intent);
            }
        });
        sixbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Sixbook.class);
                startActivity(intent);
            }
        });
        sevenbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Sevenbook.class);
                startActivity(intent);
            }
        });
        eightbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Eightbook.class);
                startActivity(intent);
            }
        });
        ninebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Ninebook.class);
                startActivity(intent);
            }
        });
    }
    public void gotoweb(View view) {
        goToUrl("http://www.fawzyabuzeid.com");
    }

    public void gotofacebook(View view) {
        goToUrl("https://www.facebook.com/fawzy.abuzeid");
    }

    public void gototwitter(View view) {
        goToUrl("https://twitter.com/fawzyabuzeid");
    }

    public void gotoyoutube(View view) {
        goToUrl("https://www.youtube.com/c/sheikhfawzymohammedabuzeid1");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}