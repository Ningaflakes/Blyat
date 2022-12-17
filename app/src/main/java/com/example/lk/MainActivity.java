package com.example.lk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result;
    private Button plus;
    private Button minus;
    private Button devide;
    private Button multiply;
    private EditText id_1;
    private EditText id_2;
    private Button goToActivity2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id_1=(EditText) findViewById(R.id.id_1);
        id_2=(EditText) findViewById(R.id.id_2);
        result=(TextView) findViewById(R.id.result);
        plus=(Button) findViewById(R.id.plus);
        minus=(Button) findViewById(R.id.minus);
        devide=(Button) findViewById(R.id.devide);
        multiply=(Button) findViewById(R.id.multiply);
        goToActivity2=(Button) findViewById(R.id.goToActivity2);
        goToActivity2.setOnClickListener(this);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a, b, c;
                String S1=id_1.getText().toString();
                String S2=id_2.getText().toString();
                a=Double.parseDouble(S1);
                b=Double.parseDouble(S2);
                c=a+b;
                String S=Double.toString(c);
                result.setText(S);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a, b, c;
                String S1=id_1.getText().toString();
                String S2=id_2.getText().toString();
                a=Double.parseDouble(S1);
                b=Double.parseDouble(S2);
                c=a-b;
                String S=Double.toString(c);
                result.setText(S);
            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a, b, c;
                String S1=id_1.getText().toString();
                String S2=id_2.getText().toString();
                a=Double.parseDouble(S1);
                b=Double.parseDouble(S2);
                c=a/b;
                String S=Double.toString(c);
                result.setText(S);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a, b, c;
                String S1=id_1.getText().toString();
                String S2=id_2.getText().toString();
                a=Double.parseDouble(S1);
                b=Double.parseDouble(S2);
                c=a*b;
                String S=Double.toString(c);
                result.setText(S);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        intent=new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        TextView headerView=(TextView)findViewById(R.id.header);
        androidx.constraintlayout.widget.ConstraintLayout layoutView=(androidx.constraintlayout.widget.ConstraintLayout) findViewById(R.id.layout);
        switch (id){
            case R.id.small_font:
                headerView.setTextSize(14);
                return true;
            case R.id.medium_font:
                headerView.setTextSize(30);
                return true;
            case R.id.big_font:
                headerView.setTextSize(60);
                return true;
            case R.id.red_background:
                headerView.setBackgroundColor(Color.argb(255, 255, 0, 0));;
                return true;
            case R.id.green_background:
                headerView.setBackgroundColor(Color.argb(255, 0, 255, 0));;
                return true;
            case R.id.blue_background:
                headerView.setBackgroundColor(Color.argb(255, 0, 0, 255));;
                return true;
            case R.id.black_color:
                headerView.setTextColor(Color.argb(255,0,0,0));
                return true;
            case R.id.white_color:
                headerView.setTextColor(Color.argb(255,255,255,255));
                return true;
            case R.id.red_color:
                headerView.setTextColor(Color.argb(255,255,0,0));
                return true;
            case R.id.first_background:
                layoutView.setBackgroundResource(R.drawable.background1);
                return true;
            case R.id.second_background:
                layoutView.setBackgroundResource(R.drawable.background2);
                return true;
            case R.id.third_background:
                layoutView.setBackgroundResource(R.drawable.background3);
                return true;
        }

    return super.onOptionsItemSelected(item);
    }

    public void onClickEventBtn (View view) {
        switch (view.getId()) {
            case R.id.button:
                Button btn = findViewById(R.id.button);
                Toast.makeText(
                        MainActivity.this, btn.getText ().toString (),
                        Toast.LENGTH_SHORT
                ).show();
                break;
        }
    }

    public void AlertWindow (View view) {
        final Button trigger = findViewById(R.id.alert_btn);
       AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
        a_builder.setMessage("Покрасить кнопку в другой цвет?")
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        trigger.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                    }
                })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick (DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = a_builder.create();
        alert.setTitle("Покраска кнопки");
        alert.show ();
    }

}

