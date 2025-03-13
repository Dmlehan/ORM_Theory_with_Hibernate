package org.example;

import org.example.Entity.Laptop;
import org.example.Entity.Student;
import org.example.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Laptop laptop2=new Laptop(2,"Dell");
        Student student2=new Student(2,"Lehan","Panadura",laptop2);

        session.save(laptop2);
        session.save(student2);

        transaction.commit();
        session.close();

    }
}