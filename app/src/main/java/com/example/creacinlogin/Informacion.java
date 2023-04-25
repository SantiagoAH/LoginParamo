package com.example.creacinlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Informacion extends AppCompatActivity {

    TextView nombre;
    TextView contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        nombre = findViewById(R.id.infoNombre);
        contra = findViewById(R.id.infoContra);


        Bundle recibeDatos = getIntent().getExtras();
        String info = recibeDatos.getString("Datousuario"); // recojemos los datos
        nombre.setText(info);

        String cont = recibeDatos.getString("Datocontra"); // recojemos los datos
        contra.setText(cont);

        String genero =  recibeDatos.getString("genero");


    }
    public void Volver (View v){
        Intent ir = new Intent( this,  inicio.class  );
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);

    }

}