package web.service;
import web.entity.User;
//import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser( User user);
}