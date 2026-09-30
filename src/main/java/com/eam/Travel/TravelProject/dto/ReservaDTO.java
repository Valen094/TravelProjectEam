package com.eam.Travel.TravelProject.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;   
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ReservaDTO {
    private Long idReserva;
    private LocalDate fechaReserva;
    private Long cantidadPersonas;
    private BigDecimal precioTotal;
    private String estado;
    private Long idUsuario;
    private Long idViaje;
}
