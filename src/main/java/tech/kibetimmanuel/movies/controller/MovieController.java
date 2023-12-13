package tech.kibetimmanuel.movies.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.kibetimmanuel.movies.model.Movie;
import tech.kibetimmanuel.movies.service.implementation.MovieServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieServiceImpl movieService;

    public MovieController(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies() {
        return new ResponseEntity<List<Movie>>(movieService.findAllMovies(), HttpStatus.OK);
    }

}
