package com.question.PracticeQuestionMovie.service;

import com.question.PracticeQuestionMovie.domain.Movie;
import com.question.PracticeQuestionMovie.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
