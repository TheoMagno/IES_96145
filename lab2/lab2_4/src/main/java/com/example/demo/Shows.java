package com.example.demo;

import java.util.ArrayList;

public class Shows {
    private ArrayList<Show> shows;

    public Shows() {
        Show StarWars = new Show("Star Wars");
	    Show EndGame = new Show("The Avengers: End Game");
	    Show TheWitcher = new Show("The Witcher 3: Wild Hunt");
        StarWars.addQuote("Luke, I'm your father!");
        StarWars.addQuote("May the force be with you!");
        StarWars.addQuote("Try not. Do… or do not. There is no try. !");
        EndGame.addQuote("Avengers, assemble!");
        EndGame.addQuote("I am inevitable.");
        EndGame.addQuote("And I... am.. Iron Man!");
        TheWitcher.addQuote("The wind's howling.");
        TheWitcher.addQuote("You don't need mutations to strip men of their humanity. I've seen plenty of examples.");
        TheWitcher.addQuote("To all things and men I appertain, and yet by some am shunned and distained. Fondle me and ogle me til you’re insane, but no blow can harm me, cause me pain. Children delight in me, elders take fright. Fair maids rejoice and spin. Cry and I weep, yawn and I sleep. Smile, and I too shall grin. What am I?");
        shows = new ArrayList<Show>();
        shows.add(StarWars);
        shows.add(EndGame);
        shows.add(TheWitcher);
    }

    public Show getRandomShow() {
        return shows.get((int) (Math.random() * shows.size()));
    }

    public ArrayList<Show> getShowList() {
        return shows;
    }

    public Show getShow(int id) {
        return shows.get(id-1);
    }

    public String getShowName(int id) {
        return getShow(id).getName();
    }
}
