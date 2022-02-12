package web.repository;

import web.entity.User;
import java.util.List;

public interface UserDAO {

    List<User>getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}