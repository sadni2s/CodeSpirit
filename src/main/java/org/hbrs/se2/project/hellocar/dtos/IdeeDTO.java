package org.hbrs.se2.project.hellocar.dtos;

import java.time.LocalDate;

public interface IdeeDTO {
    int getId();
    String getTitel();
    String getProblemstellung();
    String getVision();
    String getBeschreibung();
    LocalDate getErstellungsdatum();
    String getStatus();
}
