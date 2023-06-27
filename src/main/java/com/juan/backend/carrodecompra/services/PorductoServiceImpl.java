package com.juan.backend.carrodecompra.services;

import com.juan.backend.carrodecompra.entidades.Producto;
import com.juan.backend.carrodecompra.repository.ProductoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PorductoServiceImpl implements ProductoServicios{

    @Autowired
    private ProductoRepository productoRepo;
    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }
}
