package org.hbrs.se2.project.hellocar.dao;

import org.hbrs.se2.project.hellocar.dtos.RolleDTO;
import org.hbrs.se2.project.hellocar.dtos.impl.RolleDTOImpl;
import org.hbrs.se2.project.hellocar.dtos.User_AldaDTO;
import org.hbrs.se2.project.hellocar.services.db.JDBCConnection;
import org.hbrs.se2.project.hellocar.services.db.exceptions.DatabaseLayerException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Bereitstellung einer Schnittstelle für den Zugriff auf Rollen in der Datenbank
 * Realisierung einer CRUD-Schnittstelle (hier: nur Read (get...)) --> SE-2
 *
 */
public class RolleDAO {
    public List<RolleDTO> getRolesOfUser(User_AldaDTO userDTO ) throws DatabaseLayerException {
        ResultSet set = null;

        try {
            Statement statement = null;
            try {
                statement = JDBCConnection.getInstance().getStatement();
            } catch (DatabaseLayerException e) {
                e.printStackTrace();
            }

            set = statement.executeQuery(
                    "SELECT * "
                       + "FROM carlook.user_to_rolle "
                       + "WHERE carlook.user_to_rolle.userid = \'" + userDTO.getId() + "\'" );

        } catch (SQLException ex) {

            throw new DatabaseLayerException("Fehler im SQL-Befehl! Bitte den Programmierer:in benachrichtigen!");
        }

        if ( set == null ) return null;

        List<RolleDTO> liste = new ArrayList<RolleDTO>();
        RolleDTOImpl role = null;

        try {
            while (set.next() ){

                role = new RolleDTOImpl();
                // Object Relation Mapping (ORM)
                role.setBezeichnung(set.getString("bezeichnung") );
                liste.add(role);

            }
        } catch (SQLException ex) {
            throw new DatabaseLayerException("Fehler im SQL-Befehl! Bitte den Programmierer:in benachrichtigen!");
        }
        return liste;

    }
}
