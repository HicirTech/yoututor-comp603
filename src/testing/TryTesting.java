/**
 * 
 */
package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import databaseConnection.DBconnection;

/**
 * @author luoze
 *
 */
class TryTesting {

	@Test
	void testEquals() {
		Assert.assertEquals(1, 1);
	}

	@Test
	void dbDropTest() {		
		ResultSet set = null;
		int counter= 0;
		try {
			DBconnection db = new DBconnection();
			db.getConnect();
			db.createTable();
			db.dropTable();
			set = db.getConnect().createStatement().executeQuery("SELECT * FROM COMP603TABLE");
			while(set.next()&&set!=null) {
				counter++;
			}
			
		}catch(SQLException e) {
			
		}
		
		Assert.assertEquals(counter, 0);
	}
}
