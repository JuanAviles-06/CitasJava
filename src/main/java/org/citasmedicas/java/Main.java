package org.citasmedicas.java;
import org.citasmedicas.java.entities.Especialidad;
import org.citasmedicas.java.entities.Medico;
import org.citasmedicas.java.entities.TipoDeIdentificacion;
import org.citasmedicas.java.entities.Medico.*;


public class Main {
    public static void main(String[] args) {
        //instaciar(crea objeto) medico
       /*  Medico m = new Medico(1, "carlos", "savedra", TipoDeIdentificacion.CEDULA_CIUDADANIA, 2154813, 55845, Especialidad.ONCOLOGIA);
        //imprimir la instanciade medico*/
        Medico m = new Medico();
        
        System.out.println(m);

    }
}