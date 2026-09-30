package com.eam.Travel.TravelProject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.eam.Travel.TravelProject.model.Usuario;
import com.eam.Travel.TravelProject.repository.UsuarioRepository;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Usuario no encontrado"));
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        Usuario usuarioExistente = buscarUsuario(id);
        usuarioExistente.setNombre(usuario.getNombre());
        usuarioExistente.setApellido(usuario.getApellido());
        usuarioExistente.setCorreo(usuario.getCorreo());
        usuarioExistente.setTelefono(usuario.getTelefono());
        usuarioExistente.setRol(usuario.getRol());
        usuarioExistente.setPassword(usuario.getPassword());
        return usuarioRepository.save(usuarioExistente);
    }

    public void eliminarUsuario(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new ResponseStatusException(NOT_FOUND, "Usuario no encontrado");
        }
        usuarioRepository.deleteById(id);
    }

}
