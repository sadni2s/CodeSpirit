package org.hbrs.se2.project.hellocar.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;




@Entity
@Table (name = "Student", schema = "public")
public class Student {

    @Id
    @Column(name = "ID")
    private int id;
    public int getId() { return id;}
    public void setid(int id) {this.id = id; }

    @Basic
    @Column(name = "Studiengang")
    private String studiengang;
    public String getStudiengang() { return studiengang;}
    public void setStudiengang(String Studiengang) {this.studiengang = Studiengang;}


    @Basic
    @Column(name = "Beschreibung")
    private String beschreibung;
    public String getBeschreibung() { return beschreibung ;}
    public void setBeschreibung(String beschreibung) {this.beschreibung = beschreibung; }


    @Basic
    @Column(name = "Kontakt")
    private String kontakt;
    public String getKontakt() { return kontakt; }
    public void setKontakt(String kontakt) { this.kontakt = kontakt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(id, student.id) &&
                Objects.equals(studiengang, student.studiengang) &&
                Objects.equals(beschreibung, student.beschreibung) &&
                Objects.equals(kontakt, student.kontakt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, studiengang, beschreibung, kontakt);
    }
}

