package com.javastringtypes.com;

public class String_Types {
	public static void main(String[] args) {
		//to find memeory reference
		String s = "Mohammed Javed";
		System.out.println(System.identityHashCode(s));
		String s1 ="Mohammed Javed";
		System.out.println(System.identityHashCode(s1));
		s = s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println();
		String s2 = "Javed ";
		System.out.println(System.identityHashCode(s2));
		String s3 = "moja";
		System.out.println(System.identityHashCode(s3));
		s2 = s2.concat(s3);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		
		//StringBuffer & StringBuilder
		StringBuffer data = new StringBuffer("Thanjavur");
		System.out.println(data);
		System.out.println(System.identityHashCode(data));
		StringBuffer file = new StringBuffer("THANJAI PERIYUDAIAAR KOVIL ");
		System.out.println(file);
		System.out.println(System.identityHashCode(file));
		file = file.append(data);
		System.out.println(file);
		System.out.println(System.identityHashCode(file));
		System.out.println();
		StringBuilder builder = new StringBuilder("PONNI NADHI PAKANUMEY ");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		StringBuilder builder1 = new StringBuilder("eeeyari aesamaari");
		System.out.println(builder1);
		System.out.println(System.identityHashCode(builder1));
		builder = builder.append(builder1);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
