package com.example.calculadorapam;


import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    TextView er;
    Button btnAdd;
    Button btnSub;
    Button btnMulti;
    Button btnDiv;

    int n1, n2, add, sub, div, multi;
    char mss;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        er = (TextView) findViewById(R.id.er);
        result = (TextView) findViewById(R.id.result);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMulti = (Button) findViewById(R.id.btnMulti);
    }



        public void calculaSoma(View view) {

            try {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                add = n1 + n2;
                result.setText(Integer.toString(add));
                er.setText("");
            }catch (ArithmeticException ex){
                er.setText("Erro: " +  ex);

            }

        }

        public void calculaSub(View view) {

            try {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());


                sub = n1 - n2;
                result.setText(Integer.toString(sub));
                er.setText("");
            }catch (ArithmeticException ex){
                er.setText("Erro: " +  ex);

            }
        }

        public void calculaMult(View view) {

            try {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());


                multi = n1 * n2;
                result.setText(Integer.toString(multi));
                er.setText("");
            }catch (ArithmeticException ex){
                er.setText("Erro: " +  ex);

            }
        }

        public void calculaDiv(View view) {

            try {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());


                div = n1 / n2;
                result.setText(Integer.toString(div));
                er.setText("");
            }catch (ArithmeticException es){
                er.setText("Erro: " +  es);
            }
        }
}





