package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Origen;
import com.eam.Travel.TravelProject.repository.OrigenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrigenService {

        private final OrigenRepository origenRepository;

    public OrigenService(OrigenRepository origenRepository) {
        this.origenRepository = origenRepository;
    }

    public List<Origen> listarOrigen() {
        return origenRepository.findAll();
    }
    
}
