package com.codewithsudhakaran.springbootjpa.Service;

import com.codewithsudhakaran.springbootjpa.Respository.AppUserRepository;
import com.codewithsudhakaran.springbootjpa.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser login(AppUser user) {
        AppUser loggedInUser = appUserRepository
                .findUserByUserNameAndPassword(user.getUsername(), user.getPassword());
        return loggedInUser;
    }

    public AppUser register(AppUser appUser) {
        appUserRepository.save(appUser);
        return appUser;
    }
}
