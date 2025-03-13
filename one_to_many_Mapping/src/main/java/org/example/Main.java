package org.example;

import org.example.Entity.Laptop;
import org.example.Entity.Student;
import org.example.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        List <Laptop> laptops=new ArrayList();

        Student student1=new Student(1,"kala","panadura",laptops);
        Laptop laptop1=new Laptop(1,"dell",student1);
        Laptop laptop2=new Laptop(2,"dell",student1);
        laptops.add(laptop1);
        laptops.add(laptop2);

        session.save(laptop1);
        session.save(laptop2);
        session.save(student1);

        transaction.commit();
        session.close();



    }
}