package com.ecommerceutn.market.models;

import javax.persistence.*;

@Entity(name = "productos")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "nombre", unique = true)
    private String nombre;

    @Column(name = "cantidad_disponible", nullable = false)
    private Integer cantidad_disponible;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name="precio", nullable = false)
    private Integer precio;

    @ManyToOne()
    @JoinColumn(name = "vendedor")
    private UsuarioModel vendedorAsociado;

    public ProductoModel() {

    }

    public UsuarioModel getVendedorAsociado() {
        return vendedorAsociado;
    }

    public void setVendedorAsociado(UsuarioModel vendedorAsociado) {
        this.vendedorAsociado = vendedorAsociado;
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

    public Integer getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(Integer cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}
