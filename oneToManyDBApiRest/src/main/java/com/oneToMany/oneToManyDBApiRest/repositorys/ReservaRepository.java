package com.oneToMany.oneToManyDBApiRest.repositorys;

import com.oneToMany.oneToManyDBApiRest.models.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {

}
