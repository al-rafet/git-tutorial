<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    if(session.getAttribute("userid")==null || (session.getAttribute("userid")==""))
    {
  %>
  You are not logged in<br>
  <a href="index.jsp">Please Log in</a>
  <% } else { %>
  Welcome <%= session.getAttribute("userid") %>
  <a href="editinfo.jsp">Edit Information </a><br>
  <a href="Logout.jsp">Log Out</a>
  <%
    }
  %>
  