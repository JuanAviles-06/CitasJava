package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Medico extends Usuario{

    //el modificador de acceso se pone antes del tipo de dato del atributo ninguno =defolt
    //se recomienda para implementar encapsulamiento ue TODOS los atributos de una clase sean private 
    protected Integer registromedico;
    protected Especialidad especialidad;
    
    
        
    public Medico(Integer id, String nombre, String apellido, TipoDeIdentificacion tipoIdentificacion,
            Integer numeroIdenticacion, Integer registromedico, Especialidad especialidad) {
            super(id, nombre, apellido, tipoIdentificacion, numeroIdenticacion);
            this.registromedico = registromedico;
            this.especialidad = especialidad;
    }
      
       
}
