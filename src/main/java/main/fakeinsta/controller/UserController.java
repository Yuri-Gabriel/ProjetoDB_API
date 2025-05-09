package main.fakeinsta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.fakeinsta.model.User;
import main.fakeinsta.model.dto.user.CreateUserDTO;
import main.fakeinsta.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {
        List<User> allUsers = service.getAll();
        return ResponseEntity.ok().body(allUsers);
    }

    @GetMapping("/create")
    public ResponseEntity<Void> create(@RequestParam int value) {
        CreateUserDTO userDTO1 = new CreateUserDTO(
            "yuri",
            "yuri1234@gmail.com",
            "yuri1234",
            "Vivendo"
        );
        CreateUserDTO userDTO2 = new CreateUserDTO(
            "pablo",
            "pablo@gmail.com",
            "pablo4321",
            "Ser ou não ser"
        );
        if(value == 1) {
            service.save(new User(userDTO1));
        } else {
            service.save(new User(userDTO2));
        }
        
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/um")
    public ResponseEntity<User> pegarUm(@RequestParam int id) {
        return ResponseEntity.ok().body(
            service.getOne(id)
        );
    }
}
