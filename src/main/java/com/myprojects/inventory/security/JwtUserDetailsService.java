package com.myprojects.inventory.security;

import com.myprojects.inventory.domain.UserCredDetailsDTO;
import com.myprojects.inventory.repository.UserCredRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    private final UserCredRepository userCredRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserCredDetailsDTO userCredDetailsDto = userCredRepository.findByUsername(username);
        if (userCredDetailsDto == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }
        return new org.springframework.security.core.userdetails.User(userCredDetailsDto.getUserName(), userCredDetailsDto.getPassword(),
                new ArrayList<>());
    }
}
