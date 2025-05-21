package org.hbrs.se2.project.hellocar.control.factories;

import org.hbrs.se2.project.hellocar.dtos.UnternehmenDTO;
import org.hbrs.se2.project.hellocar.dtos.UserDTO;
import org.hbrs.se2.project.hellocar.entities.Unternehmen;

public class UnternehmenFactory {

        public static Unternehmen createUnternehmen(UnternehmenDTO startUPDTO, UserDTO userDTO) {
            // Erzeuge ein Car-Entity; die ID wird intern hochgezählt (@GeneratedValue auf ID)
            Unternehmen startUP = new Unternehmen();
            // ID könnte man ggf. noch mal anpassen: car.setID( xx );

            // Übernehme die Grundparameter aus dem DTO, also den Werten, die in der UI eingegeben wurden:
            startUP.setStartupName(  startUPDTO.getStartupName() );
            startUP.setBeschreibung( startUPDTO.getBeschreibung() );
            startUP.setGruendungsjahr( startUPDTO.getGruendungsjahr() );
            startUP.setStandort(  startUPDTO.getStandort() );

            // Setze die UserID des Users, welche das Auto eingestellt hat
            startUP.setId( userDTO.getId() );

            // und zurück das gute Stück:
            return startUP;
        }
}
