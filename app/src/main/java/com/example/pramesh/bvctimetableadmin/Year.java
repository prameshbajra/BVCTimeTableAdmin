package com.example.pramesh.bvctimetableadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Year extends AppCompatActivity {

    private Button firstYear, secondYear, thirdYear, fourthYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        firstYear = (Button) findViewById(R.id.firstYear);
        secondYear = (Button) findViewById(R.id.secondYear);
        thirdYear = (Button) findViewById(R.id.thirdYear);
        fourthYear = (Button) findViewById(R.id.fourthYear);

        final String valueGet = getIntent().getStringExtra("department");

        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = valueGet + "first";
                Intent intent = new Intent(Year.this, Semester.class);
                intent.putExtra("value", valueMain);
                startActivity(intent);
            }
        });

        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = valueGet + "second";
                Intent intent = new Intent(Year.this, Semester.class);
                intent.putExtra("value", valueMain);
                startActivity(intent);
            }
        });

        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = valueGet + "third";
                Intent intent = new Intent(Year.this, Semester.class);
                intent.putExtra("value", valueMain);
                startActivity(intent);
            }
        });

        fourthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = valueGet + "fourth";
                Intent intent = new Intent(Year.this, Semester.class);
                intent.putExtra("value", valueMain);
                startActivity(intent);
            }
        });
    }
}
