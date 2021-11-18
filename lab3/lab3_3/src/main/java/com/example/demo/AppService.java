package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    //Quotes Service
    @Autowired
    private QuoteRepository qRepository;

    public Quote saveQuote(Long id, Quote quote) {
        quote.setMovie(getMovieById(id));
        return qRepository.save(quote);
    }

    public List<Quote> saveQuotes(List<Quote> quotes) {
        return qRepository.saveAll(quotes);
    }

    public List<Quote> getQuotes() {
        return qRepository.findAll();
    }

    public Quote getQuoteById(Long id) {
        return qRepository.findById(id).orElse(null);
    }

    public List<Quote> getQuoteByMovie(Movie movie) {
        return qRepository.findByMovie(movie);
    }

    public List<Quote> getQuoteByMovieId(Long id) {
        return qRepository.findByMovie(getMovieById(id));
    }

    public List<Quote> getQuoteByName(String name) {
        return qRepository.findByName(name);
    }

    public List<Quote> getQuotesByTitle(String title) {
        return qRepository.findByMovie(getMovieByTitle(title).get(0));
    }

    public String deleteQuote(Long id) {
        qRepository.deleteById(id);
        return "quote removed !! " + id;
    }

    public Quote updateQuote(Long id, Quote quote) {
        Quote oldQuote = qRepository.findById(id).orElse(null);
        oldQuote.setQuote(quote.getQuote());
        oldQuote.setName(quote.getName());
        oldQuote.setMovie(quote.getMovie());
        return qRepository.save(oldQuote);
    }
    //Movies Service
    @Autowired
    private MovieRepository mRepository;

    public Movie saveMovie(Movie movie) {
        return mRepository.save(movie);
    }

    public List<Movie> saveMovies(List<Movie> movies) {
        return mRepository.saveAll(movies);
    }

    public List<Movie> getMovies() {
        return mRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return mRepository.findById(id).orElse(null);
    }

    public List<Movie> getMovieByTitle(String title) {
        return mRepository.findByTitle(title);
    }

    public List<Movie> getMovieByYear(int year) {
        return mRepository.findByYear(year);
    }

    public String deleteMovie(Long id) {
        mRepository.deleteById(id);
        return "movie removed !! " + id;
    }

    public Movie updateMovie(Long id, Movie movie) {
        Movie oldMovie = mRepository.findById(id).orElse(null);
        oldMovie.setTitle(movie.getTitle());
        oldMovie.setYear(movie.getYear());
        return mRepository.save(oldMovie);
    }
}
