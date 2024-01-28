package com.id.BackOffice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		 
			String encodedString = encoder.encode("imen");
			System.out.println(encodedString);
	 
		
		// TODO Auto-generated method stub

	}


}
