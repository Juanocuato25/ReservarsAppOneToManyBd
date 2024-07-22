package com.oneToMany.oneToManyDBApiRest.services;

import com.oneToMany.oneToManyDBApiRest.models.Huesped;
import com.oneToMany.oneToManyDBApiRest.models.Reserva;
import com.oneToMany.oneToManyDBApiRest.repositorys.HuespedRepository;
import com.oneToMany.oneToManyDBApiRest.repositorys.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired//Nos inyecta nuestro huesped repository
    ReservaRepository reservaRepository;

    public List<Reserva> getAllReserva(){
        return reservaRepository.findAll();
    }

    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public Reserva UpdateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(Long idReserva){
        reservaRepository.deleteById(idReserva);
    }
}
