package com.example.infodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class userchoicepg extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userchoicepg);

        TextView lect= findViewById(R.id.lecturer);
        TextView bk = findViewById(R.id.handbk);




        // Go to Lecturer page
        lect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(userchoicepg.this,Lecturer.class);
                startActivity(intent);
            }
        });


        // Go to student page
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(userchoicepg.this, HandBook.class);
                startActivity(intent);
            }
        });

    }
}
