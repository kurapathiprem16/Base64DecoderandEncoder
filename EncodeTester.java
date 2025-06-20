package com.test.pratice.constants;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodeTester {
	
	public static void main(String[] arg) {
		
		BCryptPasswordEncoder bycryot = new BCryptPasswordEncoder();
		
		System.out.println(bycryot.matches("johnCENA12", "$2a$10$B3t7ZmT3qD9qvJ9mmhYLDu.69G5byB2WLO/AgPzxyGIJYRmLgLpm2"));
	}
	


}
