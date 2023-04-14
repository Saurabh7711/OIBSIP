
package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button convert;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView3);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number = Integer.parseInt(editText.getText().toString());
                double meter = 0.3048 * number;   ;
                textView.setText(number+" feet is "+meter+" in meters");
            }
        });
    }
}