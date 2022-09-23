package com.example.aop2.controller;


import com.example.aop2.annotation.Decode;
import com.example.aop2.annotation.Timer;
import com.example.aop2.dto.User;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
//        System.out.println("get method");
//        System.out.println("get method :" +id);
//        System.out.println("get method :" +name);

        return id+ " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        System.out.println("post method :" +user);

        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {

//        StopWatch stopWatch = new StopWatch(); -->이런 것들을 반복되니까 aop로 빼는 것
//        stopWatch.start();

        //db logic
        Thread.sleep(1000*2);

//        stopWatch.stop();
//        System.out.println("total time:"+stopWatch.getTotalTimeSeconds());
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.println("put method :" +user);

        return user;
    }

}
