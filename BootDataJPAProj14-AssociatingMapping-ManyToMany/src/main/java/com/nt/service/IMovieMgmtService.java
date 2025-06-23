package com.nt.service;

import java.util.List;

import com.nt.entity.Artist;
import com.nt.entity.Movie;

public interface IMovieMgmtService {
   public  String  registerMoviesAndArtists(List<Movie> list);
   public  String  registerArtistsAndMovies(List<Artist> list);
   public  List<Movie>  showMoviesAndTheirArtists();
   public   List<Artist>  showArtistsAndTheirMovies();
   public   String  removeArtistsFormMovie(int mid , List<Integer> aids); 
   
   
}
