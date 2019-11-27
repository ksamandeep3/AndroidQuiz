package com.example.androidquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton btn1, btn2, btn3, btn4, btn5;
    Button Okbtn;
    EditText et1;
    Integer result = 0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn2rg1);
        btn2 = findViewById(R.id.btn2rg2);
        btn3 = findViewById(R.id.btn2rg3);
        btn4 = findViewById(R.id.btn1rg4);
        btn5 = findViewById(R.id.btn2rg5);
        Okbtn = findViewById(R.id.okbtn);
        et1 = findViewById(R.id.etres);


        Okbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (btn1.isChecked()) {
                    result++;
                }
                if (btn2.isChecked()) {
                    result++;
                }
                if (btn3.isChecked()) {
                    result++;
                }
                if (btn4.isChecked()) {
                    result++;
                }
                if (btn5.isChecked()) {
                    result++;
                }
                et1.setText(result.toString());
                Okbtn.setEnabled(false);
               //tv.setTextColor(558B2F);


            }

        });

    }


}







