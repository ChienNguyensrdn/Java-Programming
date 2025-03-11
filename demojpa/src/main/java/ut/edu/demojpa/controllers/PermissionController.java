package ut.edu.demojpa.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ut.edu.demojpa.services.PermissionService;
import java.util.List;
import ut.edu.demojpa.models.Permission;
@RestController
//REST API
@RequestMapping("/per")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;
    //Methods REST
    /*
    GET : -> Lay du lieu
    Get {id} --> url/permission/{id}
    --> SQL Injection
    Get  url/permissions
    POST: -> Them moi (Create)
    PUT: -> Update toan bo (/{id})
    PATCH: -> Update mot phan cua object (/{id})
    DELETE: -> Delete (/{id})
    Khi khai bao Controller khong dong tu url
    Method se quyet dinh hanh vi cua no
     */
    @GetMapping("/permissions")
    public List<Permission> getAllPermissions() {
        return permissionService.findAll();
    }
    @PostMapping("/permission")
    public Permission addPermission(@RequestBody Permission permission) {
        return permissionService.CreatePermission(permission);
    }
    @PutMapping("/permission/{id}")
    public Permission updatePermission(@RequestBody Permission permission) {
        return permissionService.CreatePermission(permission);
    }

}
