package com.sandra.tecuido.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sandra.tecuido.R;

public class LoginActivity extends AppCompatActivity {

    private EditText nombre, contraseña;
    private TextView recordarContraseña, textError;
    private Button btnAcceder;


    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.login_activity);

        nombre = findViewById(R.id.nombreUsuario);
        contraseña = findViewById(R.id.contraseñaUsuario);

        textError = findViewById(R.id.textViewError);

        recordarContraseña = findViewById(R.id.rememberPassword);
        btnAcceder = findViewById(R.id.btnAcceder);
        initOnclick();
    }

    private void initOnclick() {
        //Cuando un usuario haga click
        recordarContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUserCredentials();
            }
        });
    }

    private void goToMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void showToast() {
        Toast.makeText(getApplicationContext(), "Le hemos enviado la contraseña a su e-mail", Toast.LENGTH_LONG).show();
    }

    private void checkUserCredentials() {
       if (nombre.getText().toString().equalsIgnoreCase("Sandra1") && contraseña.getText().toString().equalsIgnoreCase("12343")) {
           goToMainActivity();
        } else {
            textError.setVisibility(View.VISIBLE);
        }
       goToMainActivity();
    }
    public void altaUsuario(View view){
        Intent intent = new Intent(this, RegistroActivity.class);
        this.startActivity(intent);
    }
}
