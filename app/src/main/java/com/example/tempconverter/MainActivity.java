package com.example.tempconverter;

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
        setContentView(R.layout.activity_main);

        Button convertBtn = (Button) findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText fahrenheitEditText = (EditText) findViewById(R.id.fahrenheitEditText);
                TextView celciusTextView = (TextView) findViewById(R.id.celciusTextView);

                String finaltemp;
                double fahrenheitNum = Double.parseDouble(fahrenheitEditText.getText().toString());
                double result = (fahrenheitNum - 32) * 5/9;
                celciusTextView.setText(result + " °C");

            }
        });
    }
}
