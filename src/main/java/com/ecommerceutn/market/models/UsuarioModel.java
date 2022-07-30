package com.ecommerceutn.market.models;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false )
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "telefono", nullable = true)
    private Long telefono;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "nombre_usuario", nullable = false, unique = true)
    private String nombre_usuario;

    @Column(name = "password", nullable = false)
    private String password;

}
