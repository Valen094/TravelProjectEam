package com.eam.Travel.TravelProject.service;

import com.eam.Travel.TravelProject.model.Destino;
import com.eam.Travel.TravelProject.repository.DestinoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DestinoService {
    private final DestinoRepository destinoRepository;

    public DestinoService(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository;
    }

    public List<Destino> listarDestinos() {
        return destinoRepository.findAll();
    }

}
