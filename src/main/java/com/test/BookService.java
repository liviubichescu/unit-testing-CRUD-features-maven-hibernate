package com.test;

import com.test.entities.Book;
import org.hibernate.Session;

public class BookService {

    public void add(Book book) {
        System.out.println(".....Hibernate Add Example......\n");
        Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
        try {
            sessionObj.beginTransaction();
            sessionObj.save(book);
            System.out.println("\n.....Records Saved Successfully To The Database......\n");

            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                System.out.println("\n......Transaction Is Being Rolled Back.....");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
    }

    public void delete(int id) {

        System.out.println(".......Hibernate Delete Example.......\n");
        Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
        try {
            sessionObj.beginTransaction();
            Book book = sessionObj.find(Book.class,id);
            book.setAutor("");
            sessionObj.remove(book);
            System.out.println("\n.....Records Deleted Successfully from The Database.......\n");

            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                System.out.println("\n.....Transaction Is Being Rolled Back.......");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
    }

    public void update(int id, String autor) {
        System.out.println(".......Hibernate Add Example.......\n");
        Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
        try {
            sessionObj.beginTransaction();
            Book book = (Book) sessionObj.get(Book.class, id);
            book.setAutor(autor);

            sessionObj.save(book);
            System.out.println("\n.......Records Updated Successfully To The Database.......\n");

            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
    }
}
