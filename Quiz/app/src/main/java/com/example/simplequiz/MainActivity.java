//Saurabh Rameshwar Nikam
package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// This is the simple quiz application which has different MCQ which has to be answered
// It gives the score at the end of the test i.e at the end of the 10th question test will be over and we will have score in the form of Toast

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    TextView headText;
    TextView questionText;
    Button optionA;
    Button optionB;
    Button optionC;
    Button optionD;
    private FirebaseAnalytics mFirebaseAnalytics;

    String Question [] = {
            "1. 'OS' computer abbreviation usually means?",
            "2. 'MOV' extension refers usually to what kind of file?",
            "3. '.MPG' extension refers usually to what kind of file?",
            "4. What is part of a database that holds only one type of information?",
            "5. Who developed Yahoo?",
            "6. 'DB' computer abbreviation usually means?",
            "7. '.INI' extension refers usually to what kind of file?",
            "8. The sampling rate, (how many samples per second are stored) for a CD is?",
            "9. What do we call a network whose elements may be separated by some distance? It usually involves two or more small networks and dedicated high-speed telephone lines.",
            "10. Sometimes computers and cache registers in a foodmart are connected to a UPS system. What does UPS mean?"
    };

    String ArrayA [] = {
            "(A) Order of Significance",
            "(A) Image file",
            "(A) Word Perfect Document file",
            "(A) Report",
            "(A) Dennis Ritchie & Ken Thompson",
            "(A) Database",
            "(A) Image file",
            "(A) 48.4 kHz",
            "(A) URL (Universal Resource Locator)",
            "(A) United Parcel Service"
    };
    String ArrayB [] = {
            "(B) Open Software",
            "(B) Animation/movie file",
            "(B) MS Office document",
            "(B) Field",
            "(B) David Filo & Jerry Yang",
            "(B) Double Byte",
            "(B) System file",
            "(B) 22,050 Hz",
            "(B) LAN (Local Area Network)",
            "(B) Uniform Product Support"
    };
    String ArrayC[] = {
            "(C) Operating System",
            "(C) Audio file",
            "(C) Animation/movie file",
            "(C) Record",
            "(C) Vint Cerf & Robert Kahn",
            "(C) Data Block",
            "(C) Hypertext related file",
            "(C) 44.1 kHz",
            "(C) WAN (Wide Area Network)",
            "(C) Under Paneling Storage"
    };
    String ArrayD [] = {
            "(D) Optical Sensor",
            "(D) MS Office document",
            "(D) Image file",
            "(D) File",
            "(D) Steve Case & Jeff Bezos",
            "(D) Driver Boot",
            "(D) Image Color Matching Profile file",
            "(D) 48 kHz",
            "(D) World Wide Web",
            "(D) Uninterruptable Power Supply"
    };

    String Answers [] = {
            "(C) Operating System",
            "(B) Animation/movie file",
            "(C) Animation/movie file",
            "(B) Field",
            "(B) David Filo & Jerry Yang",
            "(A) Database",
            "(B) System file",
            "(C) 44.1 kHz",
            "(C) WAN (Wide Area Network)",
            "(D) Uninterruptable Power Supply"
    };

    int index = 0;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        headText = findViewById(R.id.header);
        questionText = findViewById(R.id.question);
        questionText.setText(Question[index]);
        optionA = findViewById(R.id.option1);
        optionB = findViewById(R.id.option2);
        optionC = findViewById(R.id.option3);
        optionD = findViewById(R.id.option4);

        optionA.setText(ArrayA[index]);
        optionB.setText(ArrayB[index]);
        optionC.setText(ArrayC[index]);
        optionD.setText(ArrayD[index]);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index < Question.length){
                    if (optionA.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length) {
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is"+score, Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionB.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length){
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is"+score, Toast.LENGTH_LONG).show();                    }

                }
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionC.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length){
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is"+score, Toast.LENGTH_LONG).show();                    }
                }
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionD.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length){
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is"+score, Toast.LENGTH_LONG).show();                    }
                }
            }
        });
    }
}