<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>


<style type="text/css">
#form_login {
    left: 35%;
    top: 40%;
    
    position: absolute;
    border-color: blue;  
  border-width: .25em;  
  border-style: double;  
    
}
.center {
  
  margin: auto;
  width: 50%;
  
  padding: 30px;
}

input[type=text] {
  border: 2px solid violet;
  border-radius: 4px;
}

input[type=text]:focus {
  background-color: lightblue;
}


</style>
</head>

<body>
	<jsp:include page="menus/_menuDefault.jsp"></jsp:include>
	<div class=center>

	<big  style="margin-left: 39%; font-size:70px; font-weight:bold; 
font-family:Luminari  ; ">Login</big>
	<p style="color: red;">${errorString}</p>
	<p style="color: blue;">${logOutString}</p>
	<form method="POST" action="validate" id="form_login" >
		<table>
			<tr>
				<td style="padding:30px;font-family:Comic Sans MS;font-size:30px;padding-right:40px;">User Name</td>
				<td><input type="text" name="userName" value="n001${user.userLogin}" />
				</td>
			</tr>
			<tr>
				<td style="padding-left:30px;  font-size:30px; font-family:Comic Sans MS;">Password</td>
				<td><input type="text" name="password" value="123${user.userPass}" />
				</td>
			</tr>
			<tr>
				<td style="padding-top:30px; padding-left:70px;font-size:20px;font-family:Comic Sans MS; "><input type="submit" value="Submit" /> 
				<td style="padding-top:30px; padding-left:60px;font-size:20px; font-family:Comic Sans MS;"><input type="reset" name="rest" value="Reset" /></td>
			</tr>
		</table>
	</form>
	
	</div>
	<div style="margin-top:290px">
	<jsp:include page="_footer.jsp"></jsp:include>
	</div>

</body>
</html>