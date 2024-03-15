package ru.netology.MoviePosterManagermvn;

public class MoviePoster {
    private int id;
    private String movieTitlePoster;

    public MoviePoster(int id, String movieTitlePoster) {
        this.id = id;
        this.movieTitlePoster = movieTitlePoster;
    }

    public MoviePoster() {
        this.id = id;
        this.movieTitlePoster = movieTitlePoster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getMovieTitlePoster() {
        return movieTitlePoster;
    }

    public void SetMovieTitlePoster(String movieTitlePoster) {

        this.movieTitlePoster = movieTitlePoster;
    }
}