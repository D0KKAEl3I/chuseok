package Model;

import java.util.ArrayList;
import java.util.List;

import DBPKG.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JuminDAO {

	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public List<JuminVO> getJuminList(){
		List<JuminVO> juminList = null;
		
		try {
			conn = JDBCConnection.Connect();
			String sql = "SELECT * FROM tbl_jumin_202108";
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			juminList = new ArrayList<JuminVO>();
			while(rs.next()) {
				JuminVO jumin = new JuminVO();
				jumin.setJumin(rs.getString("jumin"));
				jumin.setPname(rs.getString("pname"));
				jumin.setTel(rs.getString("tel"));
				jumin.setAddress(rs.getString("address"));
				juminList.add(jumin);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.close(rs, stmt, conn);
		}
		
		return juminList;
		
	}

}
