package com.reactivebook.com.reactivebook.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    @Id
    private Long id;

    private String title;

    private String author;
}
