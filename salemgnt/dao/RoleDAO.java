package dao;

import java.util.List;
import pojo.Role;

public interface RoleDAO {
   
   boolean createTable(String s); 
   void save (Role role);
   
   void update(Role role);
   
   Role getRolesById(int id);
   
   Role getRoleByRoleName(String roleName);
   
   boolean deleteRole(String roleName);
   
   List<Role> getRoles();
   
}
