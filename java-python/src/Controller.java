

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jep.JepException;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int num1 = Integer.parseInt(request.getParameter("num1"));
		System.out.println(num1);
		int num2 = Integer.parseInt(request.getParameter("num2"));
		Calculator cal = new Calculator();
		try {
			int result = cal.Calculator(num1, num2);
			System.out.println(result);
			request.setAttribute("result", result);
		} catch (JepException e) {
			e.printStackTrace();
		}
		RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
		disp.forward(request, response);
	}

}
