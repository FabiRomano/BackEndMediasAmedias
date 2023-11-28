package com.MediasAMedias.MediasAMedias.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private LocalDateTime fechaYHora;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Persona cliente;

    @ManyToOne
    @JoinColumn(name = "medias_id")
    private Medias medias;
    private String informacionCarrito;
    private String nombreComprador;
    private String telefonoComprador;
    private String emailCliente;

    private String total;

    //constructor vacio
    public Pedidos() {
    }

    public Pedidos(LocalDateTime fechaYHora, Persona cliente, Medias medias,
                   String informacionCarrito, String nombreComprador, String telefonoComprador,
                   String total, String emailCliente) {
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.medias = medias;
        this.informacionCarrito = informacionCarrito;
        this.nombreComprador = nombreComprador;
        this.telefonoComprador = telefonoComprador;
        this.emailCliente = emailCliente;
        this.total = total;

    }

    public long getId() {
        return id;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Medias getMedias() {
        return medias;
    }

    public void setMedias(Medias medias) {
        this.medias = medias;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
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

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
