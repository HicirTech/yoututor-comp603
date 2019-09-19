package databaseConnection;

import java.sql.SQLException;

public class Runable {

	public static void main(String[] args) {
		DBconnection db = new DBconnection();
		try {
			db.getConnect();
//			db.createTable();

			db.insertData(1,"name2");
			db.printDataById(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
