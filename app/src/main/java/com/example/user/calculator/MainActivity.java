package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnClr,btnEquals;
    float first_num,second_num;
    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnClr = (Button) findViewById(R.id.btnClr);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText(result.getText().toString() + "9");
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                result.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                first_num=Float.parseFloat(result.getText().toString());
                operator = "+";
                result.setText("");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
               first_num=Float.parseFloat(result.getText().toString());
                operator = "-";
                result.setText("");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                first_num=Float.parseFloat(result.getText().toString());
                operator = "*";
                result.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                first_num=Float.parseFloat(result.getText().toString());
                operator = "/";
                result.setText("");
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_num = Float.parseFloat(result.getText().toString());
                if (operator.equals("+")) {
                    result.setText(Float.toString(first_num + second_num));
                } else if (operator.equals("-")) {
                    result.setText(Float.toString(first_num - second_num));
                } else if (operator.equals("*")) {
                    result.setText(Float.toString(first_num * second_num));
                } else {
                    if (second_num == 0) {
                        result.setText("Gadhe");
                    } else {
                        result.setText(Float.toString(first_num / second_num));
                    }
                }

            }
        });
    }
}
