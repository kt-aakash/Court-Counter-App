package com.example.android.courtcounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamA_score = 0;  // Initializing Global var to track Team A's score
    TextView teamA_TextView;      // Initializing respective TextView

    private int teamB_score = 0;  // Initializing Global var to track Team B's score
    private TextView teamB_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA_TextView = (TextView) findViewById(R.id.textView_TeamA_Score);
        teamB_TextView = (TextView) findViewById(R.id.textView_TeamB_Score);

        if(savedInstanceState != null){

            teamA_score = savedInstanceState.getInt("countA");   // Retrieving the state of the variable before the change in screen orientation
            teamA_TextView.setText(String.valueOf(teamA_score));
            teamB_score = savedInstanceState.getInt("countB");
            teamB_TextView.setText(String.valueOf(teamB_score));
        }
    }
    /**
     * This function adds three points on a three pointer for TeamA
     */
    public void reset(View view){
        TextView teamA_TextView = (TextView) findViewById(R.id.textView_TeamA_Score);
        TextView teamB_TextView = (TextView) findViewById(R.id.textView_TeamB_Score);
        teamA_score = 0;            // setting the values to 0
        teamB_score = 0;
        teamA_TextView.setText(""+0);   // setting views to 0
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
        teamA_TextView.setText(String.valueOf(teamA_score));
    }

    /**
     * This method displays TeamB's score value on the screen.
     */
    private void displayTeamBScore() {
        teamB_TextView.setText(String.valueOf(teamB_score));
    }

    /**
     *
     * This method is being overrided inorder to save the variable states so as to retrieve them after change in screen orientatin
     * The staes saved will then be accessed using the respectvie key values during the Oncreate() method execution
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("countA", teamA_score);
        outState.putInt("countB", teamB_score);
    }

}
