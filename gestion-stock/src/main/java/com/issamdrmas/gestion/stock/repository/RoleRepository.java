package com.issamdrmas.gestion.stock.repository;
import java.util.Optional;

import com.issamdrmas.gestion.stock.model.Role;
import com.issamdrmas.gestion.stock.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
