package com.indra.examen.cliente.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteResource {

	@Value(value = "${aplicacion.descripcion.servicio}")
    private String descripcionServicio;
     
    @GetMapping("/")
    public String getDescripcionServicio() {
        return descripcionServicio;
    }
}
