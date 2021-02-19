package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we have two images left dice and right dice
        // link the code to those two image view inside your layout (activity view)
        ImageView leftDie = findViewById(R.id.Left_dice);
        ImageView rightDie = findViewById(R.id.Right_dice);
        Button rollButton = findViewById(R.id.roll_button);
        Button lowerButton = findViewById(R.id.lower_button);

        int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right image view     inside your app
        // Click listener  look for an event on your view components
        rollButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              // we need to create a random interger for picking the dices
                                              Random rand = new Random();

                                              int randLeftDie = rand.nextInt(6);
                                              int randRightDie = rand.nextInt(6);


                                              Log.d("left die", String.valueOf(randLeftDie));
                                              Log.d("right die", String.valueOf(randRightDie));


                                              leftDie.setImageResource(diceArray[randLeftDie]);
                                              rightDie.setImageResource(diceArray[randRightDie]);

                                              if(randLeftDie > randRightDie){
                                                  TextView textView = (TextView) findViewById(R.id.result);
                                                  textView.setText("COMPUTER WIN");
                                              }
                                              else
                                              {
                                                  TextView textView = (TextView) findViewById(R.id.result);
                                                  textView.setText("USER WIN");
                                              }
                                             if(randLeftDie == randRightDie){
                                                 TextView textView = (TextView) findViewById(R.id.result);
                                                 textView.setText("MATCH TIE");
                                             }
                                          }
                                      });
        lowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // we need to create a random interger for picking the dices
                Random rand1 = new Random();

                int randLeftDie1 = rand1.nextInt(6);
                int randRightDie1 = rand1.nextInt(6);


                Log.d("left die", String.valueOf(randLeftDie1));
                Log.d("right die", String.valueOf(randRightDie1));


                leftDie.setImageResource(diceArray[randLeftDie1]);
                rightDie.setImageResource(diceArray[randRightDie1]);
                if(randLeftDie1 < randRightDie1){
                    TextView textView = (TextView) findViewById(R.id.result);
                    textView.setText("COMPUTER WIN");
                }
                else {
                    TextView textView = (TextView) findViewById(R.id.result);
                    textView.setText("USER WIN");
                }
                if(randLeftDie1 == randRightDie1){
                    TextView textView = (TextView) findViewById(R.id.result);
                    textView.setText("MATCH TIE");
                }

            }
        });




}}