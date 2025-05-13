package org.hbrs.se2.project.hellocar.dtos;

import java.time.LocalDate;

public interface AusschreibungDTO {
    int getId();
    String getTitel();
    String getBeschreibung();
    String getQualifikation();
    LocalDate getDatum();
}
