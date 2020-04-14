package com.example.ahmed.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int FREE_THROW_POINTS = 1;
    int TeamAScore = 0;
    int TeamBScore = 0;

    TextView textView_TeamAScore;
    TextView textView_TeamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_TeamAScore = (TextView) findViewById(R.id.textView_teamAScore);
        textView_TeamBScore = (TextView) findViewById(R.id.textView_teamBScore);
    }

    private void displayTeamAScore(){
        textView_TeamAScore.setText(TeamAScore + "");
    }

    private void displayTeamBScore(){
        textView_TeamBScore.setText(TeamBScore + "");
    }

    public void ResetScoreForBothTeams(View view){
        TeamAScore = 0;
        displayTeamAScore();

        TeamBScore = 0;
        displayTeamBScore();
    }

    public void Plus3TeamA(View view){
        TeamAScore = TeamAScore + 3;
        displayTeamAScore();
    }

    public void Plus2TeamA(View view){
        TeamAScore = TeamAScore + 2;
        displayTeamAScore();
    }

    public void FreeThrowTeamA(View view){
        TeamAScore = TeamAScore + FREE_THROW_POINTS;
        displayTeamAScore();
    }

    public void Plus3TeamB(View view){
        TeamBScore = TeamBScore + 3;
        displayTeamBScore();
    }

    public void Plus2TeamB(View view){
        TeamBScore = TeamBScore + 2;
        displayTeamBScore();
    }

    public void FreeThrowTeamB(View view){
        TeamBScore = TeamBScore + FREE_THROW_POINTS;
        displayTeamBScore();
    }

}
