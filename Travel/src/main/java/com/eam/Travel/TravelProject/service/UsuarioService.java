package com.eam.Travel.TravelProject.service;

import org.springframework.stereotype.Service;
import com.eam.Travel.TravelProject.model.Usuario;
import com.eam.Travel.TravelProject.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

}
