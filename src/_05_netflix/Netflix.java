package _05_netflix;

import javax.swing.JOptionPane;

public class Netflix {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie("The Fault in Our Stars", 3); 
		Movie movie2 = new Movie ("Divergent", 2);
		Movie movie3 = new Movie ("Coco", 4);
		Movie movie4 = new Movie ("After", 1);
		Movie movie5 = new Movie ("The Notebook", 5);
		
		System.out.println(movie1.getTicketPrice());
	
		NetflixQueue queue1 = new NetflixQueue();
		
		queue1.addMovie(movie1);
		queue1.addMovie(movie2);
		queue1.addMovie(movie3);
		queue1.addMovie(movie4);
		queue1.addMovie(movie5);
		
		queue1.sortMoviesByRating();
		System.out.println(queue1);
		
		JOptionPane.showMessageDialog(null, "The best movie is " + queue1.getBestMovie());
		JOptionPane.showMessageDialog(null,queue1.getMovie(1));
		
		
	}
	
}
