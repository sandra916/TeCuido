package com.sandra.tecuido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private TextView tvRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_main);
        tvRegistro = findViewById(R.id.textViewRegistro);

        //Cuando un usuario haga click
        tvRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aqui introduces la funcion que quieras activar cuando el ususario pulsa click
                routeToRegister();

            }
        });
    }

    private void routeToRegister() {

    }


    public void registro(View View) {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}