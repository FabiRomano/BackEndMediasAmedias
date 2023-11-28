package com.MediasAMedias.MediasAMedias.services;


import com.MediasAMedias.MediasAMedias.models.Medias;
import com.MediasAMedias.MediasAMedias.models.Persona;
import com.MediasAMedias.MediasAMedias.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;


    //trae lista de personas
    public List<Persona> getAllPersona(){
        return personaRepository.findAll();
    }

    //trae persona por id
    public Optional<Persona> getPrsonaById(Long id){
        return personaRepository.findById(id);
    }

    //crea persona
    public Persona createPersona(Persona persona){
        return personaRepository.save(persona);
    }

    //edita la persona por id
     public Persona upDatePersona(Long id, Persona personaDetails){
        Persona persona = personaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Persona not found for id: " + id));
        persona.setName(personaDetails.getName());
        persona.setLastName(personaDetails.getLastName());
        persona.setDireccion(personaDetails.getDireccion());
        persona.setLocalidad(personaDetails.getLocalidad());
        persona.setProvincia(personaDetails.getProvincia());
        persona.setCodigoPostal(personaDetails.getCodigoPostal());
        persona.setEmail(personaDetails.getEmail());
        persona.setWhatsapp(personaDetails.getWhatsapp());
        return personaRepository.save(persona);
    }


    //elimino persona por id
    public void deletePersona(Long id){
        personaRepository.deleteById(id);
    }




}
