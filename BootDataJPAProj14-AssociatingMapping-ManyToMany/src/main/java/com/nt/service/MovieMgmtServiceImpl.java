package com.nt.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Artist;
import com.nt.entity.Movie;
import com.nt.repository.IArtistRepository;
import com.nt.repository.IMovieRepository;

@Service
public class MovieMgmtServiceImpl implements IMovieMgmtService {
	@Autowired
	private  IMovieRepository  movieRepo;
	@Autowired
	private   IArtistRepository  artistRepo;

	@Override
	public String registerMoviesAndArtists(List<Movie> list) {
		List<Movie>  savedList=movieRepo.saveAll(list);
		return savedList.size()+" no.of  Movies and their artits  are saved";
	}

	@Override
	public String registerArtistsAndMovies(List<Artist> list) {
		//save the object
		List<Artist>  savedList=artistRepo.saveAll(list);
		return savedList.size()+" no.of  Artits and Their Movies are saved ";
	}
	
	@Override
	public List<Movie> showMoviesAndTheirArtists() {
		return movieRepo.findAll();
	}
	
	@Override
	public List<Artist> showArtistsAndTheirMovies() {
		return artistRepo.findAll();
	}
	
	@Override
	@Transactional
	public String removeArtistsFormMovie(int mid, List<Integer> aids) {
		//Load Movie object
		Movie  movie=movieRepo.findById(mid).orElseThrow(()-> new IllegalArgumentException("Invalid mid"));
		//Load the artists
		List<Artist>  listArtists=artistRepo.findAllById(aids);
		//remove  loaded artits from  Parent
		movie.getArtistsInfo().removeAll(listArtists);
		//update the Movie object
		movieRepo.save(movie);
		return  aids+"  Artits are  removed from the  mid "+movie;
		
	}

}
