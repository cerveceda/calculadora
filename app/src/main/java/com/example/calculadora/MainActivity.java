package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declarar variables globales para los controles
    EditText etNro1, etNro2, etResultado;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Escuchar los controles de la vista
        etNro1 = (EditText) findViewById(R.id.etNro1);
        etNro2 = (EditText) findViewById(R.id.etNro2);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);

        //Proceso de evento
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir();
            }
        });
    }

    private void Dividir() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        if(nro2==0) {
            etResultado.setText("Error: Division");
        }else {
            double division = nro1 / nro2;
            etResultado.setText(String.valueOf(division));
        }
    }

    private void Sumar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double suma = nro1+nro2;
        etResultado.setText(String.valueOf(suma));
    }
}