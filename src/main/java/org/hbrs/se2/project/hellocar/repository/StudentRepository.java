package org.hbrs.se2.project.hellocar.repository;

import org.hbrs.se2.project.hellocar.entities.*;
import org.hbrs.se2.project.hellocar.dtos.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
