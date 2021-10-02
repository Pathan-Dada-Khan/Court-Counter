package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int score1=0;
    int score2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threeOne(View view){
        score1+=3;
        displayOne(score1);
    }
    public void twoOne(View view){
        score1+=2;
        displayOne(score1);
    }
    public void oneOne(View view){
        score1++;
        displayOne(score1);
    }
    private void displayOne(int n){
        TextView t=(TextView) findViewById(R.id.score1);
        t.setText(""+n);
        message();
    }
    public void threeSec(View view){
        score2+=3;
        displaySec(score2);
    }
    public void twoSec(View view){
        score2+=2;
        displaySec(score2);
    }
    public void oneSec(View view){
        score2++;
        displaySec(score2);
    }
    private void displaySec(int n){
        TextView t=(TextView) findViewById(R.id.score2);
        t.setText(""+n);
        message();
    }
    private void message(){
        TextView t=(TextView) findViewById(R.id.lead);
        if(score1>score2)
            t.setText("Team-A Leads:"+(score1-score2));
        else if(score1==score2)
            t.setText("Scores Level");
        else
            t.setText("Team-B Leads:"+(score2-score1));
    }
    public void reset(View view){
        score1=0;
        score2=0;
        displayOne(score1);
        displaySec(score2);
        TextView t=(TextView) findViewById(R.id.lead);
        t.setText("");
    }
}