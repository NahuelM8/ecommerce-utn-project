package com.ecommerceutn.market.controllers;


import com.ecommerceutn.market.models.ProductoModel;
import com.ecommerceutn.market.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public ArrayList<ProductoModel> obtenerProductos() {
        return productoService.obtenerProductos();
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") Long id) {
        return productoService.obtenerProductoPorId(id);
    }

    @PostMapping
    public ProductoModel guardarProducto(ProductoModel producto) {
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProducto(@PathVariable("id") Long id) {
        Boolean seElimino = productoService.eliminarProducto(id);
        if (seElimino) {
            return "Se ha eliminado el producto de id " + id;
        } else {
            return "No se ha podido eliminar el producto";
        }
    }
}
