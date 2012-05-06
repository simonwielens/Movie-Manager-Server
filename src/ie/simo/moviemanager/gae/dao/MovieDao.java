package ie.simo.moviemanager.gae.dao;

import ie.simo.moviemanager.gae.domain.MovieDetails;

import java.util.List;

public abstract class MovieDao {
	
	public abstract List<MovieDetails> getTopMovies();

}
