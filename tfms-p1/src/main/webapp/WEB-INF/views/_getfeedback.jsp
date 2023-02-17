<%@ page import="java.sql.*" %>
<%@ page import="com.bnymellon.lnd.jdbc.util.ConnectionFactory" %>
<%@ page import="java.util.*" %>

<html lang="en">
    <head>
        <title>Star rating demo</title>
        <link rel="stylesheet" href="jquery.rating.css">
        <script src="jquery.js"></script>
        <script src="jquery.rating.js"></script>
    </head>
    <body>
    
    
    	
    	
    
    	<%
    	
    		String userName = request.getParameter("userName");
           Connection connection = ConnectionFactory.getConnection();
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("SELECT * FROM Question") ;
          int x=0;
          List<String>sec=new ArrayList<>();
          List<String>id=new ArrayList<>();
          String []rat=new String [9];
       %>
       
       <%
		class xyz{
		void myMethod(String []rat){
			
			

		   	try{
		   		
		   		for(int i=0;i<8;i++){
		   		String trainerName="T104";
			   	String traineeName="A104";
			   	String topic="Automation";
			   	String sql="INSERT INTO Feedback(trainer_id,trainee_id,topic,question_id,rating)VALUES(?,?,?,?,?)";
				PreparedStatement ps=connection.prepareStatement(sql);
				
				ps.setString(1, trainerName);
				ps.setString(2, traineeName);
				ps.setString(3, topic);
				ps.setString(4, id.get(i));
				ps.setString(5, rat[i]);
				ps.executeUpdate(); 
		   		}
		   	}
		   	catch (SQLException e) {
					e.printStackTrace();
			}
			
		   	
		}
		}
		
		%>
       
       
       
       <%while(resultset.next()){ %>
       
       	<%sec.add(resultset.getString(3));%>
        <%id.add(resultset.getString(1));%>
        
                
        
		<%} %>
		
		
		<form action="Done" method="post">
		<%
			int i=0;
			while(i<sec.size()){ %>
				<h1><%=sec.get(i) %></h1>
       			rating: <input type = "fname" name = <%="fname"+i%>>
       			<% String fName = request.getParameter("fname"+i);
       				rat[i]=fName;
       				//rat[8]=userName;
       			%>
       			<%i++;}%>
       			
       			<button type="submit" %>>Submit</button>
       		
       		
    	
        
        
        
        
		
		</form>
		
		
		
		
		
		
		
		
        
        
        
        
        
        
        
         
    </body>
</html>