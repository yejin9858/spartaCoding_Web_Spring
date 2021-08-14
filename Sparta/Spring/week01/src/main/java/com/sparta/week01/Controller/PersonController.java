package com.sparta.week01.Controller;

import com.sparta.week01.Domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson(){
        Person person = new Person();
        person.setName("김석진");
        person.setAge(30);
        person.setJob("BTS");
        return person;
    }
}