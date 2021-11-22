package junit6.util;

public class DatabaseConnection {
	private static final  DatabaseConnection OPEN_CONNECTION = new DatabaseConnection();
	private DatabaseConnection() {}
	public static DatabaseConnection getConnection() {
		return OPEN_CONNECTION;
	}
	public void open() {
        System.out.println("Opened connection to database");
    }
 
    public void close() {
        System.out.println("Closed connection to database");
    }
 
    public boolean insert() {
        System.out.println("Saved");
        return true;
    }
 
    public boolean update() {
        System.out.println("Updated");
        return true;
    }
 
    public boolean delete() {
        System.out.println("Deleted");
        return true;
    }
}
