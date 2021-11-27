package com.dictionaryInfo;

import java.util.*;

public class Dictionary {

	public static void main(String[] args) {
		Map<String, String> word=new HashMap<String, String>();
		word.put("Azure", "sky blue");
		word.put("Chess", "a board game");
		word.put("Book", "a written or printed work");
		word.put("PC", "a personal computer");
		word.put("Game", "an activity that one engages in for amusement or fun");
		Set<String> keys=word.keySet();
		for(String text:keys) {
			System.out.println(text+ " - "+word.get(text));
		}

	}
}
