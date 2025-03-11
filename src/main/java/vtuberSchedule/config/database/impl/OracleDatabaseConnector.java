package vtuberSchedule.config.database.impl;

import vtuberSchedule.config.database.DatabaseConnector;
import java.sql.*;

public class OracleDatabaseConnector implements DatabaseConnector {
	private Connection connection;
	private final String url;
	private final String username;
	private final String password;
	
	public OracleDatabaseConnector(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public void connect() {
		try {
			// Oracle JDBC 드라이버가 로드되어 있어야 합니다.
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to Oracle DB");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void disconnect() {
		if (connection != null) {
			try {
				connection.close();
				System.out.println("Disconnected from Oracle DB");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public ResultSet executeQuery(String query) {
		try {
			Statement statement = connection.createStatement();
			return statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}