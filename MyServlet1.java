package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

@WebServlet("/controller.MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet1() {
        super();
      
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pswd=request.getParameter("pswd");
		
		Bean1 b=new Bean1();
		Bean2 b1=new Bean2();
		try{
			String output=b.buildQuery(id, pswd);
			HttpSession session=request.getSession();
			String firstname=b1.buildQuery(id, pswd);
			if(output.equals("a"))
			{
				session.setAttribute("user",firstname);
				RequestDispatcher rd=request.getRequestDispatcher("view/admin.jsp");
				rd.forward(request, response);
			}
			else if(output.equals("c"))
			{
				session.setAttribute("user", firstname);
				RequestDispatcher rd=request.getRequestDispatcher("view/customer.jsp");
				rd.forward(request, response);
			}
			else
			{
				

				RequestDispatcher rd=request.getRequestDispatcher("view/invalid.jsp");
				rd.include(request, response);
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
