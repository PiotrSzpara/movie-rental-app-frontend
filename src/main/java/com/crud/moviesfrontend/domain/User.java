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
public class User {

    @JsonProperty("userId")
    private int userId;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("userEmail")
    private String userEmail;

    @JsonProperty("password")
    private String password;

    @JsonProperty("userTokenKey")
    private String userTokenKey;

    @JsonProperty("status")
    private boolean status;

    @JsonProperty("rents")
    private List<Rent> rents =new ArrayList<>();
}
