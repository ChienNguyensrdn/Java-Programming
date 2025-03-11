package ut.edu.demojpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.demojpa.models.Permission;
import ut.edu.demojpa.repositories.PermissionRepository;

import java.util.List;
@Service
public class PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;
    public List<Permission>findAll(){
        return permissionRepository.findAll();
    }
    public Permission CreatePermission(Permission permission){
        return permissionRepository.save(permission);
    }
    public Permission UpdatePermission(Permission permission){
        return permissionRepository.save(permission);
    }
}
