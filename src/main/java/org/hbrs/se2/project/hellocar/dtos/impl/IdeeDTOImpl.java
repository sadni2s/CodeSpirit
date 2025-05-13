package org.hbrs.se2.project.hellocar.dtos.impl;

import org.hbrs.se2.project.hellocar.dtos.IdeeDTO;

import java.time.LocalDate;

public class IdeeDTOImpl implements IdeeDTO {

    private int id;
    private String titel;
    private String problemstellung;
    private String vision;
    private String beschreibung;
    private LocalDate erstellungsdatum;
    private String status;

    @Override
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    @Override
    public String getProblemstellung() { return problemstellung; }
    public void setProblemstellung(String problemstellung) { this.problemstellung = problemstellung; }

    @Override
    public String getVision() { return vision; }
    public void setVision(String vision) { this.vision = vision; }

    @Override
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public LocalDate getErstellungsdatum() {
        return erstellungsdatum;
    }
    public void setErstellungsdatum(LocalDate erstellungsdatum) { this.erstellungsdatum = erstellungsdatum; }

    @Override
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "IdeeDTOImpl{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", problemstellung='" + problemstellung + '\'' +
                ", vision='" + vision + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", erstellungsdatum=" + erstellungsdatum +
                ", status='" + status + '\'' +
                '}';
    }
}
