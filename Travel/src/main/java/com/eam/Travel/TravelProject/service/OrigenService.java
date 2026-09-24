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

    public Origen buscarOrigen(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarOrigen'");
    }

    public Origen guardarOrigen(Origen origen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarOrigen'");
    }

    public Origen actualizarOrigen(Long id, Origen origen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarOrigen'");
    }

    public void eliminarOrigen(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarOrigen'");
    }
    
}
