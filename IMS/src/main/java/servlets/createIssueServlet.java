package servlets;



import java.io.IOException;
import java.io.PrintWriter;
//
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helper.FactoryProvider;
import model.Issue;

@WebServlet("/createIssueServlet")
public class createIssueServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public createIssueServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String priority = request.getParameter("priority");

        Issue issue = new Issue();
        issue.setTitle(title);
        issue.setDescription(description);
        issue.setPriority(priority);
        
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(issue);
        tx.commit();
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1 style='text-align:center;'>Issue is added successfully</h1>");
        out.println("<h1 style='text-align:center;'><a href='listIssue.jsp'>View all Issues</a></h1>");
    }
}

