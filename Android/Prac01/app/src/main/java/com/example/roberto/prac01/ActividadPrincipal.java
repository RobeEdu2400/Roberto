package com.example.roberto.prac01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActividadPrincipal extends AppCompatActivity {
    EditText txtNom;
    EditText txtApellidos;
    EditText txtEdad;
    CheckBox txtCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        Button button = (Button) findViewById(R.id.button);
        txtNom=(EditText)findViewById(R.id.editText3);
        txtApellidos = (EditText) findViewById(R.id.editText4);
        txtEdad = (EditText) findViewById(R.id.editText5);
        txtCheck = (CheckBox) findViewById(R.id.checkBox2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("Nom",txtNom.getText().toString());
                b.putString("Apellidos",txtApellidos.getText().toString());
                b.putString("Edad",txtEdad.getText().toString());
                b.putBoolean("Permitir",txtCheck.isChecked());

                Intent intencion = new Intent(ActividadPrincipal.this,SegundaActividad.class);
                intencion.putExtras(b);

                startActivity(intencion);
            }
        });


    }
}
