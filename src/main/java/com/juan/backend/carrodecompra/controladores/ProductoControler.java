package com.juan.backend.carrodecompra.controladores;

import com.juan.backend.carrodecompra.entidades.Producto;
import com.juan.backend.carrodecompra.services.ProductoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/productos")
public class ProductoControler {

    @Autowired
    private ProductoServicios servicio;

    @GetMapping("/all")
    public List<Producto> findAll(){
        return servicio.findAll();
    }

}
