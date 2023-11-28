package com.MediasAMedias.MediasAMedias.repositories;

import com.MediasAMedias.MediasAMedias.models.Medias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MediasRepository extends JpaRepository<Medias, Long> {
}
