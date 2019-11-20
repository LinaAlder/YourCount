package com.example.yourcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText from, to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.from = findViewById(R.id.editText);
        this.to = findViewById(R.id.editText2);

    }

    public void start(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("from", Integer.parseInt(this.from.getText().toString()));
        intent.putExtra("to", Integer.parseInt(this.to.getText().toString()));
        startActivity(intent);
    }
}
