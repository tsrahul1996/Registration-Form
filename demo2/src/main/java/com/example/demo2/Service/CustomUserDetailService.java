package com.example.demo2.Service;

import com.example.demo2.Model.CustomUserDetails;
import com.example.demo2.Model.Registration;
import com.example.demo2.dao.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by expert on 29/7/19.
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Registration> optionalUsers= registrationRepository.findByName(username);
        optionalUsers.orElseThrow(() -> new UsernameNotFoundException("Username not found"));

        return optionalUsers.map(CustomUserDetails::new).get();
    }
}
