package com.eam.Travel.TravelProject.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.eam.Travel.TravelProject.model.Destino;
import com.eam.Travel.TravelProject.model.Origen;

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
public class ViajeDTO {

	private Long id;
	private String nombre;
	private Origen origen;
	private Destino destino;
	private Long duracion;
	private BigDecimal precio;
	private LocalDate fechaSalida;
	private LocalDate fechaLlegada;
	private Long cupos;
	private String estado;
	private String descripcion;
}
