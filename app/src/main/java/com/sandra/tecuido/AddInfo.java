package com.sandra.tecuido;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class AddInfo extends AppCompatActivity {
    private TextView tv1 ,tvnombre, tvMediamento,tvHora;
    private EditText etmedicamento, etDosis;
    private RadioGroup rgOpciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_info);

        tv1 = findViewById(R.id.tv1);
        tvnombre = findViewById(R.id.tvnombre);
        tvHora = findViewById(R.id.tvHora);
        tvMediamento = findViewById(R.id.tvMedicamento);
        etmedicamento = findViewById(R.id.etmedicamento);
        rgOpciones = findViewById(R.id.rgOpciones);
    }
    public void hora(View view){
        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tvHora.setText(hourOfDay + ":" + minute);

            }
        },
                10,20,true).show();
    }
    public void guardar(View view) {

    }
    public void volver(View view) {
        Intent intent = new Intent(this, Medicacion.class);

    }

    /*public String leerDato (String dosis){
            String medicamento = etmedicamento.getText().toString();
            String dosis = etDosis.getText().toString();
        }
            return dosis;

    } */
}


