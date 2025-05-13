package org.hbrs.se2.project.hellocar.repository;

import org.hbrs.se2.project.hellocar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
