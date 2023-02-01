package com.workshop.bouali.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Chhin_Hua - 01/02
 **/

@Getter
@Setter
@NoArgsConstructor
public class AuthenticationRequest {

    private String email;
    private String password;
}
