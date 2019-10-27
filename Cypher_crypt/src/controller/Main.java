package controller;

public class Main {

	public static void main(String[] args) {
//		declaration of Strings
		String password;
		password ="test";
		String password_crypte;
//		tools to ecrypt the String
		password_crypte=tools.tools_crypt.encrypt(password);
		System.out.println(password_crypte);
//		results : test====>DUCD
//		lt's decrypt "DUCD"
		String password_decrypt;
		password_decrypt=tools.tools_crypt.decrypt(password_crypte);
		System.out.println(password_decrypt);
//		results it's "test"
		
		
		
		

	}

}
