package users.usersController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet(urlPatterns = {
		"/sign" ,
		"/sign/signup",
		"/sign/signIn",
		"/sign/signOut",
		"/sign/signWithdraw"

})
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String uri = req.getRequestURI();

		if (uri.equals("/sign/signUp")) {
			

		} else if (uri.equals("/sign/signIn")) {


		} else if (uri.equals("/sign/signOut")) {

		} 

	} //doGet
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String uri = req.getRequestURI();

			if (uri.equals("/sign/signup")) {
				
			
			} else if (uri.equals("/sign/signup")) {
				
			
			} else if (uri.equals("/sign/signIn")) {

			}else if (uri.equals("/sign/signWithdraw")) {

			}
		} // dopost
		
	

	}
