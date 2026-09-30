package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Origen;
import com.eam.Travel.TravelProject.repository.OrigenRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

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
        return origenRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Origen no encontrado"));
    }

    public Origen guardarOrigen(Origen origen) {
        return origenRepository.save(origen);
    }

    public Origen actualizarOrigen(Long id, Origen origen) {
        Origen origenExistente = buscarOrigen(id);
        origenExistente.setCiudad(origen.getCiudad());
        origenExistente.setDepartamento(origen.getDepartamento());
        origenExistente.setPais(origen.getPais());
        return origenRepository.save(origenExistente);
    }

    public void eliminarOrigen(Long id) {
        if (!origenRepository.existsById(id)) {
            throw new ResponseStatusException(NOT_FOUND, "Origen no encontrado");
        }
        origenRepository.deleteById(id);
    }
    
}
