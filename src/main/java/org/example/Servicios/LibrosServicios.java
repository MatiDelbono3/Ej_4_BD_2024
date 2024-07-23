package org.example.Servicios;

import org.example.conexiones.HibernateUtil;
import org.example.entidades.Libros;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibrosServicios {
    public List<Libros> RetornarLibrosPosterioresA2010(String genero){
        Session session= HibernateUtil.getSession();
        List<Libros>LibrosPosterioresA2010=new ArrayList<>();
        try {
            session.beginTransaction();
            var resultado=session.createQuery("SELECT DISTINCT m FROM libros m JOIN m.Valoraciones t "+ "WHERE b.genero= :genero AND b.AnoPublicacion > 2010 AND t.puntuacion > 3");
            LibrosPosterioresA2010=resultado.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        return LibrosPosterioresA2010;
    }
    public List<Libros>RetornarLibrosDeUnAutor(Date anoPublicacion, String autor){
        Session session=HibernateUtil.getSession();
        List<Libros>LibrosDeUnAutor=new ArrayList<>();
        try{
            session.beginTransaction();
            var resultado=session.createQuery("SELECT DISTINCT a FROM libros a WHERE l.Autor=:autor OR l.AnoPublicacion=: añoPublicacion JOIN l.valoraciones g" + "AND g.puntuacion = 5");
            LibrosDeUnAutor=resultado.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        return LibrosDeUnAutor;
    }
    public List<Libros>RetornarLibrosPuntuacionPromedio4(){
        Session session=HibernateUtil.getSession();
        List<Libros>LibrosPuntuacionPromedio4=new ArrayList<>();
        try {
            session.beginTransaction();
            var resultado=session.createQuery("SELECT  m FROM libros m" +" JOIN m.Valoraciones t "+"GROUPBY m.ID"+"HAVING AVG(t.puntuacion >=4 AND COUNT(t) >=4");
            LibrosPuntuacionPromedio4=resultado.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        return LibrosPuntuacionPromedio4;
    }
    }
