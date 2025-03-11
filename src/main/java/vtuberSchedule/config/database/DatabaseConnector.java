package vtuberSchedule.config.database;

import java.sql.ResultSet;

public interface DatabaseConnector {
	void connect();
	void disconnect();
	ResultSet executeQuery(String query);
}
