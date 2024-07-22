package com.oneToMany.oneToManyDBApiRest.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data//
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    @Basic
    private String fechaEntrada;
    private String fechaSalida;
    private double valor;
    private String formaPago;

}
