package com.eam.Travel.TravelProject.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.FetchType;
import java.util.List;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Origen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrigen;

    private String ciudad;
    private String departamento;
    private String pais;

    @OneToMany(mappedBy = "origen", fetch = FetchType.LAZY)
    private List<Viaje> viajes = new ArrayList<>();

}
