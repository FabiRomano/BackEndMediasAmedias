package com.MediasAMedias.MediasAMedias.controllers;


import com.MediasAMedias.MediasAMedias.models.Persona;
import com.MediasAMedias.MediasAMedias.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    //crea persona
    @PostMapping("/create")
    public Persona createPersona(@RequestBody Persona persona){
        return personaService.createPersona(persona);
    }

    //trae lista de personas
    @GetMapping("/all")
    public List<Persona> getAllPersona(){
        return personaService.getAllPersona();
    }

    //busco persona por id
    @GetMapping("/{id}")
    public Optional<Persona> getPersonaById(@PathVariable Long id) {
        return personaService.getPrsonaById(id);
    }

    //edito persona por id
    @PutMapping("/{id}")
    public Persona upDatePersona(@PathVariable Long id, @RequestBody Persona persona){
        return personaService.upDatePersona(id, persona);
    }


    //elimino persona por id
    @DeleteMapping("/{id}")
    public void deletePersona (@PathVariable Long id){
        personaService.deletePersona(id);
    }



}
