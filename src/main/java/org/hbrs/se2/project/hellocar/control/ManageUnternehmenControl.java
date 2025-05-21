package org.hbrs.se2.project.hellocar.control;

import org.hbrs.se2.project.hellocar.control.factories.UnternehmenFactory;
import org.hbrs.se2.project.hellocar.dtos.UnternehmenDTO;
import org.hbrs.se2.project.hellocar.dtos.UserDTO;
import org.hbrs.se2.project.hellocar.entities.Unternehmen;
import org.hbrs.se2.project.hellocar.repository.UnternehmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ManageUnternehmenControl {

    @Autowired
    private UnternehmenRepository repository;

    public void createUnternehmen(UnternehmenDTO startUPDTO, UserDTO userDTO) {
        // Hier könnte man noch die Gültigkeit der Daten überprüfen
        // check( carDTO );

        //Erzeuge ein neues Car-Entity konsistent über eine Factory
        Unternehmen startUPEntity = UnternehmenFactory.createUnternehmen(startUPDTO, userDTO);

        // Abspeicherung des Entity in die DB
        this.repository.save(startUPEntity);
    }

    public List<UnternehmenDTO> readAllUnternehmen() {
        return repository.findUnternehmenByDateIsNotNull();

    }
}
