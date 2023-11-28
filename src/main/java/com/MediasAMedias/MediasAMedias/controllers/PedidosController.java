package com.MediasAMedias.MediasAMedias.controllers;

import com.MediasAMedias.MediasAMedias.models.Medias;
import com.MediasAMedias.MediasAMedias.models.PedidoData;
import com.MediasAMedias.MediasAMedias.models.Pedidos;
import com.MediasAMedias.MediasAMedias.models.Persona;
import com.MediasAMedias.MediasAMedias.services.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pedidos")

public class PedidosController {

    @Autowired
    private PedidosService pedidosService;
    public PedidosController(PedidosService pedidosService){
        this.pedidosService = pedidosService;
    }

    //traigo todos los pedidos

  @GetMapping("/all")
  public List<Pedidos> getPedidosAll(){
        return pedidosService.getAllPedidos();
  }


    // Modifica el controlador para aceptar el objeto JSON directamente en el cuerpo
    @PostMapping("/create")
    public ResponseEntity<?> createPedido(@RequestBody Pedidos nuevoPedido) {
        try {

            // Agrega la fecha y hora al nuevo pedido
            nuevoPedido.setFechaYHora(LocalDateTime.now());


            // Código para crear el pedido
            Pedidos resultadoPedido = pedidosService.createPedido(nuevoPedido);

            // Devolver una respuesta exitosa con el pedido creado
            return new ResponseEntity<>(resultadoPedido, HttpStatus.OK);
        } catch (Exception e) {
            // Log de la excepción (esto es útil para depuración)
            e.printStackTrace();
            System.out.println("Error message: " + e.getMessage()); // Imprimir el mensaje de error

            // Devolver una respuesta de error con un mensaje significativo
            String errorMessage = (e.getMessage() != null) ? e.getMessage() : "Error desconocido";
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}










