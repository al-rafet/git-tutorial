package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String name=request.getParameter("name");
			String password=request.getParameter("pass");
			String dbname=null;
			String dbpass=null;
			String sql="select *from user where user=? and password=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginjdbc","root","");
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setString(1, name);
		    ps.setString(2, password);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()){
		    	dbname=rs.getString("user");
		    	dbpass=rs.getString("password");
		    }
		    HttpSession session=request.getSession();
		    if (name.equals(dbname) &&(password.equals(dbpass))) {
				System.out.println("You have successfully Logged in");
				PrintWriter out=response.getWriter();
	            out.println("You have successfully Logged in");
	            session.setAttribute("userid", name);
	            response.sendRedirect("success.jsp");
				
			}else {
				response.sendRedirect("index.html");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
