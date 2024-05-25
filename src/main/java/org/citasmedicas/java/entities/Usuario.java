package org.citasmedicas.java.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter


public abstract class Usuario {

    //de una clase abstracta no se pueden crear objetos 
    //no se puede instanciar
    //ej: usuario u = new usuario: no se puede hacer 
    
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected TipoDeIdentificacion tipoIdentificacion;
    protected Integer numeroIdenticacion;
    
    public Usuario(Integer id, String nombre, String apellido, TipoDeIdentificacion tipoIdentificacion,
            Integer numeroIdenticacion){
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.tipoIdentificacion = tipoIdentificacion;
            this.numeroIdenticacion = numeroIdenticacion;

           
    }


    
}
