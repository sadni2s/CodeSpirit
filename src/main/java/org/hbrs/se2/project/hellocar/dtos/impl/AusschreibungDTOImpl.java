package org.hbrs.se2.project.hellocar.dtos.impl;

import org.hbrs.se2.project.hellocar.dtos.AusschreibungDTO;
import java.time.LocalDate;

public class AusschreibungDTOImpl implements AusschreibungDTO {

    private int id;
    private String titel;
    private String beschreibung;
    private String qualifikation;
    private LocalDate datum;

    @Override
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    @Override
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    @Override
    public String getQualifikation() { return qualifikation; }
    public void setQualifikation(String qualifikation) { this.qualifikation = qualifikation; }

    @Override
    public LocalDate getDatum() {
        return datum;
    }
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "AusschreibungDTOImpl{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", qualifikation='" + qualifikation + '\'' +
                ", datum=" + datum +
                '}';
    }
}

