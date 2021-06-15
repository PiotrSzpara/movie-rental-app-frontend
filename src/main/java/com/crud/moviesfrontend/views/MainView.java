package com.crud.moviesfrontend.views;

import com.crud.moviesfrontend.client.BackendClient;
import com.crud.moviesfrontend.domain.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private Genre genre;
    private Movie movie;
    private Order order;
    private Rent rent;
    private User user;
    private BackendClient backendClient;

    private Grid<Movie> grid = new Grid<>(Movie.class);
    private TextField filter = new TextField();
    private MovieForm form = new MovieForm(this);
    private Button findMovie = new Button("Find movie");

    public MainView() {
        filter.setPlaceholder("Filter movie by title...");
        filter.setClearButtonVisible(true);
        filter.setValueChangeMode(ValueChangeMode.EAGER);
        filter.addValueChangeListener(e -> update());
        //grid.setColumns("Title", "Year", "imdbID", "Type", "Poster", "Plot");
        //binder.bindInstanceFields(this);

        findMovie.addClickListener(e -> {
            grid.asSingleSelect().clear();
        });

        add(filter);
        setSizeFull();
    }

    private void update() {
        grid.setItems(backendClient.getMovies(""));
   }








}
