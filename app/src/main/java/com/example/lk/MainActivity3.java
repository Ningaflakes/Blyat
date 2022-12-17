package com.example.lk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewResult;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnDevide;
    private Button btnMutiply;
    private EditText number1;
    private EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        textViewResult=(TextView) findViewById(R.id.textViewResult);
        btnPlus=(Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);
        btnMinus=(Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        btnDevide=(Button) findViewById(R.id.btnDevide);
        btnDevide.setOnClickListener(this);
        btnMutiply=(Button) findViewById(R.id.btnMultiply);
        btnMutiply.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        float num1;
        float num2;
        float result = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        switch (v.getId()) {
            case R.id.btnPlus:
                result = num1 + num2;
                break;
            case R.id.btnMinus:
                result = num1 - num2;
                break;
            case R.id.btnMultiply:
                result = num1 * num2;
                break;
            case R.id.btnDevide:
                result = num1 / num2;
                break;
            default:
                break;
        }

        textViewResult.setText("" + result);
    }
}