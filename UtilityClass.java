package com.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UtilityClass extends DateDisplayMethods {
	
	public static String displayCurrentDateUsingDateClass() {
		
		Date objDate = new Date();
		
		SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
				
		String strCurrentDate = objSimpleDateFormat.format(objDate);
		
		return strCurrentDate;
	}
	
	
	public static String getCurrentDateddmmyyyy() {
		
		Date objDate = new Date();
		
		SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
		
		String strCurrentDate = objSimpleDateFormat.format(objDate);
		
		return strCurrentDate;
	}
	
	
	public static String getCurrentDatemmddyyyy() {
		
		Date objDate = new Date();
		
		SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("E MM.dd.yyyy 'at' hh:mm:ss a zzz");
		
		String strCurrentDate = objSimpleDateFormat.format(objDate);
		
		return strCurrentDate;
	}
	
	
	public static String getRandomNumber(int intLength) {

		String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
			
			int intNum= (int) Math.floor(Math.random()*allowChars.length());
			randomString+=allowChars.substring(intNum, intNum+1);
		}
		
		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};
		
		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		
		return strRandomDigit+randomString;
		
		
	}
	

}
