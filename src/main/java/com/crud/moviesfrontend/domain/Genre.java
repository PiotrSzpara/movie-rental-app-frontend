package com.crud.moviesfrontend.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Component
public class Genre {

    @JsonProperty("genreId")
    private int genreId;

    @JsonProperty("genreType")
    private String genreType;

    @JsonProperty("genreDescrition")
    private String genreDescription;

    @JsonProperty("movies")
    private List<Movie> movies = new ArrayList<>();
}
