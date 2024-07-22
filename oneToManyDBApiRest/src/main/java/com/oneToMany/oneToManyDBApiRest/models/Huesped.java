package com.oneToMany.oneToManyDBApiRest.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity//Define la clase como una entindad
@Data//Define clase como flujo de informacion
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHuesped;
    @Basic
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL)//Si se elimina un huesped se elimina todas las reservas asociadas de el
    private List<Reserva> reservas = new ArrayList<>();


}
