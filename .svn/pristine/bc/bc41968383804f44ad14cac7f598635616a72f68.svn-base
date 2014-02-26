/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author ana
 */
public class HibernateUtilMaestros {

    private static final SessionFactory sessionFactory2;
    
    static {
        try {
             sessionFactory2 = new AnnotationConfiguration().configure("hibernateMaestros.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory2;
    }
}
