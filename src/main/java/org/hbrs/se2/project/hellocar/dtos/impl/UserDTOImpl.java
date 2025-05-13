package org.hbrs.se2.project.hellocar.dtos.impl;

import org.hbrs.se2.project.hellocar.dtos.UserDTO;
import java.time.LocalDate;

public class UserDTOImpl implements UserDTO {
    private int id;
    private String name;
    private String email;
    private String passwort;
    private String rolle;
    private String profilbildUrl;
    private LocalDate erstellungsdatum;
    private boolean aktiv;

    @Override
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String getPasswort() { return passwort; }
    public void setPasswort(String passwort) { this.passwort = passwort; }

    @Override
    public String getRolle() { return rolle; }
    public void setRolle(String rolle) { this.rolle = rolle; }

    @Override
    public String getProfilbildUrl() { return profilbildUrl; }
    public void setProfilbildUrl(String profilbildUrl) { this.profilbildUrl = profilbildUrl; }

    @Override
    public LocalDate getErstellungsdatum() { return erstellungsdatum; }
    public void setErstellungsdatum(LocalDate erstellungsdatum) { this.erstellungsdatum = erstellungsdatum; }

    @Override
    public boolean isAktiv() { return aktiv; }
    public void setAktiv(boolean aktiv) { this.aktiv = aktiv; }

    @Override
    public String toString() {
        return "UserDTOImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rolle='" + rolle + '\'' +
                ", aktiv=" + aktiv +
                '}';
    }
}