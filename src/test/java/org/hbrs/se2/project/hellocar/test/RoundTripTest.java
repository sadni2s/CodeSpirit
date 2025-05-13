package org.hbrs.se2.project.hellocar.test;

import org.hbrs.se2.project.hellocar.entities.User_Alda;
import org.hbrs.se2.project.hellocar.repository.User_AldaRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RoundTripTest {


    @Autowired
    private User_AldaRepository userRepository;

    @Test
    /**
     * Round Triping Test mit einer einfachen Strecke (C-R-Ass-D).
     * Dieses Muster für Unit-Tests wird in der Vorlesung SE-2 eingeführt (Kapitel 6).
     *
     */
    void createReadAndDeleteAUser() {

        // Schritt 1: C = Create (hier: Erzeugung und Abspeicherung mit der Method save()
        // Anlegen eines Users. Eine ID wird automatisch erzeugt durch JPA
        User_Alda user = new User_Alda();
        user.setEmail("test@myserver.de");
        user.setFirstName( "Torben" );
        user.setLastName("Michel");
        // und ab auf die DB damit (save!)
        userRepository.save( user );

        // Da die ID auto-generiert wurde, müssen wir uns die erzeugte ID nach dem Abspeichern merken:
        int idTmp = user.getId();

        // Schritt 2: R = Read (hier: Auslesen über die Methode find()ById
        Optional<User_Alda> wrapper = userRepository.findById( idTmp );
        User_Alda userAfterCreate = null;
        if ( wrapper.isPresent() ) {
            userAfterCreate = wrapper.get();
        }

        // Schritt 3: Ass = Assertion: Vergleich der vorhandenen Objekte auch Gleichheit...
        assertEquals( userAfterCreate.getLastName() , "Michel" );
        assertEquals( userAfterCreate.getFirstName() , "Torben" );
        // ... sowie auf Identität
        assertNotSame( user , userAfterCreate );

        // Schritt 4: D = Deletion, also Löschen des Users, um Datenmüll zu vermeiden
        userRepository.deleteById(idTmp);
        // Schritt 4.1: Wir sind vorsichtig und gucken, ob der User wirklich gelöscht wurde ;-)
        Optional<User_Alda> wrapperAfterDelete = userRepository.findById(idTmp);
        System.out.println("Wrapper: " + wrapperAfterDelete);
        assertFalse( wrapperAfterDelete.isPresent() );
    }

    @AfterEach
    public void deleteUser(){
        // Hier könnte man nach einem RoundTrip die DB noch weiter bereinigen
    }


}
