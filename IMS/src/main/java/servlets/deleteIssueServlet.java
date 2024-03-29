package servlets;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import helper.FactoryProvider;
import model.Issue; // Make sure to import your Issue entity class

@WebServlet("/deleteIssueServlet")
public class deleteIssueServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the ID of the issue to delete from the form
        int issueId = Integer.parseInt(request.getParameter("id"));

        // Create a Hibernate Session
        Session session = FactoryProvider.getFactory().openSession();

        try {
            // Begin a transaction
            session.beginTransaction();

            // Retrieve the issue with the given ID from the database
            Issue issue = session.get(Issue.class, issueId);

            // Delete the issue if found
            if (issue != null) {
                session.remove(issue);
            } else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h1 style='text-align:center;'>Issue Not Found</h1>");
                out.println("<h1 style='text-align:center;'><a href='listIssues.jsp'>View all Issues</a></h1>");
            }

            // Commit the transaction
            session.getTransaction().commit();
        } finally {
            session.close();
        }

        // Redirect to a success page or a list of issues
        response.sendRedirect("listIssue.jsp");
    }
}
