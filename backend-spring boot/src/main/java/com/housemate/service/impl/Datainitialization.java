package com.housemate.service.impl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.housemate.domain.USER_ROLE;
import com.housemate.model.User;
import com.housemate.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class Datainitialization implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        initializeAdminUser();
    }

    private void initializeAdminUser() {
        String adminUsername = "housemate996@gmail.com";
        String adminPassword = "Housemate"; // You might want to replace this with a more complex password

        if (userRepository.findByEmail(adminUsername) == null) {
            User adminUser = new User();	
            adminUser.setPassword(passwordEncoder.encode(adminPassword));
            adminUser.setFullName("Housemate");
            adminUser.setEmail(adminUsername);
            adminUser.setRole(USER_ROLE.ROLE_ADMIN);

            try {
                userRepository.save(adminUser);
                log.info("Admin user with email {} created successfully.", adminUsername);
            } catch (Exception e) {
                log.error("Error occurred while saving the admin user: {}", e.getMessage());
            }
        } else {
            log.info("Admin user with email {} already exists.", adminUsername);
        }
    }
}
