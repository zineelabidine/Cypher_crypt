package tools;

public class tools_crypt {
//	function to encrypt Strings 
	 public static String encrypt(String password){
//		 declaration of string
	        String crypte="";
	        for (int i=0; i<password.length();i++)  {
	            int c=password.charAt(i)^48; 
	            crypte=crypte+(char)c;
	        }
//	        return the sTring enrytpted
	        return crypte;
	    }
//	 function to decrypt Strings 
	   public static String decrypt(String password){
//		   declaration of the sTring
	        String crypt="";
	        for (int i=0; i<password.length();i++)  {
	            int c=password.charAt(i)^48; 
	            crypt=crypt+(char)c;
	        }
//	        return String decrypted 
	        return crypt;
	    }

}
