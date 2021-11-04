package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	private static final String template = "%s";
    public static Shows shows = new Shows();
	

	@GetMapping("/quote")
	public Greeting quote() {
        Show show = shows.getRandomShow();
        String quote = show.getRandomQuote();
		return new Greeting(show.getID(), String.format(template, quote), show.getName());
	}

    @GetMapping("/shows")
    public ArrayList<Show2> showsList() {
        ArrayList<Show2> showsList = new ArrayList<Show2>();
        for (Show show: shows.getShowList()) {
            Show2 show2 = new Show2(show.getName(), show.getID());
            showsList.add(show2);
        }
        return showsList;
    }

    @GetMapping("/quotes")
    public Greeting quoteFrom(@RequestParam(value = "show", defaultValue = "1") int id) {
        String quote = shows.getShow(id).getRandomQuote();
        return new Greeting(id, quote, shows.getShowName(id));
    }
}