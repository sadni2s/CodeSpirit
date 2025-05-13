package org.hbrs.se2.project.hellocar.repository;


import org.hbrs.se2.project.hellocar.entities.Ausschreibung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusschreibungRepository extends JpaRepository<Ausschreibung, Integer> {
}