package org.iptime.gunkim;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConnectionTest {
	private String userId = "system";
	private String userPw = "oracle";
	private String className = "oracle.jdbc.driver.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";

	@Test
	public void testConnection() throws Exception {

		Class.forName(className);

		try (Connection con = DriverManager.getConnection(dbUrl, userId, userPw)) {
			System.out.println("DB 접속 성공");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
