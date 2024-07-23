package org.example;

import org.example.Servicios.LibrosServicios;
import org.example.conexiones.HibernateUtil;
import org.example.dto.Libro;
import org.example.entidades.Libros;
import org.hibernate.Session;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Session sesion=HibernateUtil.getSession();
        if (sesion != null){
            System.out.println("Conectado");
        }
        else {
            System.out.println("No se pudo iniciar HibernateUtil");
        }
        LibrosServicios ServicioLibro=new LibrosServicios();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el ID de un libro");
        int IdLibro= scanner.nextInt();
        System.out.println("Lea una valoración");
        int IdValoracion= scanner.nextInt();
        System.out.println("Ingrese el genero");
        String genero= String.valueOf(scanner.nextInt());
        System.out.println("Ingrese el autor");
        String autor= String.valueOf(scanner.nextInt());
        System.out.println("Ingrese el anio de publicacion");
        Date anioPublicacion=new Date();
        while (IdLibro!=0){
        // Retornar libros de un género determinado posteriores a 2010
        List<Libros> PosterioresA2010=ServicioLibro.RetornarLibrosPosterioresA2010(genero);
        PosterioresA2010.forEach(libro -> System.out.println(libro.getLibro_Id()));
        PosterioresA2010.forEach(libro -> System.out.println(libro.getTitulo()));
        PosterioresA2010.forEach(libro -> System.out.println(libro.getAutor()));
        PosterioresA2010.forEach(libro -> System.out.println(libro.getAnoPublicacion()));


        // Retornar libros de un autor publicados en un anio en particular
        List<Libros>LibrosDeUnAutor=ServicioLibro.RetornarLibrosDeUnAutor(anioPublicacion, autor);
            LibrosDeUnAutor.forEach(libro -> System.out.println(libro.getLibro_Id()));
            LibrosDeUnAutor.forEach(libro -> System.out.println(libro.getTitulo()));
            LibrosDeUnAutor.forEach(libro -> System.out.println(libro.getAutor()));
            LibrosDeUnAutor.forEach(libro -> System.out.println(libro.getAnoPublicacion()));


            // Retornar Libros con 4 valoraciones y puntuación promedio 4
        List<Libros>LibrosPromedio4=ServicioLibro.RetornarLibrosPuntuacionPromedio4();
            LibrosPromedio4.forEach(libro -> System.out.println(libro.getLibro_Id()));
            LibrosPromedio4.forEach(libro -> System.out.println(libro.getTitulo()));
            LibrosPromedio4.forEach(libro -> System.out.println(libro.getAutor()));
            LibrosPromedio4.forEach(libro -> System.out.println(libro.getAnoPublicacion()));

        }
    }
}