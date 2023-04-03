package com.movieapi.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //to map the movies document in collections database
@Data // for getters, setter and toString methods
@AllArgsConstructor // all args constructors for the class
@NoArgsConstructor // constructor with no args
public class Movie {

    @Id
    private ObjectId id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference //will allow the db to store only the Id's of the reviews from a separate collection
    // manual reference relationship
    private List<Review> reviewIds;

}
