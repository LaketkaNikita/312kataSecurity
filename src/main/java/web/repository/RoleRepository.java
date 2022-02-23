package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.entity.Role;


import java.util.HashSet;
import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Long> {

}