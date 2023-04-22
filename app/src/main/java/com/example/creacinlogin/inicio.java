package com.example.creacinlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

   private EditText usuario , contra;
    Button login , register;
    CheckBox termino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

       usuario = (EditText) findViewById(R.id.txt_nombre);
       contra = (EditText) findViewById(R.id.txt_password);
       login = findViewById(R.id.btnlogin);
       termino = findViewById(R.id.checkBox2);
    }


    public void Login (View h){
        Bundle enviadatos = new Bundle();
        enviadatos.putString("Datousuario", usuario.getText().toString());
        enviadatos.putString("Datocontra", contra.getText().toString());

        String usu = usuario.getText().toString();
        String con =  contra.getText().toString();

        if(termino.isChecked() == false) {
            Toast.makeText(this, "Terminos", Toast.LENGTH_LONG).show();
        }
        if(usu.length() == 0){
            Toast.makeText(this, "Ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(con.length() == 0){
            Toast.makeText(this, "Ingresar una contraseña", Toast.LENGTH_LONG).show();
        }
        if(usu.length() !=0 && con.length()!=0){
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show();
            Intent ir = new Intent( this,  Informacion.class  );
            ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
            ir.putExtras(enviadatos);
            startActivity(ir);
        }

    }

}