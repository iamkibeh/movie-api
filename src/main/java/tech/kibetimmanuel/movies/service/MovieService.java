package tech.kibetimmanuel.movies.service;

import tech.kibetimmanuel.movies.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAllMovies();

    Movie findMovieByImdbId(String id);
}
