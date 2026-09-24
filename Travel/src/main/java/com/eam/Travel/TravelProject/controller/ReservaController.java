package com.eam.Travel.TravelProject.controller;

import com.eam.Travel.TravelProject.model.Reserva;
import com.eam.Travel.TravelProject.service.ReservaService;

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
@RequestMapping("/reserva")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;

    }

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarReserva();
    }

    @GetMapping("/{id}")
    public Reserva buscarReserva(@PathVariable Long id) {
        return reservaService.buscarReserva(id);
    }

    @PostMapping
    public Reserva guardarReserva(@RequestBody Reserva reserva) {
        return reservaService.guardarReserva(reserva);
    }

    @PutMapping("/{id}")
    public Reserva actualizarReserva(
            @PathVariable Long id,
            @RequestBody Reserva destino) {

        return reservaService.actualizarReserva(id, destino);
    }

    // Eliminar un destino
    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
    }

}
