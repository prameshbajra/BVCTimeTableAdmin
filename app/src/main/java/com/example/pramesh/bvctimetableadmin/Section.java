package com.example.pramesh.bvctimetableadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Section extends AppCompatActivity {

    private Button sectionA, sectionB, sectionC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sectionA = (Button) findViewById(R.id.sectionA);
        sectionB = (Button) findViewById(R.id.sectionB);
        sectionC = (Button) findViewById(R.id.sectionC);

        final String value = getIntent().getStringExtra("value");

        sectionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = value+"A";
                Intent intent = new Intent(Section.this,TimeTablePage.class);
                intent.putExtra("value",valueMain);
                startActivity(intent);
            }
        });

        sectionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = value+"B";
                Intent intent = new Intent(Section.this,TimeTablePage.class);
                intent.putExtra("value",valueMain);
                startActivity(intent);
            }
        });

        sectionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = value+"C";
                Intent intent = new Intent(Section.this,TimeTablePage.class);
                intent.putExtra("value",valueMain);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Section Select");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
