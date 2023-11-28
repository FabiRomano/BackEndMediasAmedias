package com.MediasAMedias.MediasAMedias.services;


import com.MediasAMedias.MediasAMedias.models.Medias;
import com.MediasAMedias.MediasAMedias.repositories.MediasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediasService {
    @Autowired
   private MediasRepository mediasRepository;


    //crea registro de media
    public Medias createMedia(Medias medias) {
        return mediasRepository.save(medias);
    }

    //trae lista de medias
    public List<Medias> getAllMedias() {
        return mediasRepository.findAll();
    }

    //trae media por id
    public Optional<Medias> getMediaById(Long id) {
        return mediasRepository.findById(id);
    }


    //edita media por id
    public Medias updateMedia(Long id, Medias mediasDetails) {
        Medias medias = mediasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Media not found for id: " + id));
        medias.setName(mediasDetails.getName());
        medias.setDescription(mediasDetails.getDescription());
        medias.setPrecio(mediasDetails.getPrecio());
        medias.setImg(mediasDetails.getImg());
        return mediasRepository.save(medias);
    }


    //elimina medias por id
    public void deleteMedia(Long id) {
        mediasRepository.deleteById(id);
    }

}
