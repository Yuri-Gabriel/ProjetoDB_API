package main.fakeinsta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.fakeinsta.model.User;
import main.fakeinsta.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public void save(User user) {
        repository.save(user);
    }

    public User getOne(int id) {
        return repository.pegarUm(id);
    }
}
