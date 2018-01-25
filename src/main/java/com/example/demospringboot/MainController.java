package com.example.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {


    @RequestMapping("/")
    public String showindex()
    {
        String userName="";
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();
        String greet = "Hey Heloo  "+userName;
        System.out.println(greet);
        Fence fence = new Fence();
        String result = fence.fencing();
        System.out.println(result);
        return "Hey " + userName;
    }



}
