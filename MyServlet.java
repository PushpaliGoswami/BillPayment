package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/controller.MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String first=request.getParameter("first");
		String last=request.getParameter("last");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String phno=request.getParameter("phno");
		String pan=request.getParameter("pan");
		String aadhar=request.getParameter("aadhar");
		String id=request.getParameter("id");
		String pswd=request.getParameter("pswd");
		String type=request.getParameter("type");
		Bean b=new Bean();
		try{
			int output=b.buildQuery(first,last,age,gender,phno,pan,aadhar,id,pswd,type);
			if(output==1)
			{
				RequestDispatcher rd=request.getRequestDispatcher("view/user.jsp");
				rd.forward(request, response);
			}
			
			else
			{
				
        PrintWriter p=response.getWriter();
        p.print("Please update the highlighted mandatory field(s)");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

}
