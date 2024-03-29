package demo.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String page=request.getParameter("page").toLowerCase();
		switch(page) {
		case "Home":{
			request.getRequestDispatcher("index.jsp").forward(request,response);
			break;
		}
		case "ListUsers":{
			request.getRequestDispatcher("listusers.jsp").forward(request,response);
			break;
		}
		default:{
			request.getRequestDispatcher("error.jsp").forward(request,response);
			break;
		}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
