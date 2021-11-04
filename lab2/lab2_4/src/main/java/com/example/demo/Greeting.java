package com.example.demo;

public class Greeting {

	private final long showId;
	private final String content;
	private final String showName;

	public Greeting(long showId, String content, String showName) {
		this.showId = showId;
		this.content = content;
		this.showName=showName;
	}

	public long getId() {
		return showId;
	}

	public String getContent() {
		return content;
	}

	public String getName() {
		return showName;
	}
}
