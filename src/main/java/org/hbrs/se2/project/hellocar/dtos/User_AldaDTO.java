package org.hbrs.se2.project.hellocar.dtos;

import java.util.List;

public interface User_AldaDTO {
    public int getId();
    public String getFirstName();
    public String getLastName();
    public List<RolleDTO> getRoles();
}
