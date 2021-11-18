package com.example.demo;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    // Movies
    @Autowired
    private AppService movies;  //Service for both Movies and Quotes

    @PostMapping("/movies")    
    public Movie addMovie(@Valid @RequestBody Movie movie) {
        return movies.saveMovie(movie);
    }

    @GetMapping("/movies")
    public List<Movie> findMovies(@RequestParam(required=false) String title, @RequestParam(required=false) String year) {
        if (title==null && year==null) {
            return movies.getMovies();
        }
        else if (title!=null) {
            return movies.getMovieByTitle(title);
        }
        else if (year!=null) {
            return movies.getMovieByYear(Integer.parseInt(year));
        }
        else {
            return null;
        }
    }

    @GetMapping("/movies/{id}")
    public Movie findById(@PathVariable(value = "id") Long id) {
        return movies.getMovieById(id);
    }

    @DeleteMapping("/movies/{id}")
    public String deleteMovie(@PathVariable(value = "id") Long id) {
       return movies.deleteMovie(id);
    }

    @PutMapping("/movies/{id}")
    public Movie updateMovie(@PathVariable(value = "id") Long id, @Valid @RequestBody Movie movie) {
        return movies.updateMovie(id, movie);
    }

    //Quotes
    @PostMapping("/quotes/{id}")
    public Quote addQuote(@PathVariable(value = "id") Long id, @Valid @RequestBody Quote quote) {
        return movies.saveQuote(id, quote);
    }

    @GetMapping("/quotes")
    public List<Quote> getQuotes(@RequestParam(required=false) String name, @RequestParam(required=false) String id, @RequestParam(required=false) String movie) {
        if (id==null && name==null && movie==null) {
            return movies.getQuotes();
        }
        else if (id!=null) {
            return movies.getQuoteByMovieId(Long.parseLong(id));
        }
        else if (name!=null) {
            return movies.getQuoteByName(name);
        }
        else if (movie!=null) {
            return movies.getQuotesByTitle(movie);
        }
        else {
            return null;
        }
    }

    @GetMapping("/quote/{id}")
    public Quote getQuoteById(@PathVariable(value = "id") Long id) {
        return movies.getQuoteById(id);
    }

    @DeleteMapping("/quote/{id}")
    public String deleteQuote(@PathVariable(value = "id") Long id) {
        return movies.deleteQuote(id);
    }

    @PutMapping("/quotes/{id}")
    public Quote updateQuote(@PathVariable(value = "id") Long id, @Valid @RequestBody Quote quote) {
        return movies.updateQuote(id, quote);
    }
}
