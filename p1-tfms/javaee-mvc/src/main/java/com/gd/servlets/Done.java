package com.gd.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnymellon.lnd.jdbc.util.ConnectionFactory;

@WebServlet(urlPatterns = { "/Done" })
public class Done extends HttpServlet {
	private static final long serialVersionUID = 2245721142572801107L;
;


	public Done() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String userName=DoLoginServlet.x;
		//System.out.println(request.getParameter("fname1"));
		
		//System.out.println(request.getParameter("fname2"));
		//System.out.println(request.getParameter("topic"));
		
		
		
		
		
		int j=0;
		List<String>li=new ArrayList<>();
		List<String>id=new ArrayList<>();
		while(request.getParameter("fname"+j)!=null) {
			li.add(request.getParameter("fname"+j));
			j++;
			
		}
		
		
		Connection connection = ConnectionFactory.getConnection();
        Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("SELECT * FROM Question") ;
			while(resultset.next()) {
				id.add(resultset.getString(1));
			}
			
		
	   		for(int i=0;i<8;i++){
	   		String trainerName=request.getParameter("trainer_id");
		   	String traineeName=userName;
		   	String topic=request.getParameter("topic");
		   	String sql="INSERT INTO Feedback(trainer_id,trainee_id,topic,question_id,rating)VALUES(?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			
			ps.setString(1, trainerName);
			ps.setString(2, traineeName);
			ps.setString(3, topic);
			ps.setString(4, id.get(i));
			ps.setString(5, li.get(i));
			ps.executeUpdate(); 
	   		}
	   	}
	   	catch (SQLException e) {
				e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/_Done.jsp");

		dispatcher.include(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}