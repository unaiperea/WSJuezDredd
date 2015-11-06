package com.ipartek.formacion.test.ws;

import java.util.Random;
import java.util.Vector;
/**
 * represents the law...
 * 
 * @author Pello Xabier Altadill Izura
 * @greetz picajosians
 */
public class DreddSays {
	private Vector<String> quotes = new Vector<String>();
	private Random random = new Random();
	/**
	 * default constructor
	 */
	public DreddSays() {
		init();
	}
	/**
	 * inits quotes
	 */
	private void init() {
		quotes.add("Compile error: automatic fail.");
		quotes.add("Unit test error: automatic fail.");
		quotes.add("Stallone is not the law. I'm the law.");
		quotes.add("You have been warned.");
		quotes.add("Judgement time...");
	}
	/**
	 * gets random phrase from quote vector
	 * 
	 * @return random quote
	 */
	public String randomQuote() {
		return quotes.get(random.nextInt(quotes.size()));
	}
}