package org.citasmedicas.java.entities;

public class Medico {

    //el modificador de acceso se pone antes del tipo de dato del atributo ninguno =defolt
    //se recomienda para implementar encapsulamiento ue TODOS los atributos de una clase sean private 
    private Integer id;
    private String nombre;
    private String apellido;
    private TipoDeIdentificacion tipoIdentificacion;
    private Integer numeroIdenticacion;
    private Integer registromedico;
    private Especialidad especialidad;
    
    public Medico() {
    }

    public Medico(Integer id, String nombre, String apellido, TipoDeIdentificacion tipoIdentificacion,
            Integer numeroIdenticacion, Integer registromedico, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdenticacion = numeroIdenticacion;
        this.registromedico = registromedico;
        this.especialidad = especialidad;
    }

    //set para id
    //get y set deben ser publicos
    //set no retorna valor
    //parametro: valor a asignar al atributo:
    //           valor que debe se tipo de dato del atributo
    public void setId( Integer id){
        //asignacion del valor a atributo de izquierda a derecha
        this.id = id;

    }

    //get: si retorna un  valor de l tipo de dato del atributo
    // los get  no tienen parametros
    public Integer getId(){
        //retorna el avalor del atributo
        return this.id;
    }

        

   


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Medico [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoIdentificacion="
                + tipoIdentificacion + ", numeroIdenticacion=" + numeroIdenticacion + ", registromedico="
                + registromedico + ", especialidad=" + especialidad + "]";
    }


    

}
