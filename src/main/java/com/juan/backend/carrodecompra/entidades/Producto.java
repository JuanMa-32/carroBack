package com.juan.backend.carrodecompra.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="productos")//Esta anotacion sirve para indicar a la tabla en la base de datos a la cual la clase se va a mapear
@Getter @Setter
@NoArgsConstructor//generador de constructor vacio
@AllArgsConstructor//geenrador de constructor con parametros
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String descripcion;
    private Long precio;

}
