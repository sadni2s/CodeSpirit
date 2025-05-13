package org.hbrs.se2.project.hellocar.dtos;

public interface UserDTO {
    int getId();
    String getName();
    String getEmail();
    String getPasswort();
    String getRolle();
    String getProfilbildUrl();
    java.time.LocalDate getErstellungsdatum();
    boolean isAktiv();
}
