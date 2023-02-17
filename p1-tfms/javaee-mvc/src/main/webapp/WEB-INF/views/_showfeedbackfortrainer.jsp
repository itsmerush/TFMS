<%@ page import="java.sql.*" %>
<%@ page import="com.bnymellon.lnd.jdbc.util.ConnectionFactory" %>

<style>
.center {
  margin-left: auto;
  margin-right: auto;
}

.xyz{
padding:15px,15px,20px,20px;
}
</style>

<HTML>
       <HEAD>
       <TITLE>FeedBack For Trainers </TITLE>
       </HEAD>
       <BODY BGCOLOR="#D1F2EB" style="text-align:center;">
       <div style="text-align:center; margin-bottom:330px">
       <H1>FeedBack For Trainers </H1>
       <%
       		String userName = request.getParameter("userName");
       		
           Connection connection = ConnectionFactory.getConnection();
           
           PreparedStatement st=connection.prepareStatement("select trainer_name from trainer where trainer_id=?;");
           st.setString(1, userName);
           ResultSet rs = st.executeQuery() ;
           StringBuilder sb=new StringBuilder("");  
           while(rs.next()){
        	   sb=new StringBuilder(rs.getString(1));
           }
           String sb1=sb.toString();
           
           String query="select v1.TrainerName,v1.Topic,v1.Section,v1.AverageRatingbySection,v2.Rating from bySection v1 join byTrainer  v2 on v1.TrainerName=v2.TrainerName where v1.TrainerName=?;";
           PreparedStatement statement = connection.prepareStatement(query);
           statement.setString(1, sb1);
          ResultSet resultset = statement.executeQuery() ;
       %>
      <TABLE BORDER="1" class=center>
      <TR>
      <TH>Trainer_Name</TH>
      <TH>Topic</TH>
      <TH>Section</TH>
      <TH>Topic Wise Rating</TH>
      <TH>Overall Rating</TH>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD class="xyz"> <%= resultset.getString(1) %></td>
       <TD class="xyz"> <%= resultset.getString(2) %></TD>
       <TD class="xyz"> <%= resultset.getString(3) %></TD>
       <TD class="xyz"> <%= resultset.getString(4) %></TD>
       <TD class="xyz"> <%= resultset.getString(5) %></TD>
       
      </TR>
      <% } %>
     </TABLE>
     </div>
     <jsp:include page="_footer.jsp"></jsp:include>
     </BODY>
</HTML>