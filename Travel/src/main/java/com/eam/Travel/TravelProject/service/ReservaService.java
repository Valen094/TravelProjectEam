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

    public Reserva buscarReserva(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarReserva'");
    }

    public Reserva guardarReserva(Reserva reserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarReserva'");
    }

    public Reserva actualizarReserva(Long id, Reserva destino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarReserva'");
    }

    public void eliminarReserva(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarReserva'");
    }

}
