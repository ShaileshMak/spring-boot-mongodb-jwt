package com.shailesh.mak.springmongodbjwt.security;

import com.shailesh.mak.springmongodbjwt.models.AppUser;
import com.shailesh.mak.springmongodbjwt.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.findByUserName(userName);
        if (appUser == null) {
            throw new UsernameNotFoundException(userName);
        }
        return new User(appUser.getUserName(), appUser.getPassword(), Collections.emptyList());
    }
}
