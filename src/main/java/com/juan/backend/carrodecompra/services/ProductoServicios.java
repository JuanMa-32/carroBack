package com.juan.backend.carrodecompra.services;

import com.juan.backend.carrodecompra.entidades.Producto;

import java.util.List;

public interface ProductoServicios {
    List<Producto> findAll();
}
