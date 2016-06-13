package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet({"/servlet" , "/Servlet" })
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Basic doGet
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    	    throws IOException, ServletException
    	    {
    	        response.setContentType("text/html");
    	        PrintWriter out = response.getWriter();
    	        out.println("<html>");
    	        out.println("<head>");
    	        out.println("<title>Hello World!</title>");
    	        out.println("</head>");
    	        out.println("<body>");
    	        
    	        try {
    	        	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	    		out.println("<h1>MySQL-Treiber wurde geladen!</h1>");
    			} catch (Exception e) {
    				out.println("<b>MySQL-Treiber konnte nicht geladen werden</b>");
    				out.println("<pre><code>");
    				out.println(e.getStackTrace());
    				out.println("</code></pre>");
    			}

    	        out.println("<h1>Hello World!</h1>");
    	        out.println("</body>");
    	        out.println("</html>");
    	    }

}
