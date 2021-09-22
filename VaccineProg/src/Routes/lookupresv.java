package Routes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBPKG.JDBCConnection;

@WebServlet("/lookupresv")
public class lookupresv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("/lookupvaccresv.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Connection conn = JDBCConnection.Connect();
			String resvno = request.getParameter("resvno");
			String sql = "select jumin.pname,jumin.jumin, decode(substr(jumin.jumin,8,1),'1','남','2','여','3','남','4','여') gender,jumin.tel"
					+ ",to_char(to_date(vacc.resvdate), 'YYYY\"년\"MM\"월\"DD\"일\"') resvdate, vacc.resvtime"
					+ ",hosp.hospname, hosp.hosptel, hosp.hospaddr"
					+ ",decode(vacc.vcode,'V001','A백신','V002','B백신','V003','C백신') vcode "
					+ "from tbl_vaccresv_202108 vacc, tbl_jumin_202108 jumin, tbl_hosp_202108 hosp "
					+ "where jumin.jumin = vacc.jumin " + "and vacc.resvno = " + resvno
					+ " and hosp.hospcode = vacc.hospcode";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				request.setAttribute("pname", rs.getString("pname"));
				request.setAttribute("jumin", rs.getString("jumin"));
				request.setAttribute("gender", rs.getString("gender"));
				request.setAttribute("tel", rs.getString("tel"));
				request.setAttribute("resvdate", rs.getString("resvdate"));
				request.setAttribute("resvtime", rs.getString("resvtime"));
				request.setAttribute("hospname", rs.getString("hospname"));
				request.setAttribute("hosptel", rs.getString("hosptel"));
				request.setAttribute("hospaddr", rs.getString("hospaddr"));
				request.setAttribute("vcode", rs.getString("vcode"));
				request.getRequestDispatcher("/showvaccresv.jsp").forward(request, response);
			} else {
				response.sendRedirect("/errorvaccresv.html");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendError(404);
		}
	}

}
