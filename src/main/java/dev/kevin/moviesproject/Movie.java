package dev.kevin.moviesproject;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
    //Getter, Setter functions automatic
// @AllArgsConstructor
    //Constructor with all the arguments
// @NoArgsConstructor
    //Constructor with no args
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String trailerLink;
    private String poster;
    private List<String> genres; 
    private List<String> backdrop;
    @DocumentReference
    private List<Review> reviewIds;

    public Movie(ObjectId id, String imdbID, String title, String trailerLink, String poster, List<String> genres, List<String> backdrop, List<Review> reviewids){
        this.id = id;
        this.imdbId = imdbID;
        this.title = title;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrop = backdrop;
        this.reviewIds = reviewids;
    }

    public Movie(){
    }
}
 