package com.example.roberto.prac01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        TextView textView = (TextView) findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();
        textView.setText("Nombre: "+b.getString("Nom"));


        TextView textView2= (TextView) findViewById(R.id.textView2);
        textView2.setText("Apellidos: "+ b.getString("Apellidos"));

        TextView textView3= (TextView) findViewById(R.id.textView3);
        textView3.setText("Edad: "+b.getString("Edad"));

        TextView textView4= (TextView) findViewById(R.id.textView4);


        if (b.getBoolean("Permitir")==true){
            textView4.setText("Si Permite");
        }
        else{
            textView4.setText("No Permite");
        }


    }
}
