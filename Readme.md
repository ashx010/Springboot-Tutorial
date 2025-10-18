# ☕ Java 

---
### 🔹 JDBC

- **Load Driver**
    - `Class.forName("org.postgresql.Driver")`

- **Get Connection**
    - `DriverManager.getConnection(url, username, password)`
    - Parameters:
        - URL → `jdbc:postgresql://localhost:5432/dbName`
        - Username
        - Password

- **Create Statement**
    - `Statement` → for static SQL
    - `PreparedStatement` → for parameterized SQL (`?` placeholders)

- **Execute SQL**
    - `executeQuery()` → for `SELECT`
    - `executeUpdate()` → for `INSERT`, `UPDATE`, `DELETE`

- **Process Results**
    - Use `ResultSet`
    - Access columns → `rs.getInt()`, `rs.getString()`, etc.

- **Close Resources**
    - Always close `ResultSet`, `Statement`, and `Connection`

---

### 🔹 Hibernate

#### 🧱 Basic Workflow

- **Load Configuration**
    - `Configuration cfg = new Configuration().configure("hibernate.cfg.xml");`
    - Add entity class → `.addAnnotatedClass(Student.class)`

- **Build SessionFactory**
    - `SessionFactory sf = cfg.buildSessionFactory();`
    - ⚠️ Heavy object → create only **once** per application.

- **Open Session**
    - `Session s = sf.openSession();`

- **Transaction Handling**
    - Always use transactions for **insert, update, delete**
    - Fetch (`find`) does not require a transaction.

- **Operations**
    - `persist()` → Insert
    - `find()` → Fetch by ID
    - `merge()` → Update
    - `remove()` → Delete

- **Commit Transaction** 
    - `commit()`
  
- **Close Session and `SessionFactory`**

- **Entity Mapping:**
    - `@Entity` → Marks class as a table
    - `@Id` → Marks primary key
    - `@GeneratedValue(strategy = GenerationType.IDENTITY)` → Auto-increment ID

---

### 🧾 Author

**Yash Aggarwal**