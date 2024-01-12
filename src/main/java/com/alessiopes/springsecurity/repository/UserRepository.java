package com.alessiopes.springsecurity.repository;

import com.alessiopes.springsecurity.entities.Role;
import com.alessiopes.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
