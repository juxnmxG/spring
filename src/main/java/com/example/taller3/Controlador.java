package com.example.taller3;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})

public class Controlador {

    @Autowired
    PersonaService service;

    public List<persona> listar() {

        return service.listar();

    }

}
