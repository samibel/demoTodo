package com.tss.todo.controller;


import com.tss.todo.client.UserClient;
import com.tss.todo.model.UserModel;
import com.tss.todo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<UserModel> getUser() {
        List<UserModel> users = userService.getUsers();
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
