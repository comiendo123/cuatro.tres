package com.example.a43;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =(EditText) findViewById(R.id.editText);
        calcular =(Button) findViewById(R.id.ok);
        resultado= (TextView) findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //asigna valor a resultado TextView
                resultado.setText(fibonacci(Integer.parseInt(editText.getText().toString())));


            }
        });
    }

    private  String fibonacci(int n){
      String text ="";
      String res ="";
        ArrayList<BigInteger> fib = new ArrayList<>();
        BigInteger pri = new BigInteger("0");
        BigInteger sec = new BigInteger("1");
        fib.add(pri);
        fib.add(sec);
        for (int i =1 ; i<=n ; i++){
            fib.add(fib.get(i).add(fib.get(i-1)));


        }
        for (int i =1 ; i<=n ; i++){
            text=text + fib.get(i)+"\n";

        }
        return text;
    }
}
