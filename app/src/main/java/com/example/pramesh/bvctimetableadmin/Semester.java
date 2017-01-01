package com.example.pramesh.bvctimetableadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Semester extends AppCompatActivity {

    private Button firstSemester,secondSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        firstSemester = (Button) findViewById(R.id.firstSemester);
        secondSemester = (Button) findViewById(R.id.secondSemester);

        final String valueGet = getIntent().getStringExtra("value");

        firstSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = valueGet+"first";
                Intent intent = new Intent(Semester.this,Section.class);
                intent.putExtra("value",valueMain);
                startActivity(intent);
            }
        });

        secondSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueMain = valueGet+"second";
                Intent intent = new Intent(Semester.this,Section.class);
                intent.putExtra("value",valueMain);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Semester Select");
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
