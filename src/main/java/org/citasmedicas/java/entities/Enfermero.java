package org.citasmedicas.java.entities;

import java.util.ArrayList;
import java.util.List;

public class Enfermero {
    private String nombre;
    private Integer id ;
    private String especialidad;
    private String horarioTrabajo;
    private Integer telefono;
    private String correo;
    private Integer experencia;
    private boolean disponible;
    private List<Paciente> pacienteAsignados;


    public Enfermero(String nombre, Integer id, String especialidad, String horarioTrabajo, Integer telefono,
            String correo, Integer experencia) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
        this.horarioTrabajo = horarioTrabajo;
        this.telefono = telefono;
        this.correo = correo;
        this.experencia = experencia;
        this.disponible = true;
        this.pacienteAsignados = new ArrayList<>();


    }
    
    



    


}
