package web.service;

import web.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(long id);
    void createUser(User user);
    void updateUser(User user);
    void delete(long id);
}