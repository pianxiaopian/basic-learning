package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.utils.JsonResult;
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
    public JsonResult<User> getUser() {
        User user = new User(1l, "Aiden Zuo", "123567");
        return new JsonResult<User>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List<User>> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1l, "Aiden Zuo", "123456");
        User user2 = new User(2l, "Spring Boot", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功!");
    }

    @RequestMapping("/map")
    public JsonResult<Map<String, Object>> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1l, "Aiden Zuo", "123456");
        map.put("作者信息", user);
        map.put("仓库地址", "https://github.com/pianxiaopian/");
        map.put("目标", "坚持");
        map.put("码龄", null);
        return new JsonResult<>(map);
    }
}
