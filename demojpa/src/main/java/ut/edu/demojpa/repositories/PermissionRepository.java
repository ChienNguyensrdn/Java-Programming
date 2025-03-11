package ut.edu.demojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ut.edu.demojpa.models.Permission;

import java.util.*;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    List<Permission> findAll();

}
