package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaEnfermero extends Enfermero{

    protected Enfermero enfermero;
    protected String procedimientoarelizar;
    protected LocalDate fecha;
    protected LocalTime hora;


    public CitaEnfermero(String nombre, Integer id, String especialidad, String horarioTrabajo, Integer telefono,
            String correo, Integer experencia, Enfermero enfermero, String procedimientoarelizar, LocalDate fecha,
            LocalTime hora) {
        super(nombre, id, especialidad, horarioTrabajo, telefono, correo, experencia);
        this.enfermero = enfermero;
        this.procedimientoarelizar = procedimientoarelizar;
        this.fecha = fecha;
        this.hora = hora;
    }


    public Enfermero getEnfermero() {
        return enfermero;
    }


    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }


    public String getProcedimientoarelizar() {
        return procedimientoarelizar;
    }


    public void setProcedimientoarelizar(String procedimientoarelizar) {
        this.procedimientoarelizar = procedimientoarelizar;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public LocalTime getHora() {
        return hora;
    }


    public void setHora(LocalTime hora) {
        this.hora = hora;
    }


    

    
   




    

}
