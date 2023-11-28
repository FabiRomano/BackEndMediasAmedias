package com.MediasAMedias.MediasAMedias.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Medias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String name;
    private String description;
    private Double precio;
    private String img;

    @OneToMany(mappedBy = "medias")
    private List<Pedidos> pedidos;

    public Medias() {
    }

    public Medias(String name, String description, String img, Double precio) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.precio = precio;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
