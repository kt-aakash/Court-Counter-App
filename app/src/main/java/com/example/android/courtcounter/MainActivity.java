package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA_score = 0;  // Initializing Global var to track Team A's score
    int teamB_score = 0;  // Initializing Global var to track Team B's score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This function adds three points on a three pointer for TeamA
     */
    public void reset(View view){
        TextView teamA_TextView = (TextView) findViewById(R.id.textView_TeamA_Score);
        TextView teamB_TextView = (TextView) findViewById(R.id.textView_TeamB_Score);
        teamA_TextView.setText(""+0);
        teamB_TextView.setText(""+0);
    }

    /**
     * This function adds three points on a three pointer for TeamA
     */
   public void increment3PtrA(View view){
        teamA_score = teamA_score + 3;
        displayTeamAScore();
    }

    /**
     * Similar function for 2 point increment
     */
    public void increment2PtrA(View view){
        teamA_score = teamA_score + 2;
        displayTeamAScore();
    }

    /**
     * Similar function for 1 point increment
     */
    public void incrementPtrA(View view){
        teamA_score = teamA_score + 1;
        displayTeamAScore();
    }

    /**
     * These functions add points for TeamB
     */
    public void increment3PtrB(View view){
        teamB_score = teamB_score + 3;
        displayTeamBScore();
    }

    public void increment2PtrB(View view){
        teamB_score = teamB_score + 2;
        displayTeamBScore();
    }

    public void incrementPtrB(View view){
        teamB_score = teamB_score + 1;
        displayTeamBScore();
    }



    /**
     * This method displays TeamA's score value on the screen.
     */
    private void displayTeamAScore() {
        TextView textView_TeamA_Score = (TextView) findViewById(R.id.textView_TeamA_Score);
        textView_TeamA_Score.setText(""+teamA_score);
    }

    /**
     * This method displays TeamB's score value on the screen.
     */
    private void displayTeamBScore() {
        TextView teamB_TextView = (TextView) findViewById(R.id.textView_TeamB_Score);
        teamB_TextView.setText("" + teamB_score);
    }


}
