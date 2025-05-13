package org.hbrs.se2.project.hellocar.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Bewerbung", schema = "public")
public class Bewerbung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name = "Bewerbungstext")
    private String bewerbungstext;
    public String getBewerbungstext() { return bewerbungstext; }
    public void setBewerbungstext(String bewerbungstext) { this.bewerbungstext = bewerbungstext; }

    @Basic
    @Column(name = "Status")
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Basic
    @Column(name = "Bewerbungsdatum")
    private LocalDate bewerbungsdatum;
    public LocalDate getBewerbungsdatum() { return bewerbungsdatum; }
    public void setBewerbungsdatum(LocalDate bewerbungsdatum) { this.bewerbungsdatum = bewerbungsdatum; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bewerbung)) return false;
        Bewerbung that = (Bewerbung) o;
        return id == that.id &&
                Objects.equals(bewerbungstext, that.bewerbungstext) &&
                Objects.equals(status, that.status) &&
                Objects.equals(bewerbungsdatum, that.bewerbungsdatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bewerbungstext, status, bewerbungsdatum);
    }
}
