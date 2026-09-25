package com.eam.Travel.TravelProject.repository;

import com.eam.Travel.TravelProject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

// "Este Repository va a trabajar con objetos usuario y su ID es de tipo Long."
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
