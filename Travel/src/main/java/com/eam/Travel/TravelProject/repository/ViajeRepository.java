package com.eam.Travel.TravelProject.repository;

import com.eam.Travel.TravelProject.model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

// "Este Repository va a trabajar con objetos viaje y su ID es de tipo Long."
public interface ViajeRepository extends JpaRepository<Viaje, Long> {

}
