package com.example.pramesh.bvctimetableadmin;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class TimeTablePage extends AppCompatActivity {

    private TextView mondayFirst, mondaySecond, mondayThird, mondayForth, mondayFifth, mondaySixth, mondaySeventh;
    private TextView tuesdayFirst, tuesdaySecond, tuesdayThird, tuesdayFourth, tuesdayFifth, tuesdaySixth, tuesdaySeventh;
    private TextView wednesdayFirst, wednesdaySecond, wednesdayThird, wednesdayFourth, wednesdayFifth, wednesdaySixth, wednesdaySeventh;
    private TextView thrusdayFirst, thrusdaySecond, thrusdayThird, thrusdayFourth, thrusdayFifth, thrusdaySixth, thrusdaySeventh;
    private TextView fridayFirst, fridaySecond, fridayThird, fridayFourth, fridayFifth, fridaySixth, fridaySeventh;
    private TextView saturdayFirst, saturdaySecond, saturdayThird, saturdayFourth, saturdayFifth, saturdaySixth, saturdaySeventh;

    private DatabaseReference firebaseData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_page);

        final String value = getIntent().getStringExtra("value");

        switch (value) {
            case "civilfirstfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("civiltableoneoneA");
                firebaseData.keepSynced(true);
                break;
            case "civilfirstfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilfirstfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilfirstsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilfirstsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilfirstsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilsecondfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilsecondfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilsecondfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilsecondsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilsecondsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilsecondsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilthirdfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilthirdfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilthirdfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilthirdsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "civilthirdsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilthirdsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilfourthfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilfourthfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilfourthfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilfourthsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilfourthsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "civilfourthsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;

            // Cse case ...

            case "csefirstfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefirstfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefirstfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefirstsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefirstsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefirstsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csesecondfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csesecondfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csesecondfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csesecondsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csesecondsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csesecondsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csethirdfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csethirdfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csethirdfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csethirdsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("csetablethreetwoA");
                firebaseData.keepSynced(true);
                break;
            case "csethirdsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                firebaseData.keepSynced(true);
                break;
            case "csethirdsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefourthfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefourthfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefourthfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefourthsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefourthsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "csefourthsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;

            // Mech case ...

            case "mechfirstfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfirstfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfirstfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfirstsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfirstsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfirstsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechsecondfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechsecondfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechsecondfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechsecondsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechsecondsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechsecondsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechthirdfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechthirdfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechthirdfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechthirdsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechthirdsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechthirdsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfourthfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfourthfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfourthfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfourthsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfourthsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "mechfourthsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;

            // eee case ...

            case "eeefirstfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefirstfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefirstfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefirstsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefirstsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefirstsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeesecondfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeesecondfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeesecondfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeesecondsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeesecondsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeesecondsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeethirdfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeethirdfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeethirdfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeethirdsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeethirdsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeethirdsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefourthfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefourthfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefourthfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefourthsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefourthsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "eeefourthsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;

            // ece case ...

            case "ecefirstfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefirstfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefirstfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefirstsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefirstsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefirstsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecesecondfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecesecondfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecesecondfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecesecondsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecesecondsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecesecondsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecethirdfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecethirdfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecethirdfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecethirdsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecethirdsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecethirdsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefourthfirstA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefourthfirstB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefourthfirstC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefourthsecondA":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefourthsecondB":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;
            case "ecefourthsecondC":
                firebaseData = FirebaseDatabase.getInstance().getReference().child("");
                break;


        }

        // Firebase stuff begins ...

        firebaseData.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();

                // Setting up link with online data ...

                String mondayFirstData = (String) map.get("mondayFirst");
                String mondaySecondData = (String) map.get("mondaySecond");
                String mondayThirdData = (String) map.get("mondayThird");
                String mondayForthData = (String) map.get("mondayForth");
                String mondayFifthData = (String) map.get("mondayFifth");
                String mondaySixthData = (String) map.get("mondaySixth");
                String mondaySeventhData = (String) map.get("mondaySeventh");

                String tuesdayFirstData = (String) map.get("tuesdayFirst");
                String tuesdaySecondData = (String) map.get("tuesdaySecond");
                String tuesdayThirdData = (String) map.get("tuesdayThird");
                String tuesdayForthData = (String) map.get("tuesdayForth");
                String tuesdayFifthData = (String) map.get("tuesdayFifth");
                String tuesdaySixthData = (String) map.get("tuesdaySixth");
                String tuesdaySeventhData = (String) map.get("tuesdaySeventh");

                String wednesdayFirstData = (String) map.get("wednesdayFirst");
                String wednesdaySecondData = (String) map.get("wednesdaySecond");
                String wednesdayThirdData = (String) map.get("wednesdayThird");
                String wednesdayForthData = (String) map.get("wednesdayForth");
                String wednesdayFifthData = (String) map.get("wednesdayFifth");
                String wednesdaySixthData = (String) map.get("wednesdaySixth");
                String wednesdaySeventhData = (String) map.get("wednesdaySeventh");

                String thrusdayFirstData = (String) map.get("thrusdayFirst");
                String thrusdaySecondData = (String) map.get("thrusdaySecond");
                String thrusdayThirdData = (String) map.get("thrusdayThird");
                String thrusdayForthData = (String) map.get("thrusdayForth");
                String thrusdayFifthData = (String) map.get("thrusdayFifth");
                String thrusdaySixthData = (String) map.get("thrusdaySixth");
                String thrusdaySeventhData = (String) map.get("thrusdaySeventh");

                String fridayFirstData = (String) map.get("fridayFirst");
                String fridaySecondData = (String) map.get("fridaySecond");
                String fridayThirdData = (String) map.get("fridayThird");
                String fridayForthData = (String) map.get("fridayForth");
                String fridayFifthData = (String) map.get("fridayFifth");
                String fridaySixthData = (String) map.get("fridaySixth");
                String fridaySeventhData = (String) map.get("fridaySeventh");

                String saturdayFirstData = (String) map.get("saturdayFirst");
                String saturdaySecondData = (String) map.get("saturdaySecond");
                String saturdayThirdData = (String) map.get("saturdayThird");
                String saturdayForthData = (String) map.get("saturdayForth");
                String saturdayFifthData = (String) map.get("saturdayFifth");
                String saturdaySixthData = (String) map.get("saturdaySixth");
                String saturdaySeventhData = (String) map.get("saturdaySeventh");


                // Setting up actions for updation here on ...

                mondayFirst.setText(mondayFirstData);
                mondaySecond.setText(mondaySecondData);
                mondayThird.setText(mondayThirdData);
                mondayForth.setText(mondayForthData);
                mondayFifth.setText(mondayFifthData);
                mondaySixth.setText(mondaySixthData);
                mondaySeventh.setText(mondaySeventhData);

                tuesdayFirst.setText(tuesdayFirstData);
                tuesdaySecond.setText(tuesdaySecondData);
                tuesdayThird.setText(tuesdayThirdData);
                tuesdayFourth.setText(tuesdayForthData);
                tuesdayFifth.setText(tuesdayFifthData);
                tuesdaySixth.setText(tuesdaySixthData);
                tuesdaySeventh.setText(tuesdaySeventhData);

                wednesdayFirst.setText(wednesdayFirstData);
                wednesdaySecond.setText(wednesdaySecondData);
                wednesdayThird.setText(wednesdayThirdData);
                wednesdayFourth.setText(wednesdayForthData);
                wednesdayFifth.setText(wednesdayFifthData);
                wednesdaySixth.setText(wednesdaySixthData);
                wednesdaySeventh.setText(wednesdaySeventhData);

                thrusdayFirst.setText(thrusdayFirstData);
                thrusdaySecond.setText(thrusdaySecondData);
                thrusdayThird.setText(thrusdayThirdData);
                thrusdayFourth.setText(thrusdayForthData);
                thrusdayFifth.setText(thrusdayFifthData);
                thrusdaySixth.setText(thrusdaySixthData);
                thrusdaySeventh.setText(thrusdaySeventhData);

                fridayFirst.setText(fridayFirstData);
                fridaySecond.setText(fridaySecondData);
                fridayThird.setText(fridayThirdData);
                fridayFourth.setText(fridayForthData);
                fridayFifth.setText(fridayFifthData);
                fridaySixth.setText(fridaySixthData);
                fridaySeventh.setText(fridaySeventhData);

                saturdayFirst.setText(saturdayFirstData);
                saturdaySecond.setText(saturdaySecondData);
                saturdayThird.setText(saturdayThirdData);
                saturdayFourth.setText(saturdayForthData);
                saturdayFifth.setText(saturdayFifthData);
                saturdaySixth.setText(saturdaySixthData);
                saturdaySeventh.setText(saturdaySeventhData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        // Firebase stuff ends ...

        //  Declaration Starts here ...

        mondayFirst = (TextView) findViewById(R.id.mondayFirst);
        mondaySecond = (TextView) findViewById(R.id.mondaySecond);
        mondayThird = (TextView) findViewById(R.id.mondayThird);
        mondayForth = (TextView) findViewById(R.id.mondayFourth);
        mondayFifth = (TextView) findViewById(R.id.mondayFifth);
        mondaySixth = (TextView) findViewById(R.id.mondaySixth);
        mondaySeventh = (TextView) findViewById(R.id.mondaySeventh);

        tuesdayFirst = (TextView) findViewById(R.id.tuesdayFirst);
        tuesdaySecond = (TextView) findViewById(R.id.tuesdaySecond);
        tuesdayThird = (TextView) findViewById(R.id.tuesdayThird);
        tuesdayFourth = (TextView) findViewById(R.id.tuesdayFourth);
        tuesdayFifth = (TextView) findViewById(R.id.tuesdayFifth);
        tuesdaySixth = (TextView) findViewById(R.id.tuesdaySixth);
        tuesdaySeventh = (TextView) findViewById(R.id.tuesdaySeventh);

        wednesdayFirst = (TextView) findViewById(R.id.wednesdayFirst);
        wednesdaySecond = (TextView) findViewById(R.id.wednesdaySecond);
        wednesdayThird = (TextView) findViewById(R.id.wednesdayThird);
        wednesdayFourth = (TextView) findViewById(R.id.wednesdayFourth);
        wednesdayFifth = (TextView) findViewById(R.id.wednesdayFifth);
        wednesdaySixth = (TextView) findViewById(R.id.wednesdaySixth);
        wednesdaySeventh = (TextView) findViewById(R.id.wednesdaySeventh);

        thrusdayFirst = (TextView) findViewById(R.id.thursdayFirst);
        thrusdaySecond = (TextView) findViewById(R.id.thrusdaySecond);
        thrusdayThird = (TextView) findViewById(R.id.thrusdayThird);
        thrusdayFourth = (TextView) findViewById(R.id.thrusdayFourth);
        thrusdayFifth = (TextView) findViewById(R.id.thrusdayFifth);
        thrusdaySixth = (TextView) findViewById(R.id.thrusdaySixth);
        thrusdaySeventh = (TextView) findViewById(R.id.thrusdaySeventh);

        fridayFirst = (TextView) findViewById(R.id.fridayFirst);
        fridaySecond = (TextView) findViewById(R.id.fridaySecond);
        fridayThird = (TextView) findViewById(R.id.fridayThird);
        fridayFourth = (TextView) findViewById(R.id.fridayFourth);
        fridayFifth = (TextView) findViewById(R.id.fridayFifth);
        fridaySixth = (TextView) findViewById(R.id.fridaySixth);
        fridaySeventh = (TextView) findViewById(R.id.fridaySeventh);

        saturdayFirst = (TextView) findViewById(R.id.saturdayFirst);
        saturdaySecond = (TextView) findViewById(R.id.saturdaySecond);
        saturdayThird = (TextView) findViewById(R.id.saturdayThird);
        saturdayFourth = (TextView) findViewById(R.id.saturdayFourth);
        saturdayFifth = (TextView) findViewById(R.id.saturdayFifth);
        saturdaySixth = (TextView) findViewById(R.id.saturdaySixth);
        saturdaySeventh = (TextView) findViewById(R.id.saturdaySeventh);

        //declaration ends here ...


        mondayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondayFirst");
            }
        });

        mondaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondaySecond");
            }
        });

        mondayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondayThird");

            }
        });

        mondayForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondayForth");
            }
        });

        mondayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondayFifth");
            }
        });

        mondaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondaySixth");
            }
        });

        mondaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("mondaySeventh");
            }
        });

        // Now for tuesday ...

        tuesdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdayFirst");
            }
        });

        tuesdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdaySecond");
            }
        });

        tuesdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdayThird");
            }
        });

        tuesdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdayFourth");
            }
        });

        tuesdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdayFifth");
            }
        });

        tuesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdaySixth");
            }
        });

        tuesdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("tuesdaySeventh");
            }
        });

        // Setting up for wednesday Now ...

        wednesdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("");
            }
        });

        wednesdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("wednesdayFirst");
            }
        });

        wednesdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("wednesdayThird");
            }
        });

        wednesdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("wednesdayFourth");
            }
        });

        wednesdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("wednesdayFifth");
            }
        });

        wednesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("wednesdaySixth");
            }
        });

        wednesdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("wednesdaySeventh");
            }
        });

        // Setting up for thrusday Now ...

        thrusdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdayFirst");
            }
        });

        thrusdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdaySecond");
            }
        });

        thrusdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdayThird");
            }
        });

        thrusdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdayFourth");
            }
        });

        thrusdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdayFifth");
            }
        });

        thrusdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdaySixth");
            }
        });

        thrusdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("thrusdaySeventh");
            }
        });

        // Setting up for friday Now ...

        fridayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridayFirst");
            }
        });

        fridaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridaySecond");
            }
        });

        fridayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridayThird");
            }
        });

        fridayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridayFourth");
            }
        });

        fridayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridayFifth");
            }
        });

        fridaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridaySixth");
            }
        });

        fridaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("fridaySeventh");
            }
        });

        // Setting up for saturday Now ...

        saturdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdayFirst");
            }
        });

        saturdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdayThird");
            }
        });

        saturdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdayThird");
            }
        });

        saturdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdayFourth");
            }
        });

        saturdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdayFifth");
            }
        });

        saturdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdaySixth");
            }
        });

        saturdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertShow("saturdaySeventh");
            }
        });
    }

    // Alert function calls here made ...

    public void alertShow(final String childValue) {
        AlertDialog.Builder builder = new AlertDialog.Builder(TimeTablePage.this);
        builder.setTitle("Change Subject");
        builder.setMessage("");
        final EditText input = new EditText(TimeTablePage.this);
        builder.setView(input);
        builder.setCancelable(true);
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String fromInput = input.getText().toString();
                firebaseData.child(childValue).setValue(fromInput);
            }
        });
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Time Table (Admin)");
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
