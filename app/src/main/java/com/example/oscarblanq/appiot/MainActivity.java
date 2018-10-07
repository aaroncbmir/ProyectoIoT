package com.example.oscarblanq.appiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/**
********************************************************************************
                        MENÚ ACTION BAR     (ANDROID 3.0)
*******************************************************************************
*/

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            lanzarPreferencias(null);
            return true;
        }

        if (id == R.id. acercaDe) {
            lanzarAcercaDe(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
/**
********************************************************************************
            MÉTODOS PARA LANZAR LAS ACTIVIDADES
********************************************************************************
*/

    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }

    public void lanzarPreferencias(View view){
        Intent i = new Intent(this, PreferenciasActivity.class);
        startActivity(i);
    }

}
