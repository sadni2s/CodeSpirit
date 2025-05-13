package org.hbrs.se2.project.hellocar.repository;

import org.hbrs.se2.project.hellocar.entities.Idee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeeRepository extends JpaRepository<Idee, Integer> {
}
