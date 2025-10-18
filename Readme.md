# ☕ Java SpringBoot Tutorial

---

### 🔹 JDBC

- Load Driver using `Class.forName()`
- Get Connection using `DriverManager.getConnection()`
    - Parameters:
        - URL → `jdbc:postgresql://localhost:5432/dbName`
        - Username
        - Password
- Create Statement
    - `Statement` → for static SQL
    - `PreparedStatement` → for parameterized SQL
- Execute Query / Update
    - `executeQuery()` → for `SELECT`
    - `executeUpdate()` → for `INSERT`, `UPDATE`, `DELETE`
- Process Result
    - Use `ResultSet`
    - Retrieve data with `getInt()`, `getString()`, etc.
- Close Resources
    - `ResultSet`, `Statement`, `Connection`

---

### 🔹 Hibernate

- Load Configuration using `new Configuration().configure()`
- Add Annotated Classes with `addAnnotatedClass()`
- Build `SessionFactory` using `buildSessionFactory()`
- Open `Session` using `openSession()`
- Begin Transaction using `beginTransaction()`
- Perform Operation
    - `persist()` → Insert
    - `find()` → Fetch by ID
    - `merge()` → Update
    - `remove()` → Delete
- Commit Transaction with `commit()`
- Close Session and `SessionFactory`
- Entity Mapping:
    - `@Entity`
    - `@Id`
    - `@GeneratedValue(strategy = GenerationType.IDENTITY)`

---

### 🧾 Author
**Yash Aggarwal**
