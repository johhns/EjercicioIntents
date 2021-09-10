package com.johhns.ejerciciointents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText( this , "Actividad 1 Creada" , Toast.LENGTH_LONG ).show();

        ListView lista = (ListView) findViewById(R.id.lista_dias) ;
        String [] a_dias = getResources().getStringArray(R.array.dias_array) ;
        lista.setAdapter( new ArrayAdapter<>( MainActivity.this , android.R.layout.simple_list_item_1 , a_dias ));


        Button btn_sig = (Button) findViewById(R.id.btn_siguiente) ;
        btn_sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this , Actividad2.class ) ;
                startActivity( i );
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText( this , "Actividad 1 Iniciada" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText( this , "Actividad 1 Reiniciada" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText( this , "Actividad 1 Detenida" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText( this , "Actividad 1 En Pausa" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText( this , "Actividad 1 Resumida" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText( this , "Actividad 1 Destruida" , Toast.LENGTH_LONG ).show();
    }
}