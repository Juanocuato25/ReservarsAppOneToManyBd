package com.oneToMany.oneToManyDBApiRest.controllers;

import com.oneToMany.oneToManyDBApiRest.models.Huesped;
import com.oneToMany.oneToManyDBApiRest.models.Reserva;
import com.oneToMany.oneToManyDBApiRest.services.HuespedService;
import com.oneToMany.oneToManyDBApiRest.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReservaController {

    @Autowired
    ReservaService reservaService;


    @GetMapping
    public List<Reserva> getAllReserva(){
        return reservaService.getAllReserva();
    }

    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva){
        return reservaService.UpdateReserva(reserva);
    }

    @PutMapping
    public Reserva updateHuesped(@RequestBody Reserva reserva){
        return reservaService.UpdateReserva(reserva);
    }

    @DeleteMapping("/{idReserva}")
    public void deleteReserva(@PathVariable Long idReserva){
        reservaService.deleteReserva(idReserva);
    }
}
