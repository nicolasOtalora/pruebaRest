/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this teqlate file, choose Tools | Teqlates
 * and open the teqlate in the editor.
 */
package com.mkyong.rest;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.dao.EquipoDAO;
import org.o7planning.restfulcrud.model.Equipo;

/**
 *
 * @author brown
 */
@Path("/equipos")
public class EquipoService {
    
    
    
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Equipo> getEquipos_JSON() {
        List<Equipo> listOfCountries = EquipoDAO.getAllEquipos();
        return listOfCountries;
    }
 
    // URI:
    // /contextPath/servletPath/eqloyees/{eqNo}
    @GET
    @Path("/{eqNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo getEquipo(@PathParam("eqNo") String eqNo) {
        return EquipoDAO.getEquipo(eqNo);
    }
 
    // URI:
    // /contextPath/servletPath/equipos
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo addEquipo(Equipo eq) {
        return EquipoDAO.addEquipo(eq);
    }
 
    // URI:
    // /contextPath/servletPath/equipos
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo updateEquipo(Equipo eq) {
        return EquipoDAO.updateEquipo(eq);
    }
 
    @DELETE
    @Path("/{eqNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEquipo(@PathParam("eqNo") String eqNo) {
        EquipoDAO.deleteEquipo(eqNo);
    }
    
    
}
