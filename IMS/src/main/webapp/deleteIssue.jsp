<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="org.hibernate.Session"%>
<%@ page import="model.Issue"%>
<%@ page import="helper.FactoryProvider"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Issue</title>
<style>
/* Add your CSS styles here */
body {
    font-family: Arial, sans-serif;
}

h1 {
    color: #333;
}

form {
    max-width: 400px;
    margin: 0 auto;
}

label {
    display: block;
    margin-bottom: 5px;
}

input[type="text"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

input[type="submit"] {
    background-color: #d9534f;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #c9302c;
}

table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
}

th, td {
    border: 1px solid #ccc;
    padding: 8px;
    text-align: left;
}

th {
    background-color: #f2f2f2;
}
</style>
</head>
<body>
    <h1>Delete Issue</h1>

    <h2>List of Issues</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Description</th>
            <!-- Add more columns as needed -->
        </tr>

        <% 
        Session session2 = FactoryProvider.getFactory().openSession();
            
            try {
                session2.beginTransaction();
                List<Issue> issues = session2.createQuery("from Issue").getResultList();
                
                for (Issue issue : issues) {
        %>
        <tr>
            <td><%= issue.getId() %></td>
            <td><%= issue.getDescription() %></td>
            <!-- Add more columns as needed -->
        </tr>
        <%
                }
                session2.getTransaction().commit();
            } finally {
                session2.close();
            }
        %>
    </table>

    <h2>Delete Issue</h2>
    <form action="deleteIssueServlet" method="post">
        <label for="id">Issue ID:</label> <input type="text" name="id"
            required> <input type="submit" value="Delete Issue">
    </form>
</body>
</html>
