package com.tss.todo.client;

import com.tss.todo.model.UserModel;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "UserClient", url = "https://jsonplaceholder.typicode.com")
public interface UserClient {
    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserModel> getUsers();
}


