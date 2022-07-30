package com.ecommerceutn.market.controllers;

import com.ecommerceutn.market.models.UsuarioModel;
import com.ecommerceutn.market.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path="/api/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return usuarioService.obtenerUsuario(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id) {
        Boolean seElimino = usuarioService.eliminarUsuario(id);
        if (seElimino) {
            return "Se ha eliminado el usuario de id " + id;
        } else {
            return "No se ha podido eliminar el usuario";
        }
    }


}
