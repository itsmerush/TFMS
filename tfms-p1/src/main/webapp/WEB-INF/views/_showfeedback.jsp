<%@ page import="java.sql.*" %>
<%@ page import="com.bnymellon.lnd.jdbc.util.ConnectionFactory" %>

<HTML>
       <HEAD>
       <TITLE>The View Of Database Table </TITLE>
       </HEAD>
       <BODY BGCOLOR="cyan">
       <H1>The View Of Database Table </H1>
       <%
           Connection connection = ConnectionFactory.getConnection();
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("select v1.TrainerName,v1.Topic,v1.Section,v1.AverageRatingbySection,v2.Rating from bySection v1 join byTrainer  v2 on v1.TrainerName=v2.TrainerName;") ;
       %>
      <TABLE BORDER="1">
      <TR>
      <TH>Trainer_Name</TH>
      <TH>Topic</TH>
      <TH>Section</TH>
      <TH>Topic Wise Rating</TH>
      <TH>Overall Rating</TH>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       
      </TR>
      <% } %>
     </TABLE>
     </BODY>
</HTML>