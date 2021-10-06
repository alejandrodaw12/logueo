package com.example.logueo;

import static android.content.Intent.EXTRA_EMAIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_EMAIL1 = "pepe";
    public static final String EXTRA_PASSWORD1 = "pepe";
    EditText txt_email = null;
    EditText txt_contraseña = null;
    String usuario = "hola@hola.com";
    String clave = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_email = (EditText) findViewById(R.id.txt_email);
        txt_contraseña = (EditText) findViewById(R.id.txt_contraseña);
    }

    public void acceder(View view) {
        //Button b = (Button) view;
        //b.setText("ENTRAR");
        String email = String.valueOf(txt_email.getText());
        String password = String.valueOf(txt_contraseña.getText());
        boolean validarOk = validar(email, password);
        if(validarOk){
            Intent intent = new Intent(this, homeAvtivity.class);
            intent.putExtra(EXTRA_EMAIL, email);
            intent.putExtra(EXTRA_PASSWORD1, password);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Error en el email o en la contraseña", Toast.LENGTH_LONG).show();
        }
    }

    private boolean validar(String email, String password) {
        if(email.isEmpty()){
            txt_email.setError("Debes poner un email");
            return false;
        }
        if(password.isEmpty()){
            txt_contraseña.setError("Debes poner una contraseña");
            return false;
        }
        if(email.equalsIgnoreCase(usuario) && password.equals(clave)){
            return true;
        }
        return false;
    }
}