package web.repository;

import org.springframework.stereotype.Repository;
import web.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.Set;

@Repository
public class RoleDaoImp implements RoleDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Set<Role> getAllRoles() {
        return new HashSet<Role>(em.createQuery("SELECT r FROM Role r").getResultList());
    }

    @Override
    public Role getRoleByName(String name) {
        return (Role) em.createQuery(
                "select r from Role r where r.role=:name"
        ).setParameter("name", name).getSingleResult();
    }

    @Override
    public Set<Role> getRolesByNames(String[] names) {
        Set<Role> roleSet = new HashSet<>();
        for (String role : names) {
            roleSet.add(getRoleByName(role));
        }
        return (HashSet) roleSet;
    }

}
