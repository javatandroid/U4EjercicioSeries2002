package com.example.u4ejercicioseries2002;

/**
 * Created by DIDACT on 22/02/2018.
 */

public class Serie {
    String nombre;
    int temporada;
    int episodios;
    String genero;
    int ano;
    String sinopsis;

    public Serie(String nombre, int temporada, int episodios, String genero, int ano, String sinopsis) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.episodios = episodios;
        this.genero = genero;
        this.ano = ano;
        this.sinopsis = sinopsis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
