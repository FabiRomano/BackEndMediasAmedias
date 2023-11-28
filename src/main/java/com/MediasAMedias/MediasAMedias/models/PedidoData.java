package com.MediasAMedias.MediasAMedias.models;

import java.time.LocalDate;

public class PedidoData {
    private LocalDate date;
    private Long clienteId;
    private Long mediasId;
    private String informacionCarrito;
    private String nombreComprador;
    private String telefonoComprador;


    // Constructor, getters y setters
    // Constructor


    public PedidoData(LocalDate date, Long clienteId, Long mediasId, String informacionCarrito, String nombreComprador, String telefonoComprador) {
        this.date = date;
        this.clienteId = clienteId;
        this.mediasId = mediasId;
        this.informacionCarrito = informacionCarrito;
        this.nombreComprador = nombreComprador;
        this.telefonoComprador = telefonoComprador;
    }

    // Getters y setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getMediasId() {
        return mediasId;
    }

    public void setMediasId(Long mediasId) {
        this.mediasId = mediasId;
    }

    public String getInformacionCarrito() {
        return informacionCarrito;
    }

    public void setInformacionCarrito(String informacionCarrito) {
        this.informacionCarrito = informacionCarrito;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getTelefonoComprador() {
        return telefonoComprador;
    }

    public void setTelefonoComprador(String telefonoComprador) {
        this.telefonoComprador = telefonoComprador;
    }
}
