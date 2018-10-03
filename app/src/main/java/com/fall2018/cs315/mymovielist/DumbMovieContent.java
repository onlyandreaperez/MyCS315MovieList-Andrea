package com.fall2018.cs315.mymovielist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DumbMovieContent {

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MovieModel> ITEM_MAP = new HashMap<String, MovieModel>();

    /**
     * A List of the Movie items.
     */
    public static final List<MovieModel> MOVIES = new ArrayList<MovieModel>();


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title = "The Greatest Showman";
    private static final String movie1Description = "Celebrates the birth of show business, and tells of a visionary who rose from nothing to create a spectacle that became a worldwide sensation.";
    private static final String movie1Year = "2017";
    private static final String movie1Image = "greatestshow";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt1485796/";

    private static final String movie2Title = "To All the Boys I've Loved Before";
    private static final String movie2Description = "A teenage girl's secret love letters are exposed and wreak havoc on her love life.";
    private static final String movie2Year = "2018";
    private static final String movie2Image = "boys";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt3846674/";


    private static final String movie3Title = "High School Musical";
    private static final String movie3Description = "A popular high school athlete and an academically gifted girl get roles in the school musical and develop a friendship that threatens East High's social order.";
    private static final String movie3Year = "2006";
    private static final String movie3Image = "hsm";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0475293/";

    private static final String movie4Title = "The Notebook";
    private static final String movie4Description = "A poor yet passionate young man falls in love with a rich young woman, giving her a sense of freedom, but they are soon separated because of their social differences.";
    private static final String movie4Year = "2004";
    private static final String movie4Image = "notebook";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt0332280/";


    private static final String movie5Title = "Pretty in Pink";
    private static final String movie5Description = "A poor girl must choose between the affections of dating her childhood sweetheart or a rich but sensitive playboy.";
    private static final String movie5Year = "1986";
    private static final String movie5Image = "pink";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt0091790/";


    //here add comments


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        ITEM_MAP.clear();
        MOVIES.clear();

        // make those movie objects
        MovieModel musical = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel love = new MovieModel(movie2Title, movie2Description, movie2Year,movie2Image, movie2Weblink);
        MovieModel dance = new MovieModel(movie3Title,movie3Description, movie3Year, movie3Image, movie3Weblink);
        MovieModel romcom = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image,movie4Weblink);
        MovieModel oldtimes = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        // add EACH movie object to our lists and maps
//        addMovieToList(action);
        addMovieToList(musical);
        addMovieToList(love);
        addMovieToList(dance);
        addMovieToList(romcom);
        addMovieToList(oldtimes);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
