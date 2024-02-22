<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="model.Issue" %>
<%@ page import="helper.FactoryProvider" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Issues</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4; /* Light gray background */
            color: #333; /* Dark gray text color */
        }
        h1 {
            color: #007bff; /* Blue heading color */
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff; /* White table background */
        }
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2; /* Light gray header background */
        }
        .container {
            text-align: center;
            margin-top: 20px;
        }
        .btn {
            background-color: #007bff; /* Blue button background */
            color: #fff; /* White button text color */
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            text-decoration: none;
            cursor: pointer;
            display: inline-block;
        }
        .btn:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }
    </style>
</head>
<body>
    <h1>List of Issues</h1>
    
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Priority</th>
        </tr>
        
        <% 
            Session session2 = FactoryProvider.getFactory().openSession();
            
            try {
                session2.beginTransaction();
                List<Issue> issues = session2.createQuery("from Issue", Issue.class).getResultList();
                
                for (Issue issue : issues) {
        %>
                <tr>
                    <td><%= issue.getId() %></td>
                    <td><%= issue.getTitle() %></td>
                    <td><%= issue.getDescription() %></td>
                    <td><%= issue.getPriority() %></td>
                </tr>
        <%
                }
                session2.getTransaction().commit();
            } finally {
                session2.close();
            }
        %>
    </table>
    
    <div class="container">
        <a href="index.jsp" class="btn">Home</a>
    </div>
</body>
</html>
