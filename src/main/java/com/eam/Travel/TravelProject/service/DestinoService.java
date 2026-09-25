package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Destino;
import com.eam.Travel.TravelProject.repository.DestinoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service

public class DestinoService {
    private final DestinoRepository destinoRepository;

    public DestinoService(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository;
    }

    public List<Destino> listarDestinos() {
        return destinoRepository.findAll();
    }

    public Destino buscarDestino(Long id) {
        return destinoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Destino no encontrado"));
    }

    public Destino guardarDestino(Destino destino) {
        return destinoRepository.save(destino);
    }

    public Destino actualizarDestino(Long id, Destino destino) {
        Destino destinoExistente = buscarDestino(id);
        destinoExistente.setCiudad(destino.getCiudad());
        destinoExistente.setDepartamento(destino.getDepartamento());
        destinoExistente.setPais(destino.getPais());
        return destinoRepository.save(destinoExistente);
    }

    public void eliminarDestino(Long id) {
        if (!destinoRepository.existsById(id)) {
            throw new ResponseStatusException(NOT_FOUND, "Destino no encontrado");
        }
        destinoRepository.deleteById(id);
    }

}
