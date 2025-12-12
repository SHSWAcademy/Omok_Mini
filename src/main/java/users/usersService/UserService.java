package users.usersService;

import users.User;
import users.usersRepository.UserRepository;

public class UserService {

	private static final UserRepository USERREPOSITORY = UserRepository.getInstance();
	
	//싱글톤 
	private static volatile UserService instance;

    private UserService() { }

    public static UserService getInstance() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = new UserService();
                }
            }
        }
        return instance;
    }
    
    public User login(String userId, String userPW) {
        User user = USERREPOSITORY.findById(userId);
        if (user == null) {
        	return null;
        }
        if (!user.getUserPw().equals(userPW)) {
            return null;
        }
        return user;
    }
}
