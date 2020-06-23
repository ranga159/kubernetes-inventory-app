package com.myprojects.inventory.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserCredDetailsDTO {
    private String userName;
    private String password;
}
