package com.example.creacinlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

   private EditText usuario , contra;
    Button login , register;
    RadioButton c1,c2;
    CheckBox termino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

       usuario = (EditText) findViewById(R.id.txt_nombre);
       contra = (EditText) findViewById(R.id.txt_password);
       login = findViewById(R.id.btnlogin);
       termino = findViewById(R.id.checkBox2);

       c1 = (RadioButton) findViewById(R.id.rbhombre);
       c2 = (RadioButton) findViewById(R.id.rbmujer);
    }


    public void Login (View view){
        Bundle enviadatos = new Bundle();
        String genero = "";
        enviadatos.putString("Datousuario", usuario.getText().toString());
        enviadatos.putString("Datocontra", contra.getText().toString());
        enviadatos.putString("genero",genero);

        String usu = usuario.getText().toString();
        String con =  contra.getText().toString();

        if(c1.isChecked()){
            genero+="Hombre";
            if(c1.isChecked())
                genero+="Mujer";

        } else{
            Toast.makeText(this, "Selec Genero", Toast.LENGTH_LONG).show();
        }



        if(termino.isChecked() == false) {
            Toast.makeText(this, "Terminos", Toast.LENGTH_SHORT).show();
        }
        if(usu.length() == 0){
            Toast.makeText(this, "Ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if(con.length() == 0){
            Toast.makeText(this, "Ingresar una contraseña", Toast.LENGTH_SHORT).show();
        }
        if(usu.length() !=0 && con.length()!=0 && termino.isChecked() == false | c1.isChecked() | c2.isChecked()){
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_SHORT).show();
            Intent ir = new Intent( this,  Informacion.class  );
            ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
            ir.putExtras(enviadatos);
            startActivity(ir);
        }

    }

}