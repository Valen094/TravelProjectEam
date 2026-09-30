package com.eam.Travel.TravelProject.repository;

import com.eam.Travel.TravelProject.model.Destino;
import org.springframework.data.jpa.repository.JpaRepository;

// "Este Repository va a trabajar con objetos Destino y su ID es de tipo Long."
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}
