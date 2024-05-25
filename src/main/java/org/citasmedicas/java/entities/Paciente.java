package org.citasmedicas.java.entities;
import java.time.LocalDate;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
public class Paciente extends Usuario {

    
    protected String correoElectronico;
    protected Integer celular;
    protected LocalDate fechaNacimiento;
    protected Double altura;
    protected Double peso;
    protected TipoSangre tipoSangre;
    protected Character factorRH;
    public Paciente(Integer id, String nombre, String apellido, TipoDeIdentificacion tipoIdentificacion,
            Integer numeroIdenticacion, String correoElectronico, Integer celular, LocalDate fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, Character factorRH) {
        super(id, nombre, apellido, tipoIdentificacion, numeroIdenticacion);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }


    

    }
    


