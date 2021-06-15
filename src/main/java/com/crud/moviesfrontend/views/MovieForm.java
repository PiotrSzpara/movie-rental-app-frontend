package com.crud.moviesfrontend.views;

import com.crud.moviesfrontend.service.MovieService;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class MovieForm extends FormLayout {
    private MainView mainView;
    private TextField title = new TextField("Title");
    private TextField year = new TextField("Year");
    private TextField imdbID = new TextField("imdbID");
    private TextField type = new TextField("Type");
    //private Binder<Movie> binder = new Binder<Movie>(Movie.class);
    private MovieService service = MovieService.getInstance();

    public MovieForm(MainView mainView) {
        add(title, year, imdbID, type);
        //binder.bindInstanceFields(this);
        this.mainView = mainView;
    }
}
