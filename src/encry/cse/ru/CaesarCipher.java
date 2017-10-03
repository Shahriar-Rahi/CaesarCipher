package encry.cse.ru;

import edu.duke.*;

public class CaesarCipher {

	static String encrypt(String input, int key){
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<input.length(); i++){
			char code;
			boolean smaller = false; 
			char c = input.charAt(i);
			if(Character.isLowerCase(c)){
				c = Character.toUpperCase(c);
				smaller = true;
			}
			if(Character.isLetter(c) && (c+key>90)){
				code = (char)((c+key) - 26);
			}
			else if(Character.isLetter(c)){
				code = (char)(c+key);
			}
			else{
				code = c;
			}
			if(smaller == true){
				ret.append(Character.toLowerCase(code));
			}
			else{
				ret.append(code);
			}
		}
		return ret.toString();
	}
	
	static String encryptTwoKeys(String input, int key1, int key2){
		StringBuilder ret = new StringBuilder();
		int key;
		for(int i=0; i<input.length(); i++){
			if(i%2 == 0){
				key = key1;
			}
			else{
				key = key2;
			}
			char code;
			boolean smaller = false; 
			char c = input.charAt(i);
			if(Character.isLowerCase(c)){
				c = Character.toUpperCase(c);
				smaller = true;
			}
			if(Character.isLetter(c) && (c+key>90)){
				code = (char)((c+key) - 26);
			}
			else if(Character.isLetter(c)){
				code = (char)(c+key);
			}
			else{
				code = c;
			}
			if(smaller == true){
				ret.append(Character.toLowerCase(code));
			}
			else{
				ret.append(code);
			}
		}
		return ret.toString();
	}
	
	static void testCaeser(String filename, int key){
		FileResource fr = new FileResource(filename);
		String message = fr.asString();
		String encrypted = encrypt(message, key);
		System.out.println("key is " + key + "\n" + encrypted);
	}
	
	public static void main(String[] args){
		System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
		System.out.println(encryptTwoKeys("First Legion", 23, 17));
	}
	
	
}
