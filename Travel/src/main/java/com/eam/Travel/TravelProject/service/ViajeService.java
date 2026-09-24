package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Reserva;
import com.eam.Travel.TravelProject.model.Viaje;
import com.eam.Travel.TravelProject.repository.ReservaRepository;
import com.eam.Travel.TravelProject.repository.ViajeRepository;

import java.util.List;

public class ViajeService {

        private final ViajeRepository viajeRepository;

    public ViajeService(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    public List<Viaje> listarViaje() {
        return viajeRepository.findAll();
    }
    
}
