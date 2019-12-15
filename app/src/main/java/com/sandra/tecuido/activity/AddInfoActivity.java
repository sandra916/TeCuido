package com.sandra.tecuido.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.sandra.tecuido.R;

public class AddInfoActivity extends AppCompatActivity {
    private TextView tv1 ,tvnombre, tvMediamento,tvHora;
    private EditText etmedicamento, etDosis;
    private RadioGroup rgOpciones;
    private Button guardarButton;

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
        guardarButton = findViewById(R.id.btGuardar);
        initonclick();
    }

    private void initonclick() {
        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Medicamento guardado",Toast.LENGTH_LONG).show();
                onBackPressed();
            }
        });
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
       // Intent intent = new Intent(this, Medicacion.class);

    }

    /*public String leerDato (String dosis){
            String medicamento = etmedicamento.getText().toString();
            String dosis = etDosis.getText().toString();
        }
            return dosis;

    } */
}


