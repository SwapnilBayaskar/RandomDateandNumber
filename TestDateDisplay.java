package com.DateAndTime;

public class TestDateDisplay extends UtilityClass {
	
	public static void main(String[] args) {
		
		UtilityClass objDateDisplay = new UtilityClass();
		
		objDateDisplay.showCurrentDateAndTime(displayCurrentDateUsingDateClass());
		
		objDateDisplay.setCurrentDateAndTimeDDMMYYYY(getCurrentDateddmmyyyy());
		
		objDateDisplay.setCurrentDateAndTimeMMDDYYYY(getCurrentDatemmddyyyy());
		
		objDateDisplay.setRandomNumber(getRandomNumber(8));
	

	}
}
