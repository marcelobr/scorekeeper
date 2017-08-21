package com.example.android.scorekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int goalTeamA = 0;
    int foulTeamA = 0;
    int expulsionTeamA = 0;
    int goalTeamB = 0;
    int foulTeamB = 0;
    int expulsionTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given goal for Team A.
     */
    public void displayGoalForTeamA(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_a_goal);
        goalView.setText(String.valueOf(goal));
    }

    /**
     * Displays the given goal for Team B.
     */
    public void displayGoalForTeamB(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_b_goal);
        goalView.setText(String.valueOf(goal));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayFoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given expulsion for Team A.
     */
    public void displayExpulsionForTeamA(int expulsion) {
        TextView expulsionView = (TextView) findViewById(R.id.team_a_expulsions);
        expulsionView.setText(String.valueOf(expulsion));
    }

    /**
     * Displays the given expulsion for Team B.
     */
    public void displayExpulsionForTeamB(int expulsion) {
        TextView expulsionView = (TextView) findViewById(R.id.team_b_expulsions);
        expulsionView.setText(String.valueOf(expulsion));
    }

    /**
     * Add 1 goal on the board for Team A.
     */
    public void addGoalForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * Add 1 foul on the board for Team A.
     */
    public void addFoulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Add 1 expulsion on the board for Team A.
     */
    public void addExpulsionForTeamA(View view) {
        expulsionTeamA = expulsionTeamA + 1;
        displayExpulsionForTeamA(expulsionTeamA);
    }

    /**
     * Add 1 goal on the board for Team B.
     */
    public void addGoalForTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * Add 1 foul on the board for Team B.
     */
    public void addFoulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Add 1 expulsion on the board for Team B.
     */
    public void addExpulsionForTeamB(View view) {
        expulsionTeamB = expulsionTeamB + 1;
        displayExpulsionForTeamB(expulsionTeamB);
    }

    /**
     * Reset goal, foul and expulsion for the teams.
     */
    public void resetScore(View view) {
        goalTeamA = 0;
        foulTeamA = 0;
        expulsionTeamA = 0;
        goalTeamB = 0;
        foulTeamB = 0;
        expulsionTeamB = 0;
        displayGoalForTeamA(0);
        displayFoulForTeamA(0);
        displayExpulsionForTeamA(0);
        displayGoalForTeamB(0);
        displayFoulForTeamB(0);
        displayExpulsionForTeamB(0);
    }
}
