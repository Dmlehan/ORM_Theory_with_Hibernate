package org.example;

import org.example.Entity.Student;
import org.example.config.Factoryconfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       System.out.println("1");
        Session session= Factoryconfig.getIntance().getSession();
//        System.out.println("2");
        Transaction transaction=session.beginTransaction();
//        System.out.println("3");
//
        Student studnet1 =new Student(5,"klhhha","sdfsf");
//        System.out.println("4");

//        session.save(studnet1);
//        session.update(studnet1);
//        Student st= session.get(Student.class,1);
         session.delete(studnet1);
//        System.out.println(st);
        transaction.commit();
        session.close();
        System.out.println("6");
        System.out.println("Ffff");
//        save(studnet);
    }
}