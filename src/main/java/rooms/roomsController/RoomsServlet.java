package rooms.roomsController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RoomsServlet
 */
@WebServlet(urlPatterns = {
		"/room",
		"/room/random/create",
		"/room/code/create"

})
public class RoomsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();
		

		if (uri.equals("/room")) {
			
		} else if (uri.equals( "/room/random/create")) {
			System.out.println("room/random/create");
			
		} else if (uri.equals( "/room/code/create")) {

		} else if (uri.equals( "/room/result/popup")) {
			
		} else if (uri.equals( "/room/random/start")) {
			
		} else if (uri.equals( "/room/code/start")) {
			
		} 
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();

		if (uri.equals("/room")) {
		} else if (uri.equals( "/room/code/create")) {

		} else if (uri.equals( "/room/code/create")) {

		} else if (uri.equals( "/room/")) {
			
		}
	}

}
