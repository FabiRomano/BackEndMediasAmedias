package com.MediasAMedias.MediasAMedias.repositories;

import com.MediasAMedias.MediasAMedias.models.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
