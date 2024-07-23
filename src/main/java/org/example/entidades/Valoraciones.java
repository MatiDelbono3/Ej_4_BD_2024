package org.example.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "valoraciones")
public class Valoraciones {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int valoracion_ID;
@Column(name = "libro_id", nullable = false)
private int libro_ID;
@Column(name = "usuario_id", nullable = false)
private int Usuario_ID;
@Column(name = "puntuacion", nullable = false)
private int puntuacion;
@Column(name = "comentario", nullable = false)
private int comentario;
@Column(name = "FechaPublicacion", nullable = false)
private int FechaPublicacion;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "libro_ID")
private List<Libros>libros;

    public int getValoracion_ID() {
        return valoracion_ID;
    }

    public void setValoracion_ID(int valoracion_ID) {
        this.valoracion_ID = valoracion_ID;
    }

    public int getLibro_ID() {
        return libro_ID;
    }

    public void setLibro_ID(int libro_ID) {
        this.libro_ID = libro_ID;
    }

    public int getUsuario_ID() {
        return Usuario_ID;
    }

    public void setUsuario_ID(int usuario_ID) {
        Usuario_ID = usuario_ID;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getComentario() {
        return comentario;
    }

    public void setComentario(int comentario) {
        this.comentario = comentario;
    }

    public int getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public List<Libros> getLibros() {
        return libros;
    }

    public void setLibros(List<Libros> libros) {
        this.libros = libros;
    }
}
