package users.usersController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import users.usersService.UserService;

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
	
	private static final UserService USERSERVICE = UserService.getInstance();

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String uri = req.getRequestURI();

		if (uri.equals("/sign/signUp")) {
			// 회원 가입 기능 구현

		} else if (uri.equals("/sign/signIn")) {
			// 로그인 기능 구현

		} else if (uri.equals("/sign/signOut")) {
			// 로그 아웃 기능 구현
			
		} 

	} 
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();

		if (uri.equals("/sign/signup")) {
			// 회원 가입 기능 구현
		
		} else if (uri.equals("/sign/signIn")) {
			// 로그인 기능 구현

		} else if (uri.equals("/sign/signWithdraw")) {
			// 회원 탈퇴 기능 구현
			
		}
	} 
		
	

	}
