package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int cornerTeamA = 0;
    int foulTeamA = 0;
    int cornerTeamB = 0;
    int foulTeamB = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;


    /**
     * Resets all the scores for both teams to 0 .
     */

    public void resetScore(View v) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        cornerTeamA = 0;
        cornerTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;



        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayCornerForTeamA(cornerTeamA);
        displayCornersTeamB(cornerTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulsTeamB(foulTeamB);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
        displayRedCardsTeamB(redCardsTeamB);
        displayYellCardsTeamB(yellowCardsTeamB);

    }


    /**
     * This Method increases score by 1 Team A
     */
    public void addOneGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This Method increases amount of corners for Team A
     */
    public void addOneCornerForTeamA(View v) {
        cornerTeamA = cornerTeamA + 1;
        displayCornerForTeamA(cornerTeamA);

/**
 * This method increases number of fauls Team A
 */

    }

    public void addOneFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }


    /**
     * This method increases number of yell cards  Team A
     */


    public void addOneYellowA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    /**
     * This method increases number of red cards  Team A
     */


    public void addOneRedA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsTeamA(redCardsTeamA);
    }


    /**
     * This Method increases score by 1 Team B
     */
    public void addOneGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This Method increases amount of corners for Team B
     */
    public void addOneCornerForTeamB(View v) {
        cornerTeamB = cornerTeamB + 1;
        displayCornersTeamB(cornerTeamB);

    }

    /**
     * This Method increases amount of fouls for Team B
     */
    public void addOneFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulsTeamB(foulTeamB);
    }

    /**
     * This Method increases amount of Yell cards   for Team B
     */
    public void addOneYellowB(View V) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellCardsTeamB(yellowCardsTeamB);
    }
    /**
     * This Method increases amount of Red cards   for Team B
     */
    public void addOneRedB (View V) {
        redCardsTeamB = redCardsTeamB + 1 ;
        displayRedCardsTeamB(redCardsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));


    }

    /**
     * Displays the given score for Team A.
     */

    public void displayFoulTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.foul_count_a);

        scoreView.setText(String.valueOf(score));


    }

    /**
     * Displays the number of corners Team A
     */

    public void displayCornerForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.corner_count_a);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the number of yellow card Team A
     */

    public void displayYellowCardsTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.yellow_cards_TeamA);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the number of Red cards Team A
     */

    public void displayRedCardsTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.red_cardsTeamA);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the corners for Team B.
     */
    public void displayCornersTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_count_b);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_count_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of Yell cards Team B
     */

    public void displayYellCardsTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.yellow_cards_TeamB);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the number of Red cards Team B
     */

    public void displayRedCardsTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.red_cardsTeamB);

        scoreView.setText(String.valueOf(score));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
}
