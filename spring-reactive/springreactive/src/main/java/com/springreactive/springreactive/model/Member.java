package com.springreactive.springreactive.model;


import lombok.Builder;
import org.springframework.data.annotation.Id;


@Builder
public class Member {
    @Id
    private Long id;
    private String name;
}

