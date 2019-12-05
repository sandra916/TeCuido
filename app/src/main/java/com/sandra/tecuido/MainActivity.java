package com.sandra.tecuido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }
    public void farmacia (View view){
        Intent pharmacy = new Intent(this,Farmacia.class);
        startActivity(pharmacy);
    }

    public void medicacion (View view){
        Intent medication = new Intent(this, Medicacion.class);
        startActivity(medication);
    }

    public void salir(View v) {
       finish();
    }
}
