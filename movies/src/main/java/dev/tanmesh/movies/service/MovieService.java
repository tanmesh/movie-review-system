package dev.tanmesh.movies.service;

import dev.tanmesh.movies.entity.Movie;
import dev.tanmesh.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
