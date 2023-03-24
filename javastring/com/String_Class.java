package com.javastring.com;
public class String_Class {
	/// serialized, comparable and charSEQUENCE INTERFACE //// string refName = "Value";
	// string functions
	// ref.length(); //return type is integer and default value is 0
	public static void main(String[] args) {
		String s = "Jon Snow the king in the north ";
		int length = s.length();
		System.out.println("Length:" + length);
		int index = s.length() - 1; // return type is integer and default value is 0
		System.out.println("Index:" + index);
		boolean equals = s.equals("Jon Snow the king in the north");
		System.out.println("Equal or ot equal:" + equals); // it is false because case sensitive
		boolean equals2 = s.equals("jon snow the king in the north");
		System.out.println("Equal or not:" + equals2);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Jon Snow the king in the north");
		System.out.println("Checking condition:" + equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println("UPPERCASE:" + upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println("lowercase:" + lowerCase);
		char charAt = s.charAt(9);
		System.out.println("specific letter:" + charAt);
		System.out.println();
		int indexOf = s.indexOf('o');
		System.out.println("First Index:" + indexOf);
		int lastIndexOf = s.lastIndexOf('o');
		System.out.println("Last Index:" + lastIndexOf);
		boolean contains = s.contains("the");
		System.out.println("contains or not:" + contains);
		boolean startsWith = s.startsWith("Jon"); // prefix
		System.out.println("String starts with:" + startsWith);
		boolean endsWith = s.endsWith("rth");
		System.out.println("String ends with:" + endsWith);
		String trim = s.trim();
		System.out.println("unwanted space:" + trim);
		String replace = s.replace('o', 'a');
		System.out.println("Replaced String characters:" + replace);
		String concat = s.concat("AEGON TARGARYEN");
		System.out.println("Spoiler alert:" + concat);
		String substring = s.substring(4);
		System.out.println("Elements starts with:" + substring);
		CharSequence subSequence = s.subSequence(9, 31);
		System.out.println("Elements upto:" + subSequence);
		String join = s.join("-", "season", "7", "episode", "3", "Jon Snow meets Dracarys");
		System.out.println(join);
		// join is a static so here without extends
		// ClassName.methodName();
		// ClassName.variableName;

	}

}
