package com.tss.todo.service;

import com.tss.todo.client.UserClient;
import com.tss.todo.model.UserModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserClient userClient;

    public List<UserModel> getUsers()
    {
        return userClient.getUsers();
    }
}
