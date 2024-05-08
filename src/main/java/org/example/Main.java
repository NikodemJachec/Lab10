import com.example.CastMember;
import com.example.Movie;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <ObjectMapper> void main(String[] args) {
        CastMember castMember1 = new CastMember("Actor1", "Character1");
        CastMember castMember2 = new CastMember("Actor2", "Character2");

        List<CastMember> cast1 = new ArrayList<>();
        cast1.add(castMember1);
        cast1.add(castMember2);

        Movie movie1 = new Movie("Movie1", "Director1", 120, cast1);

        CastMember castMember3 = new CastMember("Actor3", "Character3");
        CastMember castMember4 = new CastMember("Actor4", "Character4");

        List<CastMember> cast2 = new ArrayList<>();
        cast2.add(castMember3);
        cast2.add(castMember4);

        Movie movie2 = new Movie("Movie2", "Director2", 150, cast2);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            String jsonMovies = objectMapper.writeValueAsString(movies);
            System.out.println(jsonMovies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
