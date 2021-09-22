package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBPKG.JDBCConnection;

public class VaccresvDAO {

	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public VaccresvVO getVaccresv(VaccresvVO vaccresv) {
		VaccresvVO result = null;
		try{
			conn = JDBCConnection.Connect();
			String sql = "";
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.close(rs, stmt, conn);
		}
		
		return result;
	}
}
