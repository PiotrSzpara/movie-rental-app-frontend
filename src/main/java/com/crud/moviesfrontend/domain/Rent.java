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
public class Rent {

    @JsonProperty("rentId")
    private int rentId;

    @JsonProperty("order")
    private Order order;

    @JsonProperty("user")
    private User user;

    @JsonProperty("movies")
    private List<Movie> movies = new ArrayList<>();
}
