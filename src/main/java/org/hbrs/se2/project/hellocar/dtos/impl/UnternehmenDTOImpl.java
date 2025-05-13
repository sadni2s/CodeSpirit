package org.hbrs.se2.project.hellocar.dtos.impl;

import org.hbrs.se2.project.hellocar.dtos.UnternehmenDTO;
import java.time.LocalDate;

public class UnternehmenDTOImpl implements UnternehmenDTO {
    private int id;
    private String startupName;
    private String beschreibung;
    private int gruendungsjahr;
    private String standort;

    @Override
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String getStartupName() { return startupName; }
    public void setStartupName(String startupName) { this.startupName = startupName; }

    @Override
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    @Override
    public int getGruendungsjahr() { return gruendungsjahr; }
    public void setGruendungsjahr(int gruendungsjahr) { this.gruendungsjahr = gruendungsjahr; }

    @Override
    public String getStandort() { return standort; }
    public void setStandort(String standort) { this.standort = standort; }

    @Override
    public String toString() {
        return "UnternehmenDTOImpl{" +
                "id=" + id +
                ", startupName='" + startupName + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", gruendungsjahr=" + gruendungsjahr +
                ", standort='" + standort + '\'' +
                '}';
    }
}
