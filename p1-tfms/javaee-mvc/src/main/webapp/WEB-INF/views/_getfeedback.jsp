<%@ page import="java.sql.*" %>
<%@ page import="com.bnymellon.lnd.jdbc.util.ConnectionFactory" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<style type="text/css">
    <%@include file="css/style.css" %>
    .checked {
  color: orange;
}

input[type=submit] {
    width: 20em;  height: 2em;
}

 #button {

    font-size: 20px;
    color: white;
    background: green;
    border: 2px solid rgb(37, 34, 34);
    border-radius: 10px;
    padding-top: 5px;
    padding-bottom: 5px;
    padding-right: 10px;
    padding-left: 10px;
 }


</style>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



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
           

           
           PreparedStatement st=connection.prepareStatement("select trainee_name from Associate where trainee_id=?;");
           st.setString(1, userName);
           ResultSet rs = st.executeQuery() ;
           StringBuilder sb=new StringBuilder("");  
           while(rs.next()){
        	   sb=new StringBuilder(rs.getString(1));
           }
           String sb1=sb.toString();
           
           
           
           
           
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("SELECT * FROM Question") ;
          int x=0;
          List<String>sec=new ArrayList<>();
          List<String>id=new ArrayList<>();
          
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
		
		
    
		<big style="margin-left: 39%; font-size:40px; font-weight:bold; margin-bottom:200px;margin-top:20px; color:blue; bgcolor:black">HI <%=sb1 %></big>
		
		<form action="Done" method="post" id=form_login>
		Enter the Trainer Id:<input type="text" name="trainer_id" />
		<br>
		<br>
		Enter the Topic Name:<input type="text" name="topic" />
		<%	
			
			int i=0;
			while(i<sec.size()){ %>
				<h1><%=sec.get(i) %></h1>
				
       			<div >
       			
       			<input type="radio" class="fa fa-star checked" id="1" name=<%="fname"+i%> value="1">
       			<label for="1">Strongly Disagree</label>
       			<input type="radio" class="fa fa-star checked" id="2" name=<%="fname"+i%> value="2">
       			<label for="2">Disagree</label>
       			<input type="radio" class="fa fa-star checked" id="3" name=<%="fname"+i%> value="3">
       			<label for="3">Neutral</label>
       			<input type="radio" class="fa fa-star checked" id="4" name=<%="fname"+i%> value="4">
       			<label for="4">Agree</label>
       			<input type="radio" class="fa fa-star checked" id="5" name=<%="fname"+i%> value="5">
       			<label for="5">Strongly Agree</label>
       			</div>
       			<% String fName = request.getParameter("fname"+i);
       				
       				//rat[8]=userName;
       			%>
       			<%
       			i++;}%>
       			
       			<br>
       			<br>
       			
       			<button type="submit" id="button"%>Submit</button>
       		
       		
    	
        
        
        
        
		
		</form>
		
		
		
		
		
		
		
		
        
        
        
        
        
        
        
         
    </body>
</html>