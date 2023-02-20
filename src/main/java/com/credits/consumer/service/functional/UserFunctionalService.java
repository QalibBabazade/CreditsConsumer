package com.credits.consumer.service.functional;


import com.credits.consumer.entity.User;
import com.credits.consumer.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionalService {

    private final UserRepository userRepository;

    public UserFunctionalService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User addUser(User user) {
        return userRepository.save(user);
    }
}
