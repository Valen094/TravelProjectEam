package com.eam.Travel.TravelProject.model;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Table(name = "origen")
public class Origen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.Column(name = "idorigen")
    private Long idOrigen;

    private String ciudad;
    private String departamento;
    private String pais;

    @OneToMany(mappedBy = "origen", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Viaje> viajes = new ArrayList<>();

}
