package com.johhns.ejerciciointents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Toast.makeText( this , "Act 2 Creada" , Toast.LENGTH_LONG ).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText( this , "Act 2 Iniciada" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText( this , "Act 2 Reiniciada" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText( this , "Act 2 Detenida" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText( this , "Act 2 en Pausa" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText( this , "Act 2 Resumida" , Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText( this , "Act 2 Destruida" , Toast.LENGTH_LONG ).show();
    }

}