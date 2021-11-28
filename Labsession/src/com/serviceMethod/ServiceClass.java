package com.serviceMethod;

import java.util.Random;

public class ServiceClass {

	
	public String generateEmail(String firstname, String lastname,String department) {
		return firstname+lastname+"@"+department+".greatlearning.com";
		
	}
	public String generatepassword() {
		
		String capitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletter="abcdefghijklmnopqrstuvwxyz";
		String number="123456789";
		String SpecialChar="!@#$%^&*()";
		String value=capitalLetter+smallletter+number+SpecialChar;
		
		Random random=new Random();
		char[] password=new char[8];
		for(int i = 0;i<8;i++) {
			password[i]=value.charAt(random.nextInt(value.length()));
			
		}
		return String.copyValueOf(password);
				
	}
	
	public String showcredential(String firstname) {
		
		System.out.println("Dear"+" "+firstname+" "+"your generated credential as follows");
		return null;

	}
}
