package com.oneToMany.oneToManyDBApiRest.controllers;


import com.oneToMany.oneToManyDBApiRest.models.Huesped;
import com.oneToMany.oneToManyDBApiRest.services.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/huespedes")
public class HuespedController {

    @Autowired
    HuespedService huespedService;

    @GetMapping
    public List<Huesped> getAllHuesped(){
        return huespedService.getAllHuesped();
    }

    @PostMapping
    public Huesped createHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    @PutMapping
    public Huesped updateHuesped(@RequestBody Huesped huesped){
        return huespedService.updateHuesped(huesped);
    }

    @DeleteMapping("/{idHuesped}")
    public void deleteHuesped(@PathVariable Long idHuesped){
        huespedService.deleteHuesped(idHuesped);
    }
}
