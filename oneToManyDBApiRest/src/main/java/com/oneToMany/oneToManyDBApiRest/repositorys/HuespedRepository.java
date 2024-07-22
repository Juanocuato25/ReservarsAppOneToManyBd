package com.oneToMany.oneToManyDBApiRest.repositorys;

import com.oneToMany.oneToManyDBApiRest.models.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HuespedRepository extends JpaRepository<Huesped, Long> {
}
