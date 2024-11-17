<%@page import="com.cjc.app.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
 <script type="text/javascript">
 
   function deleteData(){
	   alert('You Are Deleting Data...!');
	   document.myForm.action="delete";
	   document.myForm.submit();
   }
   
   function editData(){
	   alert('You Are Editing Data...!');
	   document.myForm.action="edit";
	   document.myForm.submit();
   }
 
 </script>

</head>
<body style="background-color: silver;">
    
     <%
     List<Student> stuList=(List<Student>)request.getAttribute("list");
     %>
    <h1 style="text-align: center; color: red">Welcome To Display Page</h1>
    
    <div align="center">
    <form name="myForm">
      
      <table border="1px">
    <caption>STUDENT RECORDS</caption>
       <thead>
        <tr>
        <th>Select</th>
        <th>Student RollNo</th>
        <th>Student Name</th>
        <th>Student Address</th>
        <th>Student Email_Id</th>
        <th>Student Contact_No</th>
        <th>Student Marks</th>
        </tr>
       </thead>
           <tbody>
           <%
           for(Student stu  :stuList){
           %>
           
           <tr>
           <td><input type="radio" name="rollno" value="<%=stu.getRollno()%>"></td>
           <td><%=stu.getRollno()%></td>
           <td><%=stu.getName()%></td>
           <td><%=stu.getAddress()%></td>
           <td><%=stu.getEmail()%></td>
           <td><%=stu.getContactno()%></td>
           <td><%=stu.getMarks()%></td>
           </tr>
           
           <%
           }
           %>
           
      </tbody>
    </table>
    
    <button style="background-color: green;" onclick="editData()" value="EDIT">EDIT</button>
    <button style="background-color: red;" onclick="deleteData()" value="DELETE">DELETE</button>
   </form>
  </div>
    
  </body>
</html>