package org.hbrs.se2.project.hellocar.repository;

import org.hbrs.se2.project.hellocar.entities.Bewerbung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BewerbungRepository extends JpaRepository<Bewerbung, Integer> {
}
