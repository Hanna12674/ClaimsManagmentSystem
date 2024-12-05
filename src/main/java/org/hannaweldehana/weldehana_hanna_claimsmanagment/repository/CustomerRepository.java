package org.hannaweldehana.weldehana_hanna_claimsmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods if needed
    User findByUsername(String username);
    User findByEmail(String email);
}