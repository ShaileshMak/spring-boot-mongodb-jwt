package com.shailesh.mak.springmongodbjwt.services;

import com.shailesh.mak.springmongodbjwt.models.AppUser;
import com.shailesh.mak.springmongodbjwt.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public void saveUser(AppUser appUser) {
        appUserRepository.save(appUser);
    }

    public AppUser getByUserName(final String userName) {
        return appUserRepository.findByUserName(userName);
    }
}
