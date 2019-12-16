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
import com.sandra.tecuido.data.Medicamento;
import com.sandra.tecuido.repository.MedicamentoRepository;
import com.sandra.tecuido.repository.MedicamentosSQLHelper;

public class AddInfoActivity extends AppCompatActivity {
    private TextView tv1 ,tvnombre, tvMediamento,tvHora;
    private EditText etmedicamento, etDosis, etObservaciones;
    private RadioGroup rgOpciones;
    private Button guardarButton;
    private MedicamentoRepository medicamentoRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_info);

        tv1 = findViewById(R.id.tv1);
        tvnombre = findViewById(R.id.tvnombre);
        tvHora = findViewById(R.id.tvHora);
        tvMediamento = findViewById(R.id.tvMedicamento);
        etmedicamento = findViewById(R.id.etmedicamento);
        etDosis = findViewById(R.id.etDosis);
        etObservaciones = findViewById(R.id.etObservaciones);
        rgOpciones = findViewById(R.id.rgOpciones);
        guardarButton = findViewById(R.id.btGuardar);
        initonclick();

        medicamentoRepository = new MedicamentoRepository(new MedicamentosSQLHelper(this, "medicamentoRepository", null, 1));
    }

    private void initonclick() {
        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name  = etmedicamento .getText().toString();
                String dosis = etDosis.getText().toString();
                String observaciones = etObservaciones.getText().toString();
                Medicamento medicamento = new Medicamento(name, null, 0, dosis, observaciones);
               boolean guardado =  medicamentoRepository.guardar(medicamento);
                if (guardado == false) {
                    Toast.makeText(getApplicationContext(), "Error cargando datos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Se cargaron los datos del artículo", Toast.LENGTH_SHORT).show();
                }

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


