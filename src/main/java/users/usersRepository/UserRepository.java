package users.usersRepository;

import users.User;

public class UserRepository extends OmokRepository<User, Integer>{

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
    public User save(User user) {
        String sql = "INSERT INTO users(name) VALUES(?)";
        executeUpdate(sql, pstmt -> pstmt.setString(1, user.getName()));
        return user;
    }

    @Override
    public User findById(Integer id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return executeQuery(sql, pstmt -> pstmt.setInt(1, id), rs -> {
            try {
                if (rs.next()) {
                    User user = new User(rs.getString("name"));
                    user.setId(rs.getInt("id"));
                    return user;
                }
            } catch (Exception e) { e.printStackTrace(); }
            return null;
        });
    }

    @Override
    public boolean delete(Integer id) {
        String sql = "DELETE FROM users WHERE id = ?";
        return executeUpdate(sql, pstmt -> pstmt.setInt(1, id)) > 0;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        return executeQuery(sql, null, rs -> {
            List<User> list = new ArrayList<>();
            try {
                while (rs.next()) {
                    User user = new User(rs.getString("name"));
                    user.setId(rs.getInt("id"));
                    list.add(user);
                }
            } catch (Exception e) { e.printStackTrace(); }
            return list;
        });
    }
}
