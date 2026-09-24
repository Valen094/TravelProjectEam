package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Viaje;
import com.eam.Travel.TravelProject.repository.ViajeRepository;

import java.util.List;
import org.springframework.stereotype.Service;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarViaje'");
    }

    public Viaje guardarViaje(Viaje viaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarViaje'");
    }

    public Viaje actualizarViaje(Long id, Viaje destino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarViaje'");
    }

    public void eliminarViaje(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarViaje'");
    }
    
}
