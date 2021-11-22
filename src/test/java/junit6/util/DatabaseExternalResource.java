package junit6.util;

import org.junit.rules.ExternalResource;

public class DatabaseExternalResource extends ExternalResource {
	private static final DatabaseConnection connection = DatabaseConnection.getConnection();

	@Override
	protected void before() throws Throwable {
		connection.open();
	}

	@Override
	protected void after() {
		connection.close();
	}

	public DatabaseConnection getConnection() {
		return connection;
	}
}
