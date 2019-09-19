package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

	final String dbName = "COMP603DB";
	final String url = "jdbc:derby:" + dbName + ";create=true";
	final String userName = "Tim";
	final String password = "aStrongPassword";
	private Connection connection;
	private Statement statement;

	public Connection getConnect() throws SQLException {
		System.out.println(url);
		connection = DriverManager.getConnection(this.url, this.userName, this.password);
		this.statement = connection.createStatement();
		return connection;
	}

	public void createTable() {
		try {
			String tableName = "COMP603TABLE";
			String sql = "CREATE TABLE " + tableName + " (CLASSID INT, CLASSNAME VARCHAR(25))";
			System.out.println("[CREATE TABLE USING ]" + sql);
			this.statement.execute(sql);
		} catch (SQLException e) {
			System.out.println("TABLE ALREADY THERE");
		}
	}

	public void dropTable() {
		try {
			String tableName = "COMP603TABLE";
			String sql = "DROP TABLE " + tableName;
			System.out.println("[DROP TABLE USING ]" + sql);
			this.statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertData(int id, String name) {
		String tableName = "COMP603TABLE";
		try {
//			if (this.isNotRepeatRow(id)) {
//				String sql = "INSERT INTO " + tableName + " VALUES(" + id + ",'" + name + "')";
//				System.out.println("[INSERT TABLE USING ]" + sql);
//				this.statement.executeUpdate(sql);
//			} else {
//				String sql = "UPDATE " + tableName + " SET CLASSNAME = '" + name + "' WHERE CLASSID = " + id;
//				System.out.println("[update TABLE USING ]" + sql);
//				this.statement.executeUpdate(sql);
//			}

			String sql = this.isNotRepeatRow(id) ? "INSERT INTO " + tableName + " VALUES(" + id + ",'" + name + "')"
					: "UPDATE " + tableName + " SET CLASSNAME = '" + name + "' WHERE CLASSID = " + id;
			System.out.println("[INSERT/UPDATE TABLE USING ]" + sql);
			this.statement.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printDataById(int id) {
		String tableName = "COMP603TABLE";
		String sql = "SELECT * FROM " + tableName + " WHERE CLASSID = " + id;
		System.out.println("QUERY DB" + sql);
		try {
			ResultSet set = this.statement.executeQuery(sql);
			while (set.next()) {
				System.out.println(set.getString("CLASSNAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean isNotRepeatRow(int id) {

		String tableName = "COMP603TABLE";
		String sql = "SELECT * FROM " + tableName + " WHERE CLASSID = " + id;
		int counter = 0;
		try {
			ResultSet set = this.statement.executeQuery(sql);
			while (set.next()) {
				counter++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return counter < 1;
	}
}
