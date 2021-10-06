package com.example.logueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class homeAvtivity extends AppCompatActivity {

    TextView edt_email = null;
    EditText txt_contraseña = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_avtivity);
        edt_email = (TextView) findViewById(R.id.edt_email);
        Intent intent = getIntent();
        if(intent != null){
            String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL1);
            String password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD1);
            edt_email.setText(email);
            Toast.makeText(this, "Buenos dias" + email, Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Debes logearte" , Toast.LENGTH_LONG).show();
        }
    }
}