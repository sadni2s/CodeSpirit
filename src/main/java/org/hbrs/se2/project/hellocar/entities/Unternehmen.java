package org.hbrs.se2.project.hellocar.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Unternehmen", schema = "public")
public class Unternehmen extends User {

    @Id
    @Column(name = "User_ID")
    private int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name = "Startup_Name")
    private String startupName;
    public String getStartupName() { return startupName; }
    public void setStartupName(String startupName) { this.startupName = startupName; }

    @Basic
    @Column(name = "Beschreibung")
    private String beschreibung;
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    @Basic
    @Column(name = "Gruendungsjahr")
    private int gruendungsjahr;
    public int getGruendungsjahr() { return gruendungsjahr; }
    public void setGruendungsjahr(int gruendungsjahr) { this.gruendungsjahr = gruendungsjahr; }

    @Basic
    @Column(name = "Standort")
    private String standort;
    public String getStandort() { return standort; }
    public void setStandort(String standort) { this.standort = standort; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unternehmen that = (Unternehmen) o;
        return id == that.id &&
                gruendungsjahr == that.gruendungsjahr &&
                Objects.equals(startupName, that.startupName) &&
                Objects.equals(beschreibung, that.beschreibung) &&
                Objects.equals(standort, that.standort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startupName, beschreibung, gruendungsjahr, standort);
    }
}
