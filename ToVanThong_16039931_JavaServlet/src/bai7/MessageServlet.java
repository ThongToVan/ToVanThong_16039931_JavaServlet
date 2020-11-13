package bai7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet("/messageservlet" )
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String message= (String) request.getAttribute("message");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String first = request.getParameter("firstName");
		String last = request.getParameter("lastName");
		Part filePart = request.getPart("photo");
		
		String html="<br>" + "<html>" + "<head>" + "<title> Result Page </title>" 
				+"</head>" + "<body>" + "<p>" + "Upload hinh anh va luu dang binary thanh cong!" +  "</p>" + "First Name: " + first + "<br>" + "Last Name: " + last + "<br>"
				+"Portrait photo: " + filePart.getName() + "</body>" + "</html>";
		out.println(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
