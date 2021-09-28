
package com.example.ejemplohiberus.controllers;

import com.example.ejemplohiberus.entities.Persona;
import com.example.ejemplohiberus.repositories.PersonaRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarController {

    @Autowired
    private PersonaRepository repo;
    
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola mundo";
    }
    @GetMapping("/add")
    public List<Persona> anadir(){
        Persona p = new Persona();
        p.setNombre(UUID.randomUUID().toString());
        repo.save(p);
        return repo.findAll();
    }
            
}
