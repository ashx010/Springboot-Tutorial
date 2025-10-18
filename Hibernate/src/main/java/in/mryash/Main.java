package in.mryash;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student st = new Student("Jon", 23);
        System.out.println(st.toString());

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        cfg.addAnnotatedClass(in.mryash.Student.class);

        SessionFactory sf = cfg.buildSessionFactory();

        Session s1 = sf.openSession();

        Transaction tx = s1.beginTransaction();

        s1.persist(st);

        tx.commit();

        s1.close();

        System.out.println("Done");

    }
}