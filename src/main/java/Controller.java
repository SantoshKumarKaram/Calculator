

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		double n1 = Double.parseDouble(request.getParameter("t1"));
		double n2 = Double.parseDouble(request.getParameter("t2"));
		
        String str = request.getParameter("btn");
        double result = 0;
        if(str.equals("+"))
        	result=n1+n2;
        else if(str.equals("-"))
            result=n1-n2;
            else if(str.equals("*"))
            	result=n1*n2;
           else 
            	result=n1/n2;
        out.print("<center><h4>Result:"+result);
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.include(request, response);
        	
        	
	}

}
