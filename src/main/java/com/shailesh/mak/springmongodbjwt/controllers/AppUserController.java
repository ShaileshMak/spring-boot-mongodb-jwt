package com.shailesh.mak.springmongodbjwt.controllers;

import com.shailesh.mak.springmongodbjwt.models.AppUser;
import com.shailesh.mak.springmongodbjwt.services.AppUserService;
import jdk.internal.dynalink.support.NameCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/appUsers/signUp")
    public ResponseEntity<String> signUp(@RequestBody AppUser user) {
        AppUser _existingUser = appUserService.getByUserName(user.getUserName());
        if (_existingUser != null) {
            return new ResponseEntity<>("User already Existed", HttpStatus.BAD_REQUEST);
        } else {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            appUserService.saveUser(user);
            return new ResponseEntity<>("Success Fully Registered", HttpStatus.OK);
        }
    }
}
