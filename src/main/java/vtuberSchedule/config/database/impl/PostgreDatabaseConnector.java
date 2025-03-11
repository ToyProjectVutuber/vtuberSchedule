package vtuberSchedule.config.database.impl;

import vtuberSchedule.config.database.DatabaseConnector;

import java.sql.*;

public class PostgreDatabaseConnector implements DatabaseConnector {
	private Connection connection;
	private final String url;
	private final String username;
	private final String password;
	
	public PostgreDatabaseConnector(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public void connect() {
		try {
			// PostgreSQL JDBC 드라이버가 로드해야함
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("postgreSQL에 연결합니다");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void disconnect() {
		if (connection != null) {
			try {
				connection.close();
				System.out.println("postgreSQL의 연결을 해체합니다");
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
