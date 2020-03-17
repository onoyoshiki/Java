package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/EntryServlet")
public class EntryServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html;charset=Windows-31J");
		
		
		String l_name = request.getParameter("Last_name");
		String f_name = request.getParameter("Full_name");
		String birth = request.getParameter("Birthday");
		String address = request.getParameter("mail_Address");
		
		String[] lists = {l_name, f_name, birth, address};
		
		for(String list : lists){
			//入力チェック
			if (EmptyCheck(list)){
				
				//文字列長さチェック
				if (LengthCheck(list,10)){
					
					//形式チェック
					if (StyleCheck(list)){
						request.setAttribute("msg",list);
						this.getServletContext().getRequestDispatcher("/confirm.jsp").forward(request,response);
					}else{
						this.getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
					}
				}else{
					this.getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
				}
			}else{
				this.getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
		}
	}
	
	public boolean EmptyCheck(String param){
		if(param == null)
			return false;
		
		if(param.isEmpty())
			return false;
		
		return true;
	}
	
	public boolean LengthCheck(String str, int len){
		if(str.length() > len)
			return false;
		else
			return true;
	}
	
	public boolean StyleCheck(String sty){
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(sty);
		
		if(m.find())
			return false;
		
		return true;
	}
}