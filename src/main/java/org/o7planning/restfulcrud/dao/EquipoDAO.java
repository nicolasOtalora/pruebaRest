/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this teqlate file, choose Tools | Teqlates
 * and open the teqlate in the editor.
 */
package org.o7planning.restfulcrud.dao;

/**
 *
 * @author brown
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.Equipo;

public class EquipoDAO {
    
    
    
    
    private static final Map<String, Equipo> eqMap = new HashMap<String, Equipo>();
 
    static {
        initEquipos();
    }
    
    private static void initEquipos() {
        Equipo eq = new Equipo("1","Super equipo");
        Equipo eq2 = new Equipo("2","Equipo aburrido");
 
        eqMap.put(eq.getId(), eq);
        eqMap.put(eq2.getId(), eq2);
    }
 
    public static Equipo getEquipo(String eqNo) {
        return eqMap.get(eqNo);
    }
 
    public static Equipo addEquipo(Equipo eq) {
        eqMap.put(eq.getId(), eq);
        return eq;
    }
 
    public static Equipo updateEquipo(Equipo eq) {
        eqMap.put(eq.getId(), eq);
        return eq;
    }
 
    public static void deleteEquipo(String eqNo) {
        eqMap.remove(eqNo);
    }
 
    public static List<Equipo> getAllEquipos() {
        Collection<Equipo> c = eqMap.values();
        List<Equipo> list = new ArrayList<Equipo>();
        list.addAll(c);
        return list;
    }
     
    List<Equipo> list;
 
    
}
