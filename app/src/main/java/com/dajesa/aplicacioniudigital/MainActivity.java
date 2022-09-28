package com.dajesa.aplicacioniudigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText user, pass;
    Button btnIngresar, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.User);
        pass = (EditText)findViewById(R.id.Pass);

        btnIngresar = (Button)findViewById(R.id.btnIngresar);
        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);

        btnIngresar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIngresar:
                break;

            case R.id.btnRegistrar:
                Intent i = new Intent(MainActivity.this, Registrar.class );
                startActivity(i);

             break;
        }
    }
}