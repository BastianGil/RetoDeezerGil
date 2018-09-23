package com.example.marenjifo.retodeezerg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_listas;

    ListaAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_listas=findViewById(R.id.lv_listas);


        customAdapter= new ListaAdapter(this);
        lv_listas.setAdapter(customAdapter);



        Lista lista1= new Lista("rnb","sebitasBB","1");
        customAdapter.agregarLista(lista1);



    }
}
