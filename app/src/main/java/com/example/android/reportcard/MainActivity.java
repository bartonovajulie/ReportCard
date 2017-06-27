package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = new ReportCard(2,2,2);

        TextView score = (TextView) findViewById(R.id.studentScore);
        score.setText(reportCard.toString());
    }
}
