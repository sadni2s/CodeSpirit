package org.hbrs.se2.project.hellocar.dtos.impl;

import org.hbrs.se2.project.hellocar.dtos.RolleDTO;
import org.hbrs.se2.project.hellocar.dtos.StudentDTO;
import java.util.List;

public class StudentDTOImpl implements StudentDTO {
    private int id;
    private String studiengang;
    private String beschreibung;
    private String kontakt;
    private List<RolleDTO> roles;
    @Override
    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}
    @Override
    public String getStudiengang() {return this.studiengang;}
    public void setStudiengang(String studiengang) {this.studiengang = studiengang;}
    @Override
    public String getBeschreibung() {return this.beschreibung;}
    public void setBeschreibung (String beschreibung) {this.beschreibung = beschreibung;}
    @Override
    public String getKontakt() {return this.kontakt;}
    public void setKontakt(String kontakt) {this.kontakt = kontakt;}
    @Override
    public List<RolleDTO> getRoles(){return this.roles;}
    public void setRoles(List<RolleDTO> roles) {
        this.roles = roles;
    }
    @Override
    public String toString() {
        return "StudentDTOImpl{" +
                "id=" + id +
                ", studiengang=" + studiengang +
                ", beschreibung=" + beschreibung +
                ", kontakt=" + kontakt +
                '}';
    }
}
