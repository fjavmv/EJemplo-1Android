package com.example.ejemplo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtMensaje;
    private TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociamos o enlazamos cada componente de la vista con java
        //Declaramos objetos de cada componente creado en la vista
        Button btnEnviar = findViewById(R.id.btnEnviar);
        edtMensaje = findViewById(R.id.edtMensaje);
        txtData = findViewById(R.id.txtDato);

        //Evento onClick
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aqui lo que va suceder al realizar el click
                String mesanje = edtMensaje.getText().toString();
                txtData.setText(mesanje);
                mostrarMensaje(mesanje);
            }
        });

    }

    private void mostrarMensaje(String mensaje){

        Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_SHORT).show();

    }

}