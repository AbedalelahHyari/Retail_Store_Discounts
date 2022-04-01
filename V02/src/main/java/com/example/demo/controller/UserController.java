package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
@CrossOrigin("*" || origins ={"http://localhost:3000/"})
this annotation it represents allow cross-origin resource sharing will allow to make a connection
between two domains (http://localhost:8080 and http://localhost:3000)
we use it when we make an axios request to backend server in our case will be http://localhost:8080
*/

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    //==============================================================================

    // GET method
    // This method will retrieve all users that we store it in the database on path = "http://localhost:8080/api/users"
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //==============================================================================

    // POST method
    // This method will create a new user on the path = "http://localhost:8080/api/users"
    @PostMapping
    public User createNewUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    //==============================================================================

    // GET method
    // This method will get a specific user on the path = "http://localhost:8080/api/users/${id}"
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new
                ResourceNotFoundException("The user not found with id => " + id));
        return ResponseEntity.ok(user);
    }

    //==============================================================================
    // PUT method
    // This method will update the information for a specific user on the path = "http://localhost:8080/api/users/id"
    @PutMapping("{id}")
    public ResponseEntity<User> updateUserById(@PathVariable long id, @RequestBody User updatedInfo) {
        User oldUser = userRepository.findById(id).orElseThrow(() -> new
                ResourceNotFoundException("The user not found with id => " + id));
        oldUser.setName(updatedInfo.getName());
        oldUser.setEmail(updatedInfo.getEmail());
        oldUser.setIsEmployee(updatedInfo.getIsEmployee());

        userRepository.save(updatedInfo);
        return ResponseEntity.ok(oldUser);
    }

    //==============================================================================
    // DELETE method
    // This method will delete a specific user by his id on the path = "http://localhost:8080/api/users/id"

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUserById(@PathVariable long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new
                ResourceNotFoundException("The user not found with id => " + id));
        userRepository.delete(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
