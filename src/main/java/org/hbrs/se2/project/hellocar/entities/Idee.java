package org.hbrs.se2.project.hellocar.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Idee", schema = "public")
public class Idee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name = "Titel")
    private String titel;
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    @Basic
    @Column(name = "Problemstellung")
    private String problemstellung;
    public String getProblemstellung() { return problemstellung; }
    public void setProblemstellung(String problemstellung) { this.problemstellung = problemstellung; }

    @Basic
    @Column(name = "Vision")
    private String vision;
    public String getVision() { return vision; }
    public void setVision(String vision) { this.vision = vision; }

    @Basic
    @Column(name = "Beschreibung")
    private String beschreibung;
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    @Basic
    @Column(name = "Erstellungsdatum")
    private LocalDate erstellungsdatum;
    public LocalDate getErstellungsdatum() { return erstellungsdatum; }
    public void setErstellungsdatum(LocalDate erstellungsdatum) { this.erstellungsdatum = erstellungsdatum; }

    @Basic
    @Column(name = "Status")
    private String status;
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Idee)) return false;
        Idee idee = (Idee) o;
        return id == idee.id &&
                Objects.equals(titel, idee.titel) &&
                Objects.equals(problemstellung, idee.problemstellung) &&
                Objects.equals(vision, idee.vision) &&
                Objects.equals(beschreibung, idee.beschreibung) &&
                Objects.equals(erstellungsdatum, idee.erstellungsdatum) &&
                Objects.equals(status, idee.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, problemstellung, vision, beschreibung, erstellungsdatum, status);
    }
}
