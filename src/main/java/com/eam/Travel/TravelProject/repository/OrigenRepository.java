package com.eam.Travel.TravelProject.repository;

import com.eam.Travel.TravelProject.model.Origen;
import org.springframework.data.jpa.repository.JpaRepository;

// "Este Repository va a trabajar con objetos origen y su ID es de tipo Long."
public interface OrigenRepository extends JpaRepository<Origen, Long> {

}
