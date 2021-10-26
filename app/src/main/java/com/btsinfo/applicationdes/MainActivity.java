package com.btsinfo.applicationdes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public void resultat (View View){
        CheckBox face4 = (CheckBox) findViewById(R.id.face4);
        CheckBox face6 = (CheckBox) findViewById(R.id.face6);
        CheckBox face8 = (CheckBox) findViewById(R.id.face8);
        CheckBox face10 = (CheckBox) findViewById(R.id.face10);
        CheckBox face12 = (CheckBox) findViewById(R.id.face12);
        CheckBox face20 = (CheckBox) findViewById(R.id.face20);

        CheckBox de1 = (CheckBox) findViewById(R.id.nb1);
        CheckBox de2 = (CheckBox) findViewById(R.id.nb2);
        CheckBox de3 = (CheckBox) findViewById(R.id.nb3);
        CheckBox de4 = (CheckBox) findViewById(R.id.nb4);

        TextView resultat = (TextView) findViewById(R.id.result);
        TextView resutat2 = (TextView) findViewById(R.id.result2);
        TextView resutat3 = (TextView) findViewById(R.id.result3);
        TextView resutat4 = (TextView) findViewById(R.id.result4);

        SecureRandom Myrandom = new SecureRandom();

        if (face4.isChecked()){

            int min = 1;
            int max = 5;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));
        }

        else if(face6.isChecked()){
            int min = 1;
            int max = 7;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));
        }

        else if(face8.isChecked()){
            int min = 1;
            int max = 9;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));
        }

        else if(face10.isChecked()){
            int min = 1;
            int max = 11;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));
        }

        else if(face12.isChecked()){
            int min = 1;
            int max = 13;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));
        }

        else if(face20.isChecked()){
            int min = 1;
            int max = 21;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));
        }

        //Plusieurs lancement 4 faces

         if (face4.isChecked() & de2.isChecked()){
            int min = 1;
            int max = 5;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));
        }

         else if(face4.isChecked() & de3.isChecked()){
            int min = 1;
            int max = 5;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));
        }

         else if(face4.isChecked() & de4.isChecked()){
             int min = 1;
             int max = 5;
             int val = (Myrandom.nextInt(max-min)+1);
             resultat.setText(Integer.toString(val));


             int val2 = (Myrandom.nextInt(max-min)+1);
             resutat2.setText(Integer.toString(val2));


             int val3 = (Myrandom.nextInt(max-min)+1);
             resutat3.setText(Integer.toString(val3));

             int val4 = (Myrandom.nextInt(max-min)+1);
             resutat4.setText(Integer.toString(val4));
         }

         else if(face4.isChecked() & de4.isChecked()){
             int min = 1;
             int max = 5;
             int val = (Myrandom.nextInt(max-min)+1);
             resultat.setText(Integer.toString(val));


             int val2 = (Myrandom.nextInt(max-min)+1);
             resutat2.setText(Integer.toString(val2));


             int val3 = (Myrandom.nextInt(max-min)+1);
             resutat3.setText(Integer.toString(val3));

             int val4 = (Myrandom.nextInt(max-min)+1);
             resutat4.setText(Integer.toString(val4));

         }

         //Plusieurs lancement 6 faces

        if (face6.isChecked() & de2.isChecked()){
            int min = 1;
            int max = 7;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));
        }

        else if(face6.isChecked() & de3.isChecked()){
            int min = 1;
            int max = 7;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));
        }

        else if(face6.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 7;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));
        }

        else if(face6.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 7;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));

        }

        //Plusieurs lancement 8 faces


        if (face8.isChecked() & de2.isChecked()){
            int min = 1;
            int max = 9;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));
        }

        else if(face8.isChecked() & de3.isChecked()){
            int min = 1;
            int max = 9;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));
        }

        else if(face8.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 9;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));
        }

        else if(face8.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 9;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));

        }

        //Plusieurs lancement 10 faces

        if (face10.isChecked() & de2.isChecked()){
            int min = 1;
            int max = 11;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));
        }

        else if(face10.isChecked() & de3.isChecked()){
            int min = 1;
            int max = 11;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));
        }

        else if(face10.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 11;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));
        }

        else if(face10.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 11;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));

        }

        //Plusieurs lancement 12 faces

        if (face12.isChecked() & de2.isChecked()){
            int min = 1;
            int max = 13;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));
        }

        else if(face12.isChecked() & de3.isChecked()){
            int min = 1;
            int max = 13;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));
        }

        else if(face12.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 13;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));
        }

        else if(face12.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 13;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));

        }

        //Plusieurs lancement 20 faces

        if (face20.isChecked() & de2.isChecked()){
            int min = 1;
            int max = 21;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));
        }

        else if(face20.isChecked() & de3.isChecked()){
            int min = 1;
            int max = 21;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));
        }

        else if(face20.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 21;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));
        }

        else if(face20.isChecked() & de4.isChecked()){
            int min = 1;
            int max = 21;
            int val = (Myrandom.nextInt(max-min)+1);
            resultat.setText(Integer.toString(val));


            int val2 = (Myrandom.nextInt(max-min)+1);
            resutat2.setText(Integer.toString(val2));


            int val3 = (Myrandom.nextInt(max-min)+1);
            resutat3.setText(Integer.toString(val3));

            int val4 = (Myrandom.nextInt(max-min)+1);
            resutat4.setText(Integer.toString(val4));

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}