package demo.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MembersController
 */
public class MembersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MembersController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action) {
		case "destroy":
			request.getSession().invalidate();
			response.sendRedirect(request.getContextPath()+"/SiteController?action=Home");
		    break;
		
		case "Welcome":{
			request.getRequestDispatcher("Welcome.jsp").forward(request, response);
			break;
		}
	}
	
}}
