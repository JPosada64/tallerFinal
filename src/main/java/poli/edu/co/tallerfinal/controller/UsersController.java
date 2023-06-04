package poli.edu.co.tallerfinal.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import poli.edu.co.tallerfinal.persistence.entity.Users;
import poli.edu.co.tallerfinal.service.interfaces.IUserService;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsersController {

    private final IUserService iUserService;


    @GetMapping()
    public List<Users> getUsers(){
        List<Users> users = iUserService.listUsers();
        return users;
    }
    @PostMapping()
    public ResponseEntity createUser(@Valid @RequestBody Users u){
        var response = iUserService.createUser(u);
        return ResponseEntity.status(response.status).body(response);
    }

    @DeleteMapping()
    public ResponseEntity deleteUser(Long id){
        var response = iUserService.deleteUser(id);
        return ResponseEntity.status(response.status).body(response);
    }
}
