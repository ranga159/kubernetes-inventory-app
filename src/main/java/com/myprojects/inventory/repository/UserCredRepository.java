package com.myprojects.inventory.repository;

import com.myprojects.inventory.domain.UserCredDetailsDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserCredRepository{

    private final List<String> userList = Arrays.asList("ranga","admin");

    public UserCredDetailsDTO findByUsername(String userName){
        boolean userExists = userList.stream().anyMatch(c -> c.equals(userName));
        UserCredDetailsDTO userCredDetailsDTO = null;

        if(userExists){
            userCredDetailsDTO = new UserCredDetailsDTO();
            userCredDetailsDTO.setUserName(userName);
            String encodedPassword = new BCryptPasswordEncoder().encode("password");
            userCredDetailsDTO.setPassword(encodedPassword);
        }


        return userCredDetailsDTO;
    }
}
