package com.workshop.bouali.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Chhin_Hua - 01/02
 **/

@Repository
public class UserDao {

    private final static List<UserDetails> APPLICATION_USER = Arrays.asList(
        new User(
            "bouali.social@gmail.com",
            "password",
            Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"))
        ),
        new User(
            "user.social@gmail.com",
            "password",
            Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))
        )
    );

    public UserDetails findUserByEmail(String email) {
        return APPLICATION_USER
            .stream()
            .filter(u -> u.getUsername().equals(email))
            .findFirst()
            .orElseThrow(() -> new UsernameNotFoundException("No user was found"));
    }

}
