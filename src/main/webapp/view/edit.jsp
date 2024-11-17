<%@page import="com.cjc.app.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lime;">

         <%
         Student stu=(Student) request.getAttribute("student");
         %>

    <div align="center">
      <h1>Welcome To Edit Page</h1>
      
      <form action="update" method="post">
      
         <input type="hidden" name="rollno" value="<%=stu.getRollno()%>"><br><br>
            
         <label>Name</label>
        <input type="text" name="name" value="<%=stu.getName()%>"><br><br>
        
        <label>Address</label>
        <input type="text" name="address" value="<%=stu.getAddress()%>"><br><br>
        
        <label>Email_ID</label>
        <input type="text" name="email" value="<%=stu.getEmail()%>"><br><br>
        
        <label>ContactNo</label>
        <input type="text" name="contactno" value="<%=stu.getContactno()%>"><br><br>
        
        <label>Marks</label>
        <input type="text" name="marks" value="<%=stu.getMarks()%>"><br><br>
      
         <input type="submit" value="UPDATE">
      </form>
    </div>
</body>
</html>