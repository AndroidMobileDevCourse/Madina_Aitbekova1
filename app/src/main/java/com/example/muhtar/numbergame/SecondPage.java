package com.example.muhtar.numbergame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondPage extends AppCompatActivity {

    Integer number1=0;
    Integer number2=0;
    int answer1;
    Integer score=0;
    TextView num1text;
    TextView num2text;
    TextView result;
    Button less;
    Button equal;
    Button more;

    private void random() {
        this.number1 = new Random().nextInt(10 - 1) + 1;
        this.number2 = new Random().nextInt(10 - 1) + 1;
        this.num1text.setText(this.number1.toString());
        this.num2text.setText(this.number2.toString());

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        num1text = findViewById(R.id.num1);
        num2text = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        less = findViewById(R.id.less);
        equal = findViewById(R.id.equal);
        more = findViewById(R.id.more);


        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(-1);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(0);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(1);
            }
        });

        this.random();
    }


    private void check(int answer) {
        answer1 = number1.compareTo(number2);
        if (answer == answer1) {
            this.score = this.score + 1;
        } else {
            this.score = this.score - 1;
        }
        this.result.setText("Score: " + this.score);
        this.random();
    }

}
