package web.repository;

import web.entity.Role;

import java.util.Set;


public interface RoleDao {
    Set<Role> getAllRoles();
    Role getRoleByName(String name);
    Set<Role> getRolesByNames(String[] names);
}
