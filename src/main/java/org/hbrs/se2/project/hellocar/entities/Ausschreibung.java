package org.hbrs.se2.project.hellocar.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Ausschreibung", schema = "public")
public class Ausschreibung {

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
    @Column(name = "Beschreibung")
    private String beschreibung;
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    @Basic
    @Column(name = "Qualifikation")
    private String qualifikation;
    public String getQualifikation() { return qualifikation; }
    public void setQualifikation(String qualifikation) { this.qualifikation = qualifikation; }

    @Basic
    @Column(name = "Datum")
    private LocalDate datum;
    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ausschreibung that = (Ausschreibung) o;
        return id == that.id &&
                Objects.equals(titel, that.titel) &&
                Objects.equals(beschreibung, that.beschreibung) &&
                Objects.equals(qualifikation, that.qualifikation) &&
                Objects.equals(datum, that.datum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, beschreibung, qualifikation, datum);
    }
}
