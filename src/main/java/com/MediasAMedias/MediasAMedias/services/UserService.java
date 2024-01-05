package com.MediasAMedias.MediasAMedias.services;


import com.MediasAMedias.MediasAMedias.models.User;
import com.MediasAMedias.MediasAMedias.security.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
        @Autowired
    IUserRepository iuserRepo;



    public boolean existsByEmail(String email) {
        return iuserRepo.existsByEmail(email);
    }

    public void save(User usuario) {
        iuserRepo.save(usuario);
    }

}
