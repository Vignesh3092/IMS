<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Issue Management</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Additional custom styles */
        body {
            font-family: Arial, sans-serif;
            padding-top: 20px; /* Adjust as needed */
            background-color: #f0f0f0; /* Light gray background */
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
            text-align: center;
        }
        .list-group-item {
            background-color: #3498db; 
            border-color: #3498db;
            color: #fff; 
            transition: background-color 0.3s ease;
        }
        .list-group-item:hover {
            background-color: #2980b9;
            border-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Issue Management</h1>
        
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="list-group">
                    <a href="createIssue.jsp" class="list-group-item list-group-item-action" id="createIssue">Create Issue</a>
                    <a href="listIssue.jsp" class="list-group-item list-group-item-action" id="listIssue">List Issue</a>
                    <a href="updateIssue.jsp" class="list-group-item list-group-item-action" id="updateIssue">Update Issue</a>
                    <a href="deleteIssue.jsp" class="list-group-item list-group-item-action" id="deleteIssue">Delete Issue</a>
                </div>
            </div>
        </div>
    </div>


    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        
        document.addEventListener('DOMContentLoaded', function() {
            const links = document.querySelectorAll('.list-group-item');

            links.forEach(function(link) {
                link.addEventListener('mouseover', function() {
                    this.style.backgroundColor = getRandomColor();
                });

                link.addEventListener('mouseout', function() {
                    this.style.backgroundColor = '#3498db';
                });
            });

           
            function getRandomColor() {
                const letters = '0123456789ABCDEF';
                let color = '#';
                for (let i = 0; i < 6; i++) {
                    color += letters[Math.floor(Math.random() * 16)];
                }
                return color;
            }
        });
    </script>
</body>
</html>
