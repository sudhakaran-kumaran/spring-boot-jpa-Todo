package com.codewithsudhakaran.springbootjpa.Controller;

import com.codewithsudhakaran.springbootjpa.Service.AppUserService;
import com.codewithsudhakaran.springbootjpa.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @RequestMapping("/login")
    private AppUser login(@RequestBody AppUser appUser) {
        return appUserService.login(appUser);
    }

    @RequestMapping("/register")
    private AppUser register(@RequestBody AppUser appUser) {
        return appUserService.register(appUser);
    }

}
