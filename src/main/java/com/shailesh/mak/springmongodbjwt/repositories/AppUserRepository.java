package com.shailesh.mak.springmongodbjwt.repositories;

import com.shailesh.mak.springmongodbjwt.models.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends MongoRepository<AppUser, String> {
    public AppUser findByUserName(final String userName);
}
