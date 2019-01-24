<%@ page import="com.app.EmployeeBO" %>
<%@ page import="com.model.EmployeeEntity" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      table, th, td {
        width: 50%;
        border: 1px solid black;
        border-collapse: collapse;
      }
      th {
        background: gray;
      }
    </style>
  </head>
  <body>

  <%
    EmployeeBO ebo = new EmployeeBO();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  %>

  <table>
    <tr>
      <th>Employee ID</th>
      <th>Name</th>
      <th>Salary</th>
      <th>Start date</th>
    </tr>
    <%
      for (EmployeeEntity employee : ebo.getEmployees()) {
        %>
    <tr>
      <td><%=employee.getEmployeeId()%></td>
      <td><%=employee.getName()%></td>
      <td><%=employee.getSalary()%></td>
      <td><%=employee.getStartDate().toLocalDateTime().format(format)%></td>
    </tr>
    <%
      }
    %>
  </table>

  </body>
</html>
