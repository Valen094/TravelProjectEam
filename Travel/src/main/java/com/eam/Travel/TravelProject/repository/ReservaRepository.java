package com.eam.Travel.TravelProject.repository;

import com.eam.Travel.TravelProject.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

// "Este Repository va a trabajar con objetos reserva y su ID es de tipo Long."
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
