package com.ecommerceutn.market.models;


import javax.persistence.Entity;
import javax.persistence.*;
import java.util.*;

@Entity(name = "usuarios")
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

    @OneToMany
    @JoinColumn(name = "productos_comprados")
    private List<ProductoModel> productosComprados;

    @OneToMany
    @JoinColumn(name = "carrito_compra")
    private List<ProductoModel> carritoCompra;

    public UsuarioModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
