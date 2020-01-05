package com.higbie.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {


    @GetMapping("/")
    public String sayYo(){
        return "Yo! Time on Server is: " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "You need to do this";
    }

    @GetMapping("/moo")
    public String cowSays(){
        return "Moo!";
    }

    @GetMapping("/meow")
    public String catSays(){
        return "Meow";
    }


}


