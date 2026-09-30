package com.eam.Travel.TravelProject.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Table(name = "viaje")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.Column(name = "idviaje")
    private Long idViaje;

    private String nombre;
    @jakarta.persistence.Column(name = "fechasalida")
    private LocalDate fechaSalida;
    @jakarta.persistence.Column(name = "fechallegada")
    private LocalDate fechaLlegada;
    private BigDecimal precio;
    private Long cupos;
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idorigen", nullable = false)
    private Origen origen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddestino", nullable = false)
    private Destino destino;

    @OneToMany(mappedBy = "viaje", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Reserva> reservas = new ArrayList<>();

}
