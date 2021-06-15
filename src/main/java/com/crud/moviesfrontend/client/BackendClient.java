package com.crud.moviesfrontend.client;

import com.crud.moviesfrontend.domain.Movie;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Optional.ofNullable;

//@Component
public class BackendClient {

    public List<Movie> getMovies(String title) {
        RestTemplate restTemplate =  new RestTemplate();
        URI url = UriComponentsBuilder
                .fromHttpUrl("http://localhost:9000/v1/movie/getOmdbMovie")
                .queryParam("title", title)
                .build()
                .encode().
                toUri();
        try {
            Movie[] response = restTemplate.getForObject(url, Movie[].class);
            return Arrays.asList(ofNullable(response).orElse(new Movie[0]));
        } catch (RestClientException e) {
            return new ArrayList<>();
        }
    }
}
