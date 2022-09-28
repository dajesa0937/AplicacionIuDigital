package com.dajesa.aplicacioniudigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrar extends AppCompatActivity  implements View.OnClickListener{

    EditText us, pas, nom, ap;
    Button reg, can;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.registrar);
        us = (EditText)findViewById(R.id.RegUser);
        pas = (EditText)findViewById(R.id.RegPass);
        nom = (EditText)findViewById(R.id.RegName);
        ap = (EditText)findViewById(R.id.RegApellido);

        reg = (Button)findViewById(R.id.btnRegistrar);
        can = (Button)findViewById(R.id.btnRegCancelar);

        reg.setOnClickListener(this);
        can.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEditRegistrar:
                break;
            case R.id.btnRegCancelar:
                Intent i = new Intent(Registrar.this, MainActivity.class);
                startActivity(i);
                finish();

                break;
        }
    }
}