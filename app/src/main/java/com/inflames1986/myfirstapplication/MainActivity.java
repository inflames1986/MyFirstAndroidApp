package com.inflames1986.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digits);

        EditText firstDigit = findViewById(R.id.first_digit);
        EditText secondDigit = findViewById(R.id.second_digit);

        Button compareButton = findViewById(R.id.btn_compare);

        TextView result = findViewById(R.id.result);

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputOne = firstDigit.getText().toString();
                String inputTwo = secondDigit.getText().toString();

                try {

                    if (Integer.valueOf(inputOne) == Integer.valueOf(inputTwo)) {
                        result.setText("Equal");
                    } else {
                        result.setText("Not Equal");
                    }
                } catch (NumberFormatException exc) {

                    result.setText("Use Only Digits!");
                }
            }
        });
    }
}