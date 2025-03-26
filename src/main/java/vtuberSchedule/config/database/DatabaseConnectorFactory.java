package vtuberSchedule.config.database;

import vtuberSchedule.config.database.impl.OracleDatabaseConnector;
import vtuberSchedule.config.database.impl.PostgreDatabaseConnector;

// 경우에 따른 데이터베이스의 유연한 변경
public class DatabaseConnectorFactory {
	public static DatabaseConnector createConnector(String dbType, String url, String username, String password) {
		if ("postgres".equalsIgnoreCase(dbType)) {
			return new PostgreDatabaseConnector(url, username, password);
		} else if ("oracle".equalsIgnoreCase(dbType)) {
			return new OracleDatabaseConnector(url, username, password);
		} else {
			throw new IllegalArgumentException("Unsupported DB type: " + dbType);
		}
	}
}
