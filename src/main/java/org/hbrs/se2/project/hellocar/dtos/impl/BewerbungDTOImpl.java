package org.hbrs.se2.project.hellocar.dtos.impl;

import org.hbrs.se2.project.hellocar.dtos.BewerbungDTO;
import java.time.LocalDate;

public class BewerbungDTOImpl implements BewerbungDTO {

    private int id;
    private String bewerbungstext;
    private String status;
    private LocalDate bewerbungsdatum;

    @Override
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getBewerbungstext() {
        return bewerbungstext;
    }
    public void setBewerbungstext(String bewerbungstext) {
        this.bewerbungstext = bewerbungstext;
    }

    @Override
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public LocalDate getBewerbungsdatum() {
        return bewerbungsdatum;
    }
    public void setBewerbungsdatum(LocalDate bewerbungsdatum) {
        this.bewerbungsdatum = bewerbungsdatum;
    }

    @Override
    public String toString() {
        return "BewerbungDTOImpl{" +
                "id=" + id +
                ", bewerbungstext='" + bewerbungstext + '\'' +
                ", status='" + status + '\'' +
                ", bewerbungsdatum=" + bewerbungsdatum +
                '}';
    }
}
