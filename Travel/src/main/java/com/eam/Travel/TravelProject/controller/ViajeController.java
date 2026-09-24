package com.eam.Travel.TravelProject.controller;

import com.eam.Travel.TravelProject.model.Viaje;
import com.eam.Travel.TravelProject.service.ViajeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viaje")
public class ViajeController {

    private final ViajeService viajeService;

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;

    }

    //  Consultar un viaje
    @GetMapping
    public List<Viaje> listarViajes() {
        return viajeService.listarViaje();
    }

    // Buscar un viaje
    @GetMapping("/{id}")
    public Viaje buscarViaje(@PathVariable Long id) {
        return viajeService.buscarViaje(id);
    }

    // Guardar un viaje
    @PostMapping
    public Viaje guardarViaje(@RequestBody Viaje viaje) {
        return viajeService.guardarViaje(viaje);
    }

    // Actualizar un viaje
    @PutMapping("/{id}")
    public Viaje actualizarViaje(
            @PathVariable Long id,
            @RequestBody Viaje destino) {

        return viajeService.actualizarViaje(id, destino);
    }

    // Eliminar un viaje
    @DeleteMapping("/{id}")
    public void eliminarViaje(@PathVariable Long id) {
        viajeService.eliminarViaje(id);
    }

}
