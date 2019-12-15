package com.sandra.tecuido.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.sandra.tecuido.R;

public class RegistroActivity extends AppCompatActivity {
    private EditText etUsuario, etEdad,etPeso,etMedico,etCuras;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_activity);

        etUsuario = findViewById(R.id.etUsuario);
        etEdad = findViewById(R.id.etEdad);
        etPeso = findViewById(R.id.etPeso);
        etMedico = findViewById(R.id.etCentro_Medico);
        etCuras = findViewById(R.id.etCuras);
        spinner = findViewById(R.id.spinner);

        String[]opciones ={"DIVERSIDAD FUNCIONAL","ENFERMEDAD"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,opciones);
        spinner.setAdapter(adapter);
    }
}
