package com.example.marenjifo.retodeezerg;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdapter extends BaseAdapter {

    ArrayList<Lista> listas;
    Activity activity;


    public ListaAdapter(Activity activity) {
        this.activity = activity;
        listas = new ArrayList<>();

    }

    @Override
    public int getCount() {
        return listas.size();
    }

    @Override
    public Object getItem(int i) {
        return listas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    //Generar un renglon por objeto
    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        //Inflater pasa de XML a View
        View renglon = inflater.inflate(R.layout.renglon, null, false);

        TextView item_nombre = renglon.findViewById(R.id.item_nomlist);


        TextView item_usuario = renglon.findViewById(R.id.item_usu);


        TextView item_canciones = renglon.findViewById(R.id.item_cancn);


        item_nombre.setText(listas.get(position).getnomlist());


        item_usuario.setText(" usuario:  "+listas.get(position).getusu());
        item_canciones.setText("# de canciones:  "+listas.get(position).getCancn());

        return renglon;
    }

    public void agregarLista(Lista lista){
        listas.add(lista);
        notifyDataSetChanged();
    }
}
