package in.mryash;

import jakarta.persistence.*;

@Entity(name="student_in_java")
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Age")
    private int age;

    //do not use as column from table
    @Transient
    private String temp;


    public Student() {
        this.name = "";
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
