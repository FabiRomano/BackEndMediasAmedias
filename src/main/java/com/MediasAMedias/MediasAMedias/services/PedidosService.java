package com.MediasAMedias.MediasAMedias.services;


import com.MediasAMedias.MediasAMedias.models.Medias;
import com.MediasAMedias.MediasAMedias.models.Pedidos;
import com.MediasAMedias.MediasAMedias.models.Persona;
import com.MediasAMedias.MediasAMedias.repositories.MediasRepository;
import com.MediasAMedias.MediasAMedias.repositories.PedidosRepository;
import com.MediasAMedias.MediasAMedias.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosService {
    @Autowired
    private PedidosRepository pedidosRepository;
    private PersonaRepository personaRepository;
    private MediasRepository mediasRepository;



    //crea pedido
    public Pedidos createPedidos(Pedidos pedidos){
        return pedidosRepository.save(pedidos);
    }


      //trae lista de pedidos
    public List<Pedidos> getAllPedidos(){
       return pedidosRepository.findAll();
    }

    //trae pedido por id
    public Optional<Pedidos> getPedidoById(Long id){
      return   pedidosRepository.findById(id);
    }


    //edita pedido por id
    public Pedidos updatePedido(Long id, Pedidos pedidosDetails) {
        Pedidos pedidos = pedidosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido not found for id: " + id));
        pedidos.setCliente(pedidosDetails.getCliente());
        pedidos.setMedias(pedidosDetails.getMedias());

        return pedidosRepository.save(pedidos);
    }

    public void deletePedido(Long id) {
        pedidosRepository.deleteById(id);
    }

    public PedidosService(PersonaRepository personaRepository, MediasRepository mediasRepository, PedidosRepository pedidosRepository) {
        this.personaRepository = personaRepository;
        this.mediasRepository = mediasRepository;
        this.pedidosRepository = pedidosRepository;
    }

    public Persona getPersonaById(Long clienteId) {
        return personaRepository.findById(clienteId).orElse(null);
    }

    public Medias getMediasById(Long mediasId) {
        return mediasRepository.findById(mediasId).orElse(null);
    }

    public Pedidos createPedido(Pedidos nuevoPedido) {
        return pedidosRepository.save(nuevoPedido);
    }






}
