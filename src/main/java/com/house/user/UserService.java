package com.house.user;

import com.house.shared.exceptions.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new BadRequestException("User not found")).toDto();
    }

}
