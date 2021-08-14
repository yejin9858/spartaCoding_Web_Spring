package com.sparta.week02.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private int age;

    public Person(PersonRequestDto requestDto){
        name = requestDto.getName();
        job = requestDto.getJob();
        age = requestDto.getAge();
    }

    public void update(PersonRequestDto requestDto){
        name = requestDto.getName();
        job = requestDto.getJob();
        age = requestDto.getAge();
    }

}
