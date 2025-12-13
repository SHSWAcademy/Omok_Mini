package users;

public class SignInForm {
	private String userId;
	private String userPw;
	
	public SignInForm(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public boolean isValid(String userId, String userPw) {
		Boolean result = true;
		if (userId.equals(null) || userId.equals("")) {
			result = false;
		}
		if (userPw.equals(null) || userPw.equals("")) {
			result = false;
		}
		return result;
	}

}
