package tech.kibetimmanuel.movies.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.kibetimmanuel.movies.model.Movie;
import tech.kibetimmanuel.movies.repository.MovieRepository;
import tech.kibetimmanuel.movies.service.MovieService;

import java.util.List;
@Service

public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findMovieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }

}
