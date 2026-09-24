package com.eam.Travel.TravelProject.service;

import org.springframework.stereotype.Service;
import com.eam.Travel.TravelProject.model.Reserva;
import com.eam.Travel.TravelProject.repository.ReservaRepository;

import java.util.List;

@Service 
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> listarReserva() {
        return reservaRepository.findAll();
    }

}
