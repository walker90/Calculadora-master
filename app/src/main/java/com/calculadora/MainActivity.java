package com.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText Val1, Val2;
    private TextView Lblres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Val1 = (EditText)findViewById(R.id.Val1);
        Val2 = (EditText)findViewById(R.id.Val2);
        Lblres = (TextView)findViewById(R.id.Lblres);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void sumar (View view) {

        String valor1 = Val1.getText().toString();
        String valor2 = Val2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int suma = num1 + num2;

        String resultado = String.valueOf(suma);
        Lblres.setText(resultado);

    }


    public void restar (View view) {
        String valor1 = Val1.getText().toString();
        String valor2 = Val2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int resta = num1 - num2;

        String resultado = String.valueOf(resta);
        Lblres.setText(resultado);
    }

    public void multiplicar (View view) {
        String valor1 = Val1.getText().toString();
        String valor2 = Val2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int multiplicacion = num1 * num2;

        String resultado = String.valueOf(multiplicacion);
        Lblres.setText(resultado);
    }

    public void dividir (View view) {
        String valor1 = Val1.getText().toString();
        String valor2 = Val2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int division = num1 / num2;

        String resultado = String.valueOf(division);
        Lblres.setText(resultado);

    }

    public void potencia (View view ) {
        String valor1 = Val1.getText().toString();
        String valor2 = Val2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int potenciacion = num1*num1;

        String resultado = String.valueOf(potenciacion);
        Lblres.setText(resultado);
    }


}
