package com.raq.hellocucumber;

public class IsItFriday {
	
    public static String isItFriday(String today) {
    	if (today.equals("Friday")) {
            return "TGIF";
        }
    	if (today.equals("Monday")) {
            return "OhNo";
        }

    	return "Nope";
    } 

}
