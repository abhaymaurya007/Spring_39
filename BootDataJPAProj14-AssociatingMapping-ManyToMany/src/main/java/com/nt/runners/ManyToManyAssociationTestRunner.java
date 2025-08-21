package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IMovieMgmtService;

@Component
public class ManyToManyAssociationTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieMgmtService  movieService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			Movie  movie1=new Movie("RRR", "UV", "Telugu");
			Movie  movie2=new Movie("Chava", "Dharma", "marathi");
			
			Artist artist1=new Artist("Jr.NTR","hyd","hero");
			Artist artist2=new Artist("RamCharn","hyd","hero");
			Artist artist3=new Artist("Vicky","mumbai","hero");
			Artist artist4=new Artist("rashmika","bengulore","heroine");
			Artist artist5=new Artist("saif","mumbai","villian");
			
			//add childs to parents
			movie1.getArtistsInfo().add(artist1);
			movie1.getArtistsInfo().add(artist2);
			movie1.getArtistsInfo().add(artist4);
			movie1.getArtistsInfo().add(artist5);
			
			movie2.getArtistsInfo().add(artist3);
			movie2.getArtistsInfo().add(artist4);
			movie2.getArtistsInfo().add(artist5);
			//add parents to child
			artist1.getMoviesInfo().add(movie1);
			artist2.getMoviesInfo().add(movie1);
			artist3.getMoviesInfo().add(movie2);
			artist4.getMoviesInfo().add(movie1);
			artist4.getMoviesInfo().add(movie2);
			artist5.getMoviesInfo().add(movie1);
			artist5.getMoviesInfo().add(movie2);
			
			//use service
			List<Movie>  moviesList=Arrays.asList(movie1,movie2);
			String msg=movieService.registerMoviesAndArtists(moviesList);
		     System.out.println(msg);			
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		*/
		
		/*try {
			Movie  movie1=new Movie("KGF3", "hamboli", "kannada");
			Movie  movie2=new Movie("WAR2", "yashraj", "hindi");
			
			Artist artist1=new Artist("hrithik","mubai","hero");
			Artist artist2=new Artist("Jr.ntr","hyd","hero");
			Artist artist3=new Artist("Yash","bengulore","heror");
			Artist artist4=new Artist("Tripti","mumbai","heroine");
			Artist artist5=new Artist("ajay devagan","mumbai","villian");
			
			//add childs to parents
			movie1.getArtistsInfo().add(artist3);
			movie1.getArtistsInfo().add(artist5);
			movie1.getArtistsInfo().add(artist4);
			
			movie2.getArtistsInfo().add(artist1);
			movie2.getArtistsInfo().add(artist2);
			movie2.getArtistsInfo().add(artist5);
			//add parents to child
			artist1.getMoviesInfo().add(movie2);
			artist2.getMoviesInfo().add(movie2);
			artist3.getMoviesInfo().add(movie1);
			artist4.getMoviesInfo().add(movie1);
			artist4.getMoviesInfo().add(movie2);
			artist5.getMoviesInfo().add(movie1);
			artist5.getMoviesInfo().add(movie2);
			
			//use service
			List<Artist>  artistList=Arrays.asList(artist1,artist2,artist3,artist4,artist5);
			String msg=movieService.registerArtistsAndMovies(artistList);
		     System.out.println(msg);	
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*try {
		   movieService.showMoviesAndTheirArtists().forEach(movie->{
			   System.out.println("parent ::"+movie);
			   Set<Artist>  childs=movie.getArtistsInfo();
			   childs.forEach(artist->{
				   System.out.println("child::"+artist);
			   });
			   System.out.println("-------------------------------");
		   });
		}
		catch(Exception  e) {
			e.printStackTrace();
		}*/
		
		/*try {
			movieService.showArtistsAndTheirMovies().forEach(artist->{
				System.out.println("child ::"+artist);
				Set<Movie>   parents=artist.getMoviesInfo();
				parents.forEach(movie->{
					System.out.println("parnt ::"+movie);
				});
				System.out.println("----------------------");
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			String msg=movieService.removeArtistsFormMovie(100, List.of(1000,1001));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
