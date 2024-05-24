package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.Month;

public class Prueba {

    public static void main(String[] args) {

        //instaciar medico por defecto
        Medico m = new Medico();
        //asignar el id al medico: utiliza el set
        m.setId(1);
        //imprimir el id del medico : utilizo el  getId
        System.out.println(m.getId());

        //crear paciente.
        Paciente p1 = new Paciente(1, "Camilo", "Corredor", TipoDeIdentificacion.TARJETA_IDENTIDAD, 15585213, "ccabana@gmail.com", 300000000, LocalDate.of(2003, Month.JANUARY, 5), 1.85, 80.0, TipoSangre.A, '-');

        //uitilizar los get y set de lomblok
        System.out.println("nombre:"+ p1.getNombres()+ ", Apellidos:"+p1.getApellidos());
        
        //crear un consultorio
        Consultorio c1 = new Consultorio(1, "cra 15 # 23 sur", 412);
        System.out.println(c1.getId()+", direccion:"+ c1.getDireccion()+", numero de consultorio:"+ c1.getNumero());
        
        // crear cita 

        Cita ct1 = new Cita(1, LocalDate.of(2024, Month.OCTOBER, 24), m,p1,c1);
        System.out.println("id cita : "+ ct1.getId() +", id paciente : "+ p1.getId() + ", id medico : " + m.getId()+", id consultorio : " + c1.getId() + ",fecha de la cita : " + ct1.getFecha());



        
    }
}
