package servlets;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helper.FactoryProvider;
import model.Issue;

@WebServlet("/updateIssueServlet")
public class updateIssueServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public updateIssueServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int issueId = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String priority = request.getParameter("priority");

        Session session = FactoryProvider.getFactory().openSession();

        try {
            session.beginTransaction();
            Issue issue = session.get(Issue.class, issueId);

            if (issue != null) {
                issue.setTitle(title);
                issue.setDescription(description);
                issue.setPriority(priority);

                session.merge(issue);
            } else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h1 style='text-align:center;'>Issue Not Found</h1>");
                out.println("<h1 style='text-align:center;'><a href='listIssues.jsp'>View all Issues</a></h1>");
            }

            session.getTransaction().commit();
        } finally {
            session.close();
        }

        response.sendRedirect("listIssue.jsp");
    }
}
