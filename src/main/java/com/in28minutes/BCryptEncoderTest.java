package com.in28minutes;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		for(int i=1; i<=10; i++) {
			String encoded = encoder.encode("password@!23@#!");
			System.out.println(encoded);
		}
		

	}

	  
}
