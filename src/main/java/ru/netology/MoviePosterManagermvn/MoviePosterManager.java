package ru.netology.MoviePosterManagermvn;

public class MoviePosterManager {
    private MoviePoster[] posters = new MoviePoster[0];
    private int limitMovieTitlePoster = 5;

    public void addMoviePoster(MoviePoster poster) { // Метод для добавления постера
        MoviePoster[] tmp = new MoviePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public MoviePoster[] findAll() {
        return posters;
    }

    public MoviePoster[] getItems() {     //получения всех постеров
        return posters;
    }

    public MoviePoster[] findLast() { //поиска последних постеров с учетом предела
        int resultLength;
        if (posters.length < limitMovieTitlePoster) {
            resultLength = posters.length;
        } else {
            resultLength = limitMovieTitlePoster;
        }

        MoviePoster[] result = new MoviePoster[resultLength]; //вывода последних добавленных фильмов в обратном порядке
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[posters.length - 1 - i];
        }

        return result;
    }

}
