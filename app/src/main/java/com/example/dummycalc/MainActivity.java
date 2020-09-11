package com.example.dummycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado, numero1, numero2;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.textoResultados);
        numero1 = (TextView) findViewById(R.id.numero1);
        numero2 = (TextView) findViewById(R.id.numero2);

        boton = (Button) findViewById(R.id.botonSumar);
    }

    public void sumar(View view){
        int a, b, c;
        a = Integer.parseInt(numero1.getText().toString());
        b = Integer.parseInt(numero2.getText().toString());
        c = a+b;

        resultado.setText(c+"");

        //comentario nuevo

        //otro comentario
    }
}