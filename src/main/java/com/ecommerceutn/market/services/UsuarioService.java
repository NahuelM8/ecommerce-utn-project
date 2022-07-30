package com.ecommerceutn.market.services;

import com.ecommerceutn.market.models.UsuarioModel;
import com.ecommerceutn.market.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel cliente) {
        return usuarioRepository.save(cliente);
    }

    public Optional<UsuarioModel> obtenerUsuario(Long id) {
        return usuarioRepository.findById(id);
    }
}
