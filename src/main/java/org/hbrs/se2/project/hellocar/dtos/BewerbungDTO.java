package org.hbrs.se2.project.hellocar.dtos;

import java.time.LocalDate;

public interface BewerbungDTO {
    int getId();
    String getBewerbungstext();
    String getStatus();
    LocalDate getBewerbungsdatum();
}
