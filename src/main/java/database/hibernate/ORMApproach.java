package database.hibernate;

import database.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ORMApproach {
    public static void main(String[] args){
        Student student = new Student(1, "Sai", 10, 123456789);
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(student);

        transaction.commit();

        session.close();
    }
}
