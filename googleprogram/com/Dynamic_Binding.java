package com.googleprogram.com;

public class Dynamic_Binding {  
	// it has two class, one parent and one child, same parameter and same method ,
	// invoke same method it will display as @override annotation
	// super keyword
	//it will take the method not the same implementation
	
public void day1_Monday(int duration) {
	
	System.out.println("Monday concept : JAVA INRODUCTION"+ duration);
}

public void day2_Tuesday(String task) {
	
	System.out.println("Tuesday concept:  Coding standards and Java Architecture"+ task);
}

public void day3_Wednesday(char hour) {
	
	System.out.println("Wednesday concept: ECLIPSE"+ hour);

}

public static void main(String[] args) {
	
	Dynamic_Binding data  = new Dynamic_Binding();
	 data.day1_Monday(55);
	 data.day2_Tuesday("MOST IMPORTANT TOPIC");
	 data.day3_Wednesday('1');
	 
}

}
