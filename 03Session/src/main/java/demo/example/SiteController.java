package demo.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action) {
		case "Home":{
			request.getRequestDispatcher("Home.jsp").forward(request,response);
		    break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request,response);
			break;
		}}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("action");
		switch(action) {
		case "authenticate":{
			authenticate(request,response);
		
		    break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request,response);
			break;
		}
//		String Name=request.getParameter("name");
//		String Password=request.getParameter("password");
//		if(Name.equals("Akki")&& Password.equals("123")) {
//			request.getSession().invalidate();
//			HttpSession newsession=request.getSession();
//			newsession.setMaxInactiveInterval(500);
//			newsession.setAttribute("Name", Name);
//			response.sendRedirect(request.getContextPath()+"/MembersController?action=Welcome");
//		}else {
//			response.sendRedirect(request.getContextPath()+"/SiteController?action=Home");
//		}
	}
	protected void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Name=request.getParameter("name");
	String Password=request.getParameter("password");
	if(Name.equals("Akki")&& Password.equals("123")) {
		request.getSession().invalidate();
		HttpSession newsession=request.getSession();
		newsession.setMaxInactiveInterval(500);
		newsession.setAttribute("Name", Name);
		response.sendRedirect(request.getContextPath()+"/MembersController?action=Welcome");
	}else {
		response.sendRedirect(request.getContextPath()+"/SiteController?action=Home");
	}
}}
