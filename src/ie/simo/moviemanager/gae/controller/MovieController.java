package ie.simo.moviemanager.gae.controller;

import ie.simo.moviemanager.gae.dao.MovieDao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/movie")
public class MovieController {

	//DI via Spring
	String message;
	
	MovieDao dao;
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", name);
		model.addAttribute("message", this.message);
		
		//retrun to jsp page, configurated in mvc-dispatcher-servlet.xml, view resolver
		return "list";

	}
	
	@RequestMapping(value="/topTen", method = RequestMethod.GET)
	public String getTopTen(ModelMap model) {

		model.addAttribute("result", dao.getTopMovies().toString());
		
		return "topTen";

	}
	
	public void setDao(MovieDao dao){
		this.dao = dao;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}