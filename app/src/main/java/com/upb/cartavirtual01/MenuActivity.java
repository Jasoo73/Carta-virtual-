package com.upb.cartavirtual01;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //Declaramos variables

    String [] Categorias = new String [] {"Entrada", "Platos Fuertes", "Bebidas", "Postres"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        ListView lv =findViewById(android.R.id.list);

        ListAdapter la = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1,Categorias);

        lv.setAdapter(la);

        lv.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Intent intencion = null;

        switch (i){

            case 0:
                intencion = new Intent(this, EntradasActivity.class);
                startActivity(intencion);
                break;

            case 1:
                intencion = new Intent(this, PlatosActivity.class);
                startActivity(intencion);
                break;

            case 2:
                intencion = new Intent(this, BebidasActivity.class);
                startActivity(intencion);
                break;

            case 3:
                intencion = new Intent(this, PostresActivity.class);
                startActivity(intencion);
                break;

            case 4:
                intencion = new Intent(this, LicoresActivity.class);
                startActivity(intencion);
                break;

        }
    }
}