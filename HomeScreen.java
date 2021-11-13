package com.example.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button re;
    Button prac;
    Button ex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        re=findViewById(R.id.repo);
        prac=findViewById(R.id.learning);
        ex=findViewById(R.id.exam);

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/nowail/makh-rij-al--ur-f_asgn");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        prac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(HomeScreen.this,MainActivity.class);

                startActivity(newintent);
            }
        });
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(HomeScreen.this,Exam.class);

                startActivity(newintent);
            }
        });
    }
}