package org.example.config;

import org.example.Entity.Laptop;
import org.example.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    private FactoryConfiguration(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        sessionFactory=configuration.buildSessionFactory();
    }

    public static  FactoryConfiguration getInstance(){
        return(factoryConfiguration==null)? factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
