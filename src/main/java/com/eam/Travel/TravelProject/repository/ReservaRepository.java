package com.eam.Travel.TravelProject.repository;

import com.eam.Travel.TravelProject.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	List<Reserva> findByEstadoIgnoreCase(String estado);
}
