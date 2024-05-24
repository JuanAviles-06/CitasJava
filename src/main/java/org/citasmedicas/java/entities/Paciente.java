package org.citasmedicas.java.entities;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Paciente {

    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoDeIdentificacion tipoDeIdentificacion;
    private Integer numeeroIdentificacion;
    private String correoElectronico;
    private Integer celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private Character factorRH;


}
