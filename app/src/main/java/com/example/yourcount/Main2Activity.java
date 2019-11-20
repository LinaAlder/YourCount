package com.example.yourcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    boolean button;
    int from, to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        textView = findViewById(R.id.textView);
        from = intent.getIntExtra("from", 0);
        to = intent.getIntExtra("to", 100);

        if (from > to ) {
            int с = from;
            from = to;
            to = с;
        }

        askQuestion();

    }

    public void askQuestion() {
         if (to - from > 1)
             textView.setText(String.format("Is your number greater than %d?", from + (to - from)/2));
         else
             textView.setText(String.format("Your number %d", to));
    }


    public void yes(View v) {
        from += (to - from) / 2;
        button = true;
        askQuestion();
    }

    public void no(View v) {
        to -= (to - from) / 2;
        button = true;
        askQuestion();
    }
}
