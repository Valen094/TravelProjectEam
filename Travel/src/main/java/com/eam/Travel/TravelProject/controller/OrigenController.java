package com.eam.Travel.TravelProject.controller;

import com.eam.Travel.TravelProject.model.Origen;
import com.eam.Travel.TravelProject.service.OrigenService;
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
@RequestMapping ("/origen")
public class OrigenController {
    
    private final OrigenService origenService;
    
    public OrigenController(OrigenService origenservice){
        this.origenService = origenservice;
    }

    // LISTAR TODOS
    @GetMapping
    public List<Origen> listarOrigenes() {
        return origenService.listarOrigen();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Origen buscarOrigen(@PathVariable Long id) {
        return origenService.buscarOrigen(id);
    }

    // CREAR
    @PostMapping
    public Origen guardarOrigen(@RequestBody Origen origen) {
        return origenService.guardarOrigen(origen);
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Origen actualizarOrigen(
            @PathVariable Long id,
            @RequestBody Origen origen) {

        return origenService.actualizarOrigen(id, origen);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminarOrigen(@PathVariable Long id) {
        origenService.eliminarOrigen(id);
    }
}
