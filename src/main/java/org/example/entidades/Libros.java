package org.example.entidades;

import jakarta.persistence.*;

import java.util.List;


@Entity
    @Table(name = "libros")
    public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int libro_Id;
    @Column(name = "titulo", nullable = false)
    private String Titulo;
    @Column(name = "autor", nullable = false)
    private String Autor;
    @Column(name = "genero", nullable = false)
    private String genero;
    @Column(name = "publicacion", nullable = false)
    private String AnoPublicacion;
    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Valoraciones>Valoraciones;

    public int getLibro_Id() {
        return libro_Id;
    }

    public void setLibro_Id(int libro_Id) {
        this.libro_Id = libro_Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoPublicacion() {
        return AnoPublicacion;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        AnoPublicacion = anoPublicacion;
    }

    public List<org.example.entidades.Valoraciones> getValoraciones() {
        return Valoraciones;
    }

    public void setValoraciones(List<org.example.entidades.Valoraciones> valoraciones) {
        Valoraciones = valoraciones;
    }
}
