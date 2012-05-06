package ie.simo.moviemanager.gae.dao;

import ie.simo.moviemanager.gae.domain.MovieDetails;

import java.util.ArrayList;
import java.util.List;

public class DummyMovieDao extends MovieDao {
	
	private ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
	
	private void setUpDummyData() {
		MovieDetails a = new MovieDetails("jimmy", "titanic 2", 800);
		MovieDetails b = new MovieDetails("jimmy", "titanic 3", 650);
		MovieDetails c = new MovieDetails("jimmy", "Police Academy 14", 200);
		MovieDetails d = new MovieDetails("joe", "The Avengers", 200);
		MovieDetails e = new MovieDetails("joe", "Monopoly the movie", 400);
		MovieDetails f = new MovieDetails("jack", "The unhappy fly", 550);
		MovieDetails g = new MovieDetails("jack", "cake", 376);
		MovieDetails h = new MovieDetails("jake", "the stew from LA", 642);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
	}
	
	@Override
	public List<MovieDetails> getTopMovies() {
		setUpDummyData();
		return list;
	}

}
