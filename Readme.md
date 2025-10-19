# ☕ Java Quick Reference

> **Author:** Yash Aggarwal

---

## 🔹 JDBC

| Function | Purpose |
|----------|---------|
| `Class.forName()` | Load database driver |
| `DriverManager.getConnection()` | Connect to database |
| `createStatement()` | Static SQL queries |
| `prepareStatement()` | Parameterized queries with `?` |
| `executeQuery()` | Run SELECT → returns data |
| `executeUpdate()` | Run INSERT/UPDATE/DELETE → returns count |
| `ResultSet.next()` | Move to next row |
| `ResultSet.getInt()` / `getString()` | Extract column values |
| `close()` | Release resources |

**Flow:** Load Driver → Connect → Create Statement → Execute → Process Results → Close

---

## 🔹 Hibernate

### Core Functions

| Function | Purpose |
|----------|---------|
| `new Configuration()` | Initialize Hibernate settings |
| `configure()` | Load config file |
| `addAnnotatedClass()` | Register entity class |
| `buildSessionFactory()` | Create factory (once per app) |
| `openSession()` | Start database session |
| `beginTransaction()` | Start transaction for writes |
| `persist()` | Insert new record |
| `find()` | Fetch by primary key |
| `merge()` | Update existing record |
| `remove()` | Delete record |
| `commit()` | Save changes |
| `close()` | Close session/factory |

**Flow:** Configure → Build Factory → Open Session → Transaction → CRUD → Commit → Close

### Annotations

| Annotation | Purpose |
|------------|---------|
| `@Entity` | Mark class as database entity |
| `@Entity(name)` | Custom name for JPQL queries |
| `@Table(name)` | Map to specific table name |
| `@Id` | Mark primary key field |
| `@GeneratedValue` | Auto-increment ID |
| `@Column(name)` | Map field to specific column name |
| `@Transient` | Exclude field from database |

---

## 💡 Key Notes

- **SessionFactory** = Create once per app
- **Transaction** = Required for write, optional for read
- **Default mapping** = Class name → Table name, Field name → Column name
- Use `@Table(name)` when DB table ≠ class name
- Use `@Column(name)` when DB column ≠ field name
- Use `@Transient` for temporary/calculated fields

---

**Happy Coding! 🚀**