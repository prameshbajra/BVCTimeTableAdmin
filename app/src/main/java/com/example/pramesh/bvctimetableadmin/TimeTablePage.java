package com.example.pramesh.bvctimetableadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TimeTablePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_page);

        final String value = getIntent().getStringExtra("value");
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }
}
