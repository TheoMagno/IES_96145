package com.example.demo;

import java.util.ArrayList;

public class Show {
    private String name;
    private ArrayList<String> quotes;
    private static long idCount = 1;
    private long id;
    
    public Show (String name) {
        this.name=name;
        this.quotes=new ArrayList<String>();
        this.id=idCount++;
    }

    public void addQuote(String quote) {
        quotes.add(quote);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getQuotes() {
        return quotes;
    }

    public long getID() {
        return id;
    }

    public String getRandomQuote() {
        return quotes.get((int) (Math.random() * quotes.size()));
    }

}
