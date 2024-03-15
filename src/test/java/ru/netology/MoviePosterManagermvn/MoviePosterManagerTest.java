package ru.netology.MoviePosterManagermvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {

    MoviePoster poster1 = new MoviePoster(1, "Бладшот");
    MoviePoster poster2 = new MoviePoster(2, "Вперед,");
    MoviePoster poster3 = new MoviePoster(3, "Отель Белград,");
    MoviePoster poster4 = new MoviePoster(4, "Джентельмены,");
    MoviePoster poster5 = new MoviePoster(5, "Человек - невидимка,");
    MoviePoster poster6 = new MoviePoster(6, "Тролли. Мировой тур,");
    MoviePoster poster7 = new MoviePoster(7, "Номер один");


    @Test
    public void allMoviesInTheOrderAdded() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addMoviePoster(poster1);
        manager.addMoviePoster(poster2);
        manager.addMoviePoster(poster3);
        manager.addMoviePoster(poster4);
        manager.addMoviePoster(poster5);
        manager.addMoviePoster(poster6);
        manager.addMoviePoster(poster7);

        MoviePoster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastEmpty() {
        // Тест для случая, когда список постеров пуст
        MoviePosterManager manager = new MoviePosterManager();

        MoviePoster[] expected = {};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviePosterConstructor() {
        MoviePoster moviePoster = new MoviePoster(1, "Бладшот");
        Object[] expected = {1, "Бладшот"};
        Object[] actual = {moviePoster.getId(), moviePoster.getMovieTitlePoster()};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastUnderLimit() {
        // Arrange
        MoviePosterManager manager = new MoviePosterManager();
        MoviePoster poster1 = new MoviePoster(1, "Бладшот");
        MoviePoster poster2 = new MoviePoster(2, "Вперед,");
        manager.addMoviePoster(poster1);
        manager.addMoviePoster(poster2);

        // Assert
        MoviePoster[] expected = {poster2, poster1};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetItems() {
        // Arrange
        MoviePoster poster1 = new MoviePoster(1, "Постер фильма 1");
        MoviePoster poster2 = new MoviePoster(2, "Постер фильма 2");
        MoviePoster[] posters = {poster1, poster2};
        MoviePosterManager manager = new MoviePosterManager();
        manager.addMoviePoster(poster1);
        manager.addMoviePoster(poster2);

        MoviePoster[] actual = manager.getItems();
        Assertions.assertArrayEquals(posters, actual);
    }

    @Test
    public void allMoviesInTheOrderLastAdded() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMoviePoster(poster5);
        manager.addMoviePoster(poster6);
        manager.addMoviePoster(poster7);

        MoviePoster[] expected = {poster5, poster6, poster7};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfDefault() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addMoviePoster(poster1);
        manager.addMoviePoster(poster2);
        manager.addMoviePoster(poster3);
        manager.addMoviePoster(poster4);
        manager.addMoviePoster(poster5);
        manager.addMoviePoster(poster6);
        manager.addMoviePoster(poster7);

        MoviePoster[] expected = {poster7, poster6, poster5, poster4, poster3};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}