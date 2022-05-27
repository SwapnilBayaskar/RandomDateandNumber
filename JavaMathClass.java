package com.MathClass;

public class JavaMathClass {
	
	public void calculateMaxBetweenTwoNos(int intNum1, int intNum2) {
		
		int intMaxNum = Math.max(intNum1, intNum2);
		System.out.println("Maximum Number is : "+intMaxNum);
	}
	
	public void calculateSquareRootUsingMath(int intNum) {
		
		double doubleSqrt = Math.sqrt(intNum);
		System.out.println("Square root of "+intNum+" : "+doubleSqrt);
	}
	
	public void printPowerOfNumber(int intNum, int intPower) {
		
		double doublePowerNum = Math.pow(intNum, intPower);
		System.out.println(intNum+" power to the "+intPower+" is : "+doublePowerNum);
	}
	
	public void roundOfToNearestDecimal(double doubleNum) {
		
		long longRoudedNum = Math.round(doubleNum);
		System.out.println("Rounded off value of a Number : "+longRoudedNum);
	}
	
	public void useCeilFunction(double doubleNumber) {
		
		double doubleCeilValue = Math.ceil(doubleNumber);
		System.out.println("Ceil value of a number : "+doubleCeilValue);
	}

}
