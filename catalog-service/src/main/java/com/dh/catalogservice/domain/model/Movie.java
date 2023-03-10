package com.dh.catalogservice.domain.model;

import java.io.Serializable;

import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String genre;
    private String urlStream;

}
