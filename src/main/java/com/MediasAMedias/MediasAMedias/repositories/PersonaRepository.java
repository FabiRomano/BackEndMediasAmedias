package com.MediasAMedias.MediasAMedias.repositories;

import com.MediasAMedias.MediasAMedias.models.Pedidos;
import com.MediasAMedias.MediasAMedias.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    boolean existsByEmail(String email);
}
