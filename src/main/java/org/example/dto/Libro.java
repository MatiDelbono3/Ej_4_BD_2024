package org.example.dto;

import java.util.Date;

public class Libro {
    private int libro_ID;
    private String titulo;
    private String Autor;
    private String Genero;
    private Date AnoPublicacion;

    public int getLibro_ID() {
        return libro_ID;
    }

    public void setLibro_ID(int libro_ID) {
        this.libro_ID = libro_ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Date getAnoPublicacion() {
        return AnoPublicacion;
    }

    public void setAnoPublicacion(Date anoPublicacion) {
        AnoPublicacion = anoPublicacion;
    }
}
