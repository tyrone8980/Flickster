package com.codepath.flickster.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String posterPath;
    String title;
    String overview;

    public Movie(JSONObject jsonObject) throws JSONException {
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
    }
    public static List<Movie> fromJasonArray(JSONArray movieArray)throws JSONException{
        List<Movie> movies = new ArrayList<>();
        for (int i =0; i < movieArray.length(); i ++)
        {
            movies.add(new Movie(movieArray.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath(boolean isPoster) {
        /*if (isPoster = true )
        {
            return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath );
        }
        else
        {
            return String.format("https://image.tmdb.org/t/p/w780/%s", posterPath );
        }*/
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath );

    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }
}
