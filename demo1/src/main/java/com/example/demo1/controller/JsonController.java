package com.example.demo1.controller;

import com.example.demo1.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/user")
    public User getUser() {
        return new User(1l, "Aiden Zuo", "123567");
    }

    @RequestMapping("/list")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1l, "Aiden Zuo", "123456");
        User user2 = new User(2l, "Spring Boot", "123456");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1l, "Aiden Zuo", "123456");
        map.put("作者信息", user);
        map.put("仓库地址", "https://github.com/pianxiaopian/");
        map.put("目标", "坚持");
        map.put("码龄", null);
        return map;
    }
}
