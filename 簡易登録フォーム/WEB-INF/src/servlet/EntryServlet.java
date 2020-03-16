package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/EntryServlet")
public class EntryServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html;charset=Windows-31J");
		String l_name = request.getParameter("Last_name");
		if (l_name.length() < 5){
			this.getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
		}else{
			request.setAttribute("msg",l_name);
			this.getServletContext().getRequestDispatcher("/confirm.jsp").forward(request,response);
		}
	}
}