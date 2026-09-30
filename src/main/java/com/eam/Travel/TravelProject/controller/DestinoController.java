package com.eam.Travel.TravelProject.controller;

import com.eam.Travel.TravelProject.model.Destino;
import com.eam.Travel.TravelProject.service.DestinoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    private final DestinoService destinoService;

    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping
    public List<Destino> listarDestinos() {
        return destinoService.listarDestinos();
    }

    @GetMapping("/{id}")
    public Destino buscarDestino(@PathVariable Long id) {
        return destinoService.buscarDestino(id);
    }

    @PostMapping
    public Destino guardarDestino(@RequestBody Destino destino) {
        return destinoService.guardarDestino(destino);
    }

        // Actualizar un destino
    @PutMapping("/{id}")
    public Destino actualizarDestino(
            @PathVariable Long id,
            @RequestBody Destino destino) {

        return destinoService.actualizarDestino(id, destino);
    }

    // Eliminar un destino
    @DeleteMapping("/{id}")
    public void eliminarDestino(@PathVariable Long id) {
        destinoService.eliminarDestino(id);
    }
}