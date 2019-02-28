package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA();
    }

    public void displayScoreTeamA(){
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void threePointsTeamA(View view){
        scoreTeamA += 3;
        displayScoreTeamA();
    }

    public void twoPointsTeamA(View view){
        scoreTeamA += 2;
        displayScoreTeamA();
    }

    public void freeThrowTeamA(View view){
        scoreTeamA += 1;
        displayScoreTeamA();
    }

    public void displayScoreTeamB(){
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void threePointsTeamB(View view){
        scoreTeamB += 3;
        displayScoreTeamB();
    }

    public void twoPointsTeamB(View view){
        scoreTeamB += 2;
        displayScoreTeamB();
    }

    public void freeThrowTeamB(View view){
        scoreTeamB += 1;
        displayScoreTeamB();
    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }

}
