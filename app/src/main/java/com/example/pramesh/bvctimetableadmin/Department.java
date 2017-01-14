package com.example.pramesh.bvctimetableadmin;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity {

    private Button civilButton, eceButton, eeeButton, cseButton, mechButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        checkFirstRun();

        civilButton = (Button) findViewById(R.id.civilButton);
        cseButton = (Button) findViewById(R.id.cseButton);
        eceButton = (Button) findViewById(R.id.eceButton);
        eeeButton = (Button) findViewById(R.id.eeeButton);
        mechButton = (Button) findViewById(R.id.mechButton);

        civilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Department.this, Year.class);
                intent.putExtra("department", "civil");
                startActivity(intent);
            }
        });

        cseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Department.this, Year.class);
                intent.putExtra("department", "cse");
                startActivity(intent);
            }
        });

        mechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Department.this, Year.class);
                intent.putExtra("department", "mech");
                startActivity(intent);
            }
        });

        eeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Department.this, Year.class);
                intent.putExtra("department", "eee");
                startActivity(intent);
            }
        });

        eceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Department.this, Year.class);
                intent.putExtra("department", "ece");
                startActivity(intent);
            }
        });
    }

    public void checkFirstRun() {
        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
        if (isFirstRun) {
            String title = "Welcome to BVC Time Table.\n";
            String message = "This app is a server app and should not be installed by a student.\n\n\n-By Pramesh Bajracharya";

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.show();
            getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                    .edit()
                    .putBoolean("isFirstRun", false)
                    .apply();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Time Table (Admin)");
        return true;
    }
}
