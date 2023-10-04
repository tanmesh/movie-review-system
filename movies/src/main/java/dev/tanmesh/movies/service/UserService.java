package dev.tanmesh.movies.service;

import dev.tanmesh.movies.entity.Movie;
import dev.tanmesh.movies.entity.User;
import dev.tanmesh.movies.repository.MovieRepository;
import dev.tanmesh.movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> allUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUser(String emailId) {
        return userRepository.findUserByEmailId(emailId);
    }

    public User addUser(User user) {
        //TODO: check for wrong email id
        return userRepository.insert(user);
    }
}
