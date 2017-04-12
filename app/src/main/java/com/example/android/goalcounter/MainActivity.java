package com.example.android.goalcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamI = 0;
    int scoreTeamII = 0;
    int foulsTeamI = 0;
    int foulsTeamII = 0;
    int cornersForTeamI = 0;
    int cornersForTeamII= 0;
    final int POINTS_FOR_GOAL = 1;
    final int FOUL = 1;
    final int CORNER = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamI(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsForTeamI(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void displayCornersForTeamI(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_corners);
        scoreView.setText(String.valueOf(score));
    }
    public void goalForTeamI(View v){
        scoreTeamI = scoreTeamI + POINTS_FOR_GOAL;
        displayGoalsForTeamI(scoreTeamI);
    }
    public void foulForTeamI(View v) {
        foulsTeamI = foulsTeamI + FOUL;
        displayFoulsForTeamI(foulsTeamI);
    }
    public void cornerForTeamI(View v){
        cornersForTeamI = cornersForTeamI + CORNER;
        displayCornersForTeamI(cornersForTeamI);
    }

    public void displayGoalsForTeamII(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsForTeamII(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void displayCornersForTeamII(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_corners);
        scoreView.setText(String.valueOf(score));
    }

    public void goalForTeamII(View v){
        scoreTeamII = scoreTeamII + POINTS_FOR_GOAL;
        displayGoalsForTeamII(scoreTeamII);
    }
    public void foulForTeamII(View v) {
        foulsTeamII = foulsTeamII + FOUL;
        displayFoulsForTeamII(foulsTeamII);
    }
    public void cornerForTeamII(View v){
        cornersForTeamII = cornersForTeamII + CORNER;
        displayCornersForTeamII(cornersForTeamII);
    }
    public void resetScore(View v){
        scoreTeamI = 0;
        scoreTeamII = 0;
        foulsTeamI = 0;
        foulsTeamII = 0;
        cornersForTeamI = 0;
        cornersForTeamII= 0;
        displayGoalsForTeamI(scoreTeamI);
        displayGoalsForTeamII(scoreTeamII);
        displayFoulsForTeamI(foulsTeamI);
        displayFoulsForTeamII(foulsTeamII);
        displayCornersForTeamI(cornersForTeamI);
        displayCornersForTeamII(cornersForTeamII);
    }
}
