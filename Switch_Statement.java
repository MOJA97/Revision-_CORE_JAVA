package com.SelectionorConditionStatement;

public class Switch_Statement {
	// Similar like if and else statement
	// key and value will be here
	// key represents = variable name
	// value represents variable value
	// after every case we must give break; keyword
	
	public static void main(String[] args) {
		
//		int i = 13;
		int i = 12;
		
		switch (i) { //i = variable name = key
		case 20:
			System.out.println("Valid Number");
			break;
		case 12:
			System.out.println("Value is 12");
			break;
		case 13:
			System.out.println("Value is 13");
			break;
			
		default:  // similar like else
			System.out.println("invalid data");
			break;
		}
		
		
	}

}
