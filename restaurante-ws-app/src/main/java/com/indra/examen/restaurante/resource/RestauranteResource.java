package com.indra.examen.restaurante.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestauranteResource {

	@Value(value = "${aplicacion.descripcion.servicio}")
    private String descripcionServicio;
     
    @GetMapping("/")
    public String getDescripcionServicio() {
        return descripcionServicio;
    }
}

