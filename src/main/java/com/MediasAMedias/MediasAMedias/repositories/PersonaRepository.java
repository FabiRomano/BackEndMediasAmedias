package com.MediasAMedias.MediasAMedias.repositories;

import com.MediasAMedias.MediasAMedias.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
