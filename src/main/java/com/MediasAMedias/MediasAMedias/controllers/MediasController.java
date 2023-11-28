package com.MediasAMedias.MediasAMedias.controllers;


import com.MediasAMedias.MediasAMedias.models.Medias;
import com.MediasAMedias.MediasAMedias.services.MediasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/medias")
public class MediasController {
    @Autowired
    private MediasService mediasService;
    public MediasController(MediasService mediasService) {

        this.mediasService = mediasService;
    }

    //crea registro de medias
    @PostMapping("/create")

    public Medias createMedia(@RequestBody Medias medias) {
        return mediasService.createMedia(medias);
    }


    //trae la lista completa de medias
    @GetMapping("/all")
    public List<Medias> getAllMedias() {
        return mediasService.getAllMedias();
    }


    //trae medias por id
    @GetMapping("/{id}")
    public Optional<Medias> getMediaById(@PathVariable Long id) {
        return mediasService.getMediaById(id);
    }


    //edita por id
    @PutMapping("/{id}")
    public Medias updateMedia(@PathVariable Long id, @RequestBody Medias medias) {
        return mediasService.updateMedia(id, medias);
    }


    //elimina por id
    @DeleteMapping("/medias/{id}")
    public void deleteMedia(@PathVariable Long id) {
        mediasService.deleteMedia(id);
    }


}
