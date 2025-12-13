package users.usersRepository;

import users.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Repository.OmokRepository;

public class UserRepository extends OmokRepository<User, String>{

	private static volatile UserRepository instance;

    private UserRepository() { }

    public static UserRepository getInstance() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = new UserRepository();
                }
            }
        }
        return instance;
    }

	@Override
	protected User mapRow(ResultSet rs) throws SQLException {
	    User user = new User();
		user.setSeqId(rs.getInt("SEQ_ID"));
	    user.setUserId(rs.getString("USER_ID"));
	    user.setUserPw(rs.getString("USER_PW"));
	    user.setEmail(rs.getString("EMAIL"));
	    user.setNickname(rs.getString("NICKNAME"));
	    
		return user;
	}

	@Override
	public User save(User e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(String id) {
		String sql = "SELECT * FROM omokdb.USERS WHERE user_id = ?";
	    
	    return executeQuery(sql,
	        pstmt -> pstmt.setString(1, id),
	        rs -> {
	            try {
					if (rs.next()) {
					    return mapRow(rs);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            return null;
	        }
	    );
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    

}
