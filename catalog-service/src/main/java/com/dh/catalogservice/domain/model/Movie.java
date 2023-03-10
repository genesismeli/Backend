package com.dh.catalogservice.domain.model;

import java.io.Serializable;

import lombok.*;

import java.io.Serializable;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Movie {


    private Long id;
    private String name;
    private String genre;
    private String urlStream;

}
