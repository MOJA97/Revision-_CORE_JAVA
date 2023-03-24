package com.javaException.com;

public class Runtime_Exception {
	
	public static void main(String[] args) {
		
		int j = 12;
		
		try { //same like If //execute inside the try block
			System.out.println(j/0);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Null Pointer Exception Handled");
		} catch (ClassCastException e) {
			System.out.println("Class Cast Exception Handled");
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Handled");
		}finally {
			System.exit(0); //default //it will terminate currently Running JVM
			System.out.println("Finally Block");
			
		}
		
		
		
		
		
		
		
		
		
		
		}
		}
