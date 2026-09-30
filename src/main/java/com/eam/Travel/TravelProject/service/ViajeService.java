package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Viaje;
import com.eam.Travel.TravelProject.repository.ViajeRepository;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service 
public class ViajeService {

        private final ViajeRepository viajeRepository;

    public ViajeService(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    public List<Viaje> listarViaje() {
        return viajeRepository.findAll();
    }

    public Viaje buscarViaje(Long id) {
        return viajeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Viaje no encontrado"));
    }

    public Viaje guardarViaje(Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    public Viaje actualizarViaje(Long id, Viaje viaje) {
        Viaje viajeExistente = buscarViaje(id);
        viajeExistente.setNombre(viaje.getNombre());
        viajeExistente.setFechaSalida(viaje.getFechaSalida());
        viajeExistente.setFechaLlegada(viaje.getFechaLlegada());
        viajeExistente.setPrecio(viaje.getPrecio());
        viajeExistente.setCupos(viaje.getCupos());
        viajeExistente.setEstado(viaje.getEstado());
        viajeExistente.setOrigen(viaje.getOrigen());
        viajeExistente.setDestino(viaje.getDestino());
        return viajeRepository.save(viajeExistente);
    }

    public void eliminarViaje(Long id) {
        if (!viajeRepository.existsById(id)) {
            throw new ResponseStatusException(NOT_FOUND, "Viaje no encontrado");
        }
        viajeRepository.deleteById(id);
    }
    
}
