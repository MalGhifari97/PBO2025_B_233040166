package Pertemuan14;

public class DatabaseConnection {
    public static String connectionString;

    static {
        // Static block hanya dipanggil sekali saat class pertama kali digunakan
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static initialization block executed: Connection string initialized.");
    }
}
