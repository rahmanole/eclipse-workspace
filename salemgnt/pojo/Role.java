package pojo;

public class Role {
    private int id;
    private String roleName;

    public Role() {
    }
    
    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }
    
}
