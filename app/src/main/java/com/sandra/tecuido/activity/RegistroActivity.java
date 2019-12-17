package com.sandra.tecuido.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.sandra.tecuido.R;
import com.sandra.tecuido.adapter.CitasMedicasAdapter;
import com.sandra.tecuido.data.User;
import com.sandra.tecuido.fragments.MenuFragment;

public class RegistroActivity extends AppCompatActivity {
    private EditText etUsuario, etEdad,etPeso,etMedico,etCuras,etContraseña;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_activity);

        etUsuario = findViewById(R.id.etUsuario);
        etEdad = findViewById(R.id.etEdad);
        etPeso = findViewById(R.id.etPeso);
        etContraseña = findViewById(R.id.etContraseña);
        etMedico = findViewById(R.id.etCentro_Medico);
        etCuras = findViewById(R.id.etCuras);
        spinner = findViewById(R.id.spinner);

        String[]opciones ={"DIVERSIDAD FUNCIONAL","ENFERMEDAD"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,opciones);
        spinner.setAdapter(adapter);
    }

}
