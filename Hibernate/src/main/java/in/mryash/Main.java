package in.mryash;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//        cfg.addAnnotatedClass(in.mryash.Student.class);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(in.mryash.Student.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Scanner sc = new Scanner(System.in);

        //check 1 or 2, 1 : insert, 2: select
        System.out.println("Select: \n1: Insert Data.\n2. Fetch Data.\n3. Update Data.\n4. Delete Data.\n5. Exit ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:{

                // inserting the data

                String name = sc.nextLine();
                int age = sc.nextInt();
                Student st = new Student(name, age);
                System.out.println(st.toString());

                Session s = sf.openSession();

                Transaction tx = s.beginTransaction();
                s.persist(st);
                tx.commit();
                s.close();
            }
            case 2:{

                //fetching the data

                System.out.println("Enter the id: ");
                int s_id = sc.nextInt();

                Session s = sf.openSession();
                Student st = s.find(Student.class, s_id);
                s.close();

                System.out.println(st.toString());

            }

            case 3:{

                //update the data

                System.out.println("Enter the data: ");
                int s_id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                int age = sc.nextInt();

                Student st = new Student(s_id, name, age);
                System.out.println(st.toString());

                Session s = sf.openSession();
                Transaction tx = s.beginTransaction();
                s.merge(st);
                tx.commit();
                s.close();

            }

            case 4:{

                //delete the data

                System.out.println("Enter the id: ");
                int s_id = sc.nextInt();

                Student s1 = new Student();

                Session s = sf.openSession();

                Student res = s.find(Student.class, s_id);

                Transaction tx = s.beginTransaction();

                s.remove(res);

                tx.commit();
                s.close();
            }
        }

        sf.close();

        System.out.println("Done");

    }
}