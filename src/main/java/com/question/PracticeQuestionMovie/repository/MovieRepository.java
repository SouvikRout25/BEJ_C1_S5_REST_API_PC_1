package com.question.PracticeQuestionMovie.repository;

import com.question.PracticeQuestionMovie.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
}