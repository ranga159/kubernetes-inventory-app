package com.myprojects.inventory.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class JwtRequestDTO implements Serializable {

    private static final long serialVersionUID = 474983098650416944L;
    private String username;
    private String password;

}
