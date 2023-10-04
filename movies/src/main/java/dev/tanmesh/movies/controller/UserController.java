package dev.tanmesh.movies.controller;

import dev.tanmesh.movies.entity.Review;
import dev.tanmesh.movies.entity.User;
import dev.tanmesh.movies.service.ReviewService;
import dev.tanmesh.movies.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{emailId}")
    public ResponseEntity<Optional<User>> getUser(@RequestBody String emailId) {
        return new ResponseEntity<>(userService.getUser(emailId), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
}
