package com.ecommerceutn.market.services;

import com.ecommerceutn.market.models.ProductoModel;
import com.ecommerceutn.market.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProductos() {
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public Optional<ProductoModel> obtenerProducto(Long id) {
        return productoRepository.findById(id);
    }


}
