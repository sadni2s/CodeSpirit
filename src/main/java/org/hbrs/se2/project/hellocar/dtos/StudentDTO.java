package org.hbrs.se2.project.hellocar.dtos;

import org.hbrs.se2.project.hellocar.entities.Rolle;
import java.util.List;

public interface StudentDTO {
    public int getId();
    public String getStudiengang();
    public String getBeschreibung();
    public String getKontakt();
    public List<RolleDTO> getRoles();

}
