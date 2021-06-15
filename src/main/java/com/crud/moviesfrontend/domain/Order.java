package com.crud.moviesfrontend.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Component
public class Order {

    @JsonProperty("orderId")
    private int orderId;

    @JsonProperty("orderName")
    private String orderName;

    @JsonProperty("paid")
    private boolean paid;

    @JsonProperty("orderDate")
    private LocalDate orderDate;

    @JsonProperty("orderDateEnd")
    private LocalDate orderDateEnd;

    @JsonProperty("rent")
    private Rent rent;

    @JsonProperty("movies")
    private List<Movie> movies = new ArrayList<>();
}
