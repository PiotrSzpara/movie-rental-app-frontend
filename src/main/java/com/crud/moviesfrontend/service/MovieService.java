package com.crud.moviesfrontend.service;

import com.crud.moviesfrontend.client.BackendClient;
import com.crud.moviesfrontend.domain.Movie;
import com.vaadin.flow.data.binder.Binder;

import java.util.HashSet;
import java.util.Set;

public class MovieService {
    private Set<Movie> movies;
    private static MovieService movieService;
    //private final Binder<Movie> binder = new Binder<Movie>(Movie.class);

    private MovieService() {
        this.movies = movies;
    }

    public static MovieService getInstance() {
        if (movieService == null) {
            movieService = new MovieService();
        }
        return movieService;
    }

    public Set<Movie> getMovies() {
        return new HashSet<>(movies);
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

}
