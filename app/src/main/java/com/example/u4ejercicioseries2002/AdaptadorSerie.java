package com.example.u4ejercicioseries2002;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 22/02/2018.
 */
public class AdaptadorSerie extends ArrayAdapter<Serie> {

    ArrayList<Serie> series;
    Context c;

    public AdaptadorSerie(Context c, ArrayList<Serie> series){
        super(c,R.layout.item_serie, series);
        this.c = c;
        this.series = series;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_serie,null);

        //TextView Ejercicio
        TextView tvejercicio=(TextView)item.findViewById(R.id.tvejercicio);
        tvejercicio.setText(series.get(position).getEjercicio());

        //TextView Pesom
        TextView tvpesom=(TextView)item.findViewById(R.id.tvpesom);
        tvpesom.setText(series.get(position).getPesom());

        //TextView Peso
        TextView tvpeso=(TextView)item.findViewById(R.id.tvpeso);
        tvpeso.setText(series.get(position).getPeso());

        //TextView Repeticiones
        TextView tvrepeticiones=(TextView)item.findViewById(R.id.tvrepeticiones);
        tvrepeticiones.setText(""+series.get(position).getRepeticiones());

        //TextView Minutos
        TextView tvminutos=(TextView)item.findViewById(R.id.tvminutos);
        tvminutos.setText(""+series.get(position).getMinutos());

        //TextView Segundos
        TextView tvsegundos=(TextView)item.findViewById(R.id.tvsegundos);
        tvsegundos.setText(""+series.get(position).getSegundos());

        //ImageView
        String imagen = series.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen, "drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.ivimagen);

        iv_imagen.setImageResource(idImagen);

        return item;
    }
}