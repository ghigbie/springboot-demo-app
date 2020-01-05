package com.higbie.demoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${team.name}")
    private String teamName;

    @Value("${team.rank}")
    private int teamRank;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String sayYo(){
        return "Yo! Time on Server is: " + LocalDateTime.now();
    }

    @GetMapping("/teaminfo")
    public String showTeam(){
        return "Team: " + teamName + " / Coach: " +coachName;
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

    @GetMapping("fortune")
    public String youWin(){
        return "Today is your lucky day!";
    }


}


