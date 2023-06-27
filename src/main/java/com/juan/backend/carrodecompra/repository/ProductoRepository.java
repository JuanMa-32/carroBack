package com.juan.backend.carrodecompra.repository;

import com.juan.backend.carrodecompra.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {


}
