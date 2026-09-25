package com.eam.Travel.TravelProject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.eam.Travel.TravelProject.model.Reserva;
import com.eam.Travel.TravelProject.repository.ReservaRepository;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service 
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> listarReserva() {
        return reservaRepository.findAll();
    }

    public List<Reserva> filtrarPorEstado(String estado) {
        if (estado == null || estado.isBlank()) {
            return listarReserva();
        }

        return reservaRepository.findByEstadoIgnoreCase(estado.trim());
    }

    public Reserva buscarReserva(Long id) {
        return reservaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Reserva no encontrada"));
    }

    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva actualizarReserva(Long id, Reserva reserva) {
        Reserva reservaExistente = buscarReserva(id);
        reservaExistente.setFechaReserva(reserva.getFechaReserva());
        reservaExistente.setCantidadPersonas(reserva.getCantidadPersonas());
        reservaExistente.setPrecioTotal(reserva.getPrecioTotal());
        reservaExistente.setEstado(reserva.getEstado());
        reservaExistente.setViaje(reserva.getViaje());
        reservaExistente.setUsuario(reserva.getUsuario());
        return reservaRepository.save(reservaExistente);
    }

    public void eliminarReserva(Long id) {
        if (!reservaRepository.existsById(id)) {
            throw new ResponseStatusException(NOT_FOUND, "Reserva no encontrada");
        }
        reservaRepository.deleteById(id);
    }

}
