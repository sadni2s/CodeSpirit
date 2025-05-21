package org.hbrs.se2.project.hellocar.repository;

import org.hbrs.se2.project.hellocar.dtos.CarDTO;
import org.hbrs.se2.project.hellocar.dtos.UnternehmenDTO;
import org.hbrs.se2.project.hellocar.entities.Unternehmen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnternehmenRepository extends JpaRepository<Unternehmen, Integer> {


    List<UnternehmenDTO> findUnternehmenByDateIsNotNull();

}
