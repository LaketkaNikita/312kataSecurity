package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import web.entity.User;





public interface UserRepository extends JpaRepository <User, Long> {
    @Query(value="from User u where u.email=?1")
    User getUserByName(String email);

}