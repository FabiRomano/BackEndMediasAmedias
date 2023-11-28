package com.MediasAMedias.MediasAMedias.models;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String name;
    private String lastName;
    private  String direccion;
    private  String localidad;
    private String provincia;
    private String codigoPostal;
    private String email;
    private int whatsapp;

    @OneToMany(mappedBy = "cliente")
    private List<Pedidos> pedidos;



    public Persona() {
    }

    public Persona(String name, String lastName, String direccion, String localidad, String provincia, String codigoPostal, String email, int whatsapp) {
        this.name = name;
        this.lastName = lastName;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.whatsapp = whatsapp;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }
}
