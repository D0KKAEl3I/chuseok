package DBPKG;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCConnection {

	public static Connection Connect() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		Connection conn = DriverManager.getConnection(url, "system","1234");
		return conn;
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		try {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
