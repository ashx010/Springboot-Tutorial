import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "9999");
        Statement st = con.createStatement();

        String q1 = "CREATE TABLE IF NOT EXISTS Student (id serial primary key, name varchar(20), age integer)";

        st.executeUpdate(q1);

        PreparedStatement ps = con.prepareStatement("INSERT INTO Student (name, age) VALUES (?, ?)");

        ps.setString(1, "John");
        ps.setInt(2, 30);
        ps.executeUpdate();

        String q2 = "Select * from Student";

        ResultSet rs = st.executeQuery(q2);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("Id: " + id + " | ");
            System.out.print("Name: " + name + " | ");
            System.out.println("Age: " + age);
        }

        con.close();
    }

}