package com.ecommerceutn.market.controllers;


import com.ecommerceutn.market.models.ProductoModel;
import com.ecommerceutn.market.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public ProductoModel guardarProducto(ProductoModel producto, @RequestParam("archivo") MultipartFile imagen) {

        if(!imagen.isEmpty()) {
            String nombreImagen = imagen.getOriginalFilename();
            Path rutaImagen = Paths.get("//src//main//resources//static/images").resolve(nombreImagen).toAbsolutePath();

            try {
                Files.copy(imagen.getInputStream(), rutaImagen);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            producto.setImagenProducto(nombreImagen);
        }

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
