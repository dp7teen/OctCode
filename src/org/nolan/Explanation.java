package org.nolan;

public class Explanation implements ChristopherNolan,ChrisNolan{

	@Override
	public void theDarkKnightRises() {
		System.out.println("Batman 3: It is the most iconic movie in the series");		
	}

	@Override
	public void thePrestige() {
		System.out.println("Prestige : It is the most enjoyable movie to me");		
	}

	@Override
	public void interstellar() {
		System.out.println("Interstellar : It is the movie which is told scientifically ever");		
	}

	@Override
	public void theBug() {
		System.out.println("The Bug : It is the ShortFilm of Nolan and it is filmed in monotonous black colour");		
	}

	@Override
	public void tenet() {
		System.out.println("Tenet : It is the most expected movie in the Industry but it does not make it");		
	}

	@Override
	public void inception() {
		System.out.println("Inception : It is were the Brain of the Nolan turned red hot and Brainstormed this concept");		
	}

	@Override
	public void batmanBegins() {
		System.out.println("Batman Begins : It is the movie about the rise of the hero.");		
	}

	@Override
	public void theDarkKnight() {
		System.out.println("The Dark Knight : It is the movie which made a mark in the industry");		
	}

	@Override
	public void memento() {
		System.out.println("Memento : It is the movie impressed many directors across the globe");		
	}

	@Override
	public void dunkirk() {
		System.out.println("Dunkirk : Salute for Nolan for his visions");		
	}
public static void main(String[] args) {
	Explanation e = new Explanation();
	e.batmanBegins();
	e.dunkirk();
	e.thePrestige();
	e.interstellar();
	e.inception();
	e.theDarkKnight();
	e.theDarkKnightRises();
	e.memento();
	e.tenet();
	e.theBug();
	
	System.out.println("=======================");
	
	ChrisNolan c = new Explanation();
	c.theBug();
	c.theDarkKnightRises();
	c.thePrestige();
	c.tenet();
	c.interstellar();
	
}
}
