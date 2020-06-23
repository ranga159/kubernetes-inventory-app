package com.myprojects.inventory.domain;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Data
public class JwtResponseDTO implements Serializable {

    private static final long serialVersionUID = -3641259989499188173L;
    private final String jwttoken;

}
