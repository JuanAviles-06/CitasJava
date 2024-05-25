package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedico extends Medico {

    protected Medico medico;
    protected Estado estado;
    protected String motivoConsulta;
    protected LocalDate fecha;
    protected LocalTime hora;
    protected Paciente paciente;


    public CitaMedico(Integer id, String nombre, String apellido, TipoDeIdentificacion tipoIdentificacion,
            Integer numeroIdenticacion, Integer registromedico, Especialidad especialidad, Medico medico, Estado estado,
            String motivoConsulta, LocalDate fecha, LocalTime hora, Paciente paciente) {
        super(id, nombre, apellido, tipoIdentificacion, numeroIdenticacion, registromedico, especialidad);
        this.medico = medico;
        this.estado = estado;
        this.motivoConsulta = motivoConsulta;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
    }


    public Medico getMedico() {
        return medico;
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public String getMotivoConsulta() {
        return motivoConsulta;
    }


    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
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


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    

    

    

   

    //@todo: AGREGAR CONSTRUCTOR GETTERS Y SETTERS
    //       AGREGAR 

}
