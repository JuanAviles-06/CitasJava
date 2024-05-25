package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




public class Cita {


    private Integer id;
    private LocalDate fecha;
    

    
    protected Paciente p1;

    protected LocalTime hora;

    public Cita(Integer id, LocalDate fecha, Paciente p1, LocalTime hora) {
        this.id = id;
        this.fecha = fecha;
        this.p1 = p1;
        this.hora = hora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Paciente getP1() {
        return p1;
    }

    public void setP1(Paciente p1) {
        this.p1 = p1;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    





    
}

    



