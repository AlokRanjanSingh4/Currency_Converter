package com.example.currencyconverter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, doller, yen, dinar, bitcoin, rubel, ausdoller, candoller;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.eur);
        pound = findViewById(R.id.pon);
        doller = findViewById(R.id.dol);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.btc);
        rubel = findViewById(R.id.rus);
        ausdoller = findViewById(R.id.aus);
        candoller = findViewById(R.id.can);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();

                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.012;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText("" + decimalFormat.format(num2));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();

                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.022;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        doller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();

                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.010;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.018;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setError(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.19;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.16;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.15;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        ausdoller.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.14;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });

        candoller.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    textView.setText(null);
                    editText.setError("Empty User Input");
                }
                else {
                    double num1, num2;
                    num1 = Double.parseDouble(string);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    num2 = num1 * 0.13;
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(num2));
                }
            }
        });
    }
}
