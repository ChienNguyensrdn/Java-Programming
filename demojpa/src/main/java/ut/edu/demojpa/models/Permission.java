package ut.edu.demojpa.models;
import java.util.*;
import jakarta.persistence.*;

@Entity
public class Permission {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Code", length = 50)
    private String code;

    @Column(name = "permission_name", length = 100)
    private String permissionName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPermissonName() {
        return permissionName;
    }

    public void setPermissonName(String permissonName) {
        this.permissionName = permissonName;
    }
    @ManyToMany(mappedBy = "Permission")
    private Set<User> users = new HashSet<>();
    public Set<User> getUsers() {return users;}
    public void setUsers(Set<User> users) {this.users = users;}
}