package com.oneToMany.oneToManyDBApiRest.services;


import com.oneToMany.oneToManyDBApiRest.models.Huesped;
import com.oneToMany.oneToManyDBApiRest.repositorys.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    @Autowired//Nos inyecta nuestro huesped repository
    HuespedRepository huespedRepository;

    public List<Huesped> getAllHuesped(){
       return huespedRepository.findAll();
    }

    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    public void deleteHuesped(Long idHuesped){
        huespedRepository.deleteById(idHuesped);
    }
}
