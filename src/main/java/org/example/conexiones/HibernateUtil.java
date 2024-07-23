package org.example.conexiones;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
    public static final SessionFactory sessionfactory;
    static {
        try {
            Configuration configuracion=new Configuration().configure();
            sessionfactory= configuracion.buildSessionFactory();
        }catch (Exception e){
            throw e;
        }
    }
    public static Session getSession(){
        return sessionfactory.openSession();
    }
}
