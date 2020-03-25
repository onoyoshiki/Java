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
		
		String lastName = request.getParameter("Last_name");
		String fullName = request.getParameter("Full_name");
		String birth = request.getParameter("Birthday");
		String address = request.getParameter("mail_Address");
		
		int maxLength = 10;
		
		String errMsg = "";
		String emptyErr = "�����͂ł�<br>";
		String lengthErr = "�����ȓ��œ��͂��ĉ�����<br>";
		String StyleErr = "�����͗��p�ł��܂���<br>";
		String StyleErrDate = "�����͗��p�ł��܂���<br>";
		
		String strLastName = "���O�i���j�F";
		String strFullName = "���O�i���j�F";
		String strBirth = "�a�����F";
		String strAddress = "���[���A�h���X�F";
		
		//���O�i���j
		//���̓`�F�b�N
		if (isEmpty(lastName)){
			
			//�����񒷂��`�F�b�N
			if (isValidLength(lastName,maxLength)){
				
				//�`���`�F�b�N
				if (isValidStyle(lastName)){
					request.setAttribute("Name1",lastName);
				}else{
					errMsg = strLastName + StyleErr;
				}
			}else{
				errMsg = strLastName + String.valueOf(maxLength) + lengthErr;
			}
		}else{
			errMsg = strLastName + emptyErr;
		}
		
		//���O�i���j
		//���̓`�F�b�N
		if (isEmpty(fullName)){
			
			//�����񒷂��`�F�b�N
			if (isValidLength(fullName,maxLength)){
				
				//�`���`�F�b�N
				if (isValidStyle(fullName)){
					request.setAttribute("Name2",fullName);
				}else{
					errMsg += strFullName + StyleErr;
				}
			}else{
				errMsg += strFullName + String.valueOf(maxLength) + lengthErr;
			}
		}else{
			errMsg += strFullName + emptyErr;
		}
		
		//�a����
		//���̓`�F�b�N
		if (isEmpty(birth)){
			
			//�����񒷂��`�F�b�N
			if (isValidLength(birth,maxLength)){
				
				//�`���`�F�b�N
				if (isValidDateStyle(birth)){
					request.setAttribute("Birth",birth);
				}else{
					errMsg += strBirth + StyleErrDate;
				}
			}else{
				errMsg += strBirth + String.valueOf(maxLength) + lengthErr;
			}
		}else{
			errMsg += strBirth + emptyErr;
		}
		
		//���[���A�h���X
		//���̓`�F�b�N
		if (isEmpty(address)){
			
			//�����񒷂��`�F�b�N
			if (isValidLength(address,maxLength)){
				
				//�`���`�F�b�N
				if (isValidStyle(address)){
					request.setAttribute("Address",address);
				}else{
					errMsg += strAddress + StyleErr;
				}
			}else{
				errMsg += strAddress + String.valueOf(maxLength) + lengthErr;
			}
		}else{
			errMsg += strAddress + emptyErr;
		}
		
		if(errMsg.isEmpty()){
			this.getServletContext().getRequestDispatcher("/confirm.jsp").forward(request,response);
		}else{
			request.setAttribute("errmsg",errMsg);
			this.getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
		}
		
	}
	
	public boolean isEmpty(String param){
		if(param == null)
			return false;
		
		if(param.isEmpty())
			return false;
		
		return true;
	}
	
	public boolean isValidLength(String str, int len){
		if(str.length() > len)
			return false;
		else
			return true;
	}
	
	public boolean isValidStyle(String sty){
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(sty);
		
		if(m.find())
			return false;
		
		return true;
	}
	
	public boolean isValidDateStyle(String sty){
		Pattern p = Pattern.compile("^[0-9]{4}/[0-9]{2}/[0-9]{2}$");
		Matcher m = p.matcher(sty);
		
		if(m.find())
			return false;
		
		return true;
	}
}