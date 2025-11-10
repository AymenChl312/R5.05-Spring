package fr.aymen.tp_spring.Article.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aymen.tp_spring.Article.Model.User;
import fr.aymen.tp_spring.Article.Repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return repository.save(user);
        
    }
}
