package com.movieapi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // implement custom methods apart from built-in

    Optional<Movie> findMovieByImdbId(String imdbId);
}
