package world.micks;

import world.micks.api.Anime;

public class Jikan4j {

	private static void printExemple() {
		
		Anime anime = new Anime("azur lane");
		
		System.out.println(anime.getImage());
		System.out.println(anime.getTitle());
		System.out.println(anime.getSynopsis());
		System.out.println(anime.isAiring());
		System.out.println();
		System.out.println(anime.getType().getType());
		System.out.println(anime.getRating());
		System.out.println();
		System.out.println(anime.getStartDate());
		System.out.println(anime.getEndData());
		System.out.println();
		System.out.println(anime.getMalId());
		System.out.println(anime.getMalMemberCount());
		System.out.println(anime.getMalUrl());
		System.out.println(anime.getMalScore());
		System.out.println();
		System.out.println(anime.getRequestHash());
		System.out.println(anime.hasRequestCached());
		System.out.println(anime.getRequestCacheExpiry());
		
	}

	/** { Used for debugging. }
	public static void main(String[] args) {
		printExemple();
	}*/
	
}