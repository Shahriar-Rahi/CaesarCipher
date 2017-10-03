package encry.cse.ru;

public class WordPlay{
	
	public static void main(String[] args){
		System.out.println(replaceVowels("Hello World", '+'));
		System.out.println(emphasize("dna ctgaaactga", 'a'));
	}
	
	static boolean isVowel(char ch){
		if(ch== 'a' || ch == 'A' ||
			ch == 'e' || ch == 'E' ||
			ch == 'i' || ch == 'I' ||
			ch == 'o' || ch == 'O' ||
			ch == 'u' || ch == 'U'){
				return true;
		}
		else{
			return false;
		}
	}
	
	static String replaceVowels(String ret, char ch){
		String str = new String();
		for(int i=0; i<ret.length(); i++){
			if(isVowel(ret.charAt(i)) == true){
				str += ch;
			}
			else{
				str += ret.charAt(i);
			}
		}
		return str;
	}
	
	static String emphasize(String phrase, char ch){
		String str = new String();
		for(int i=0; i<phrase.length(); i++){
			if(phrase.charAt(i) == ch){
				if(i%2 == 0){
					str += '*';
				}
				else{
					str += '+';
				}
			}
			else{
				str += phrase.charAt(i);
			}
		}
		return str;
	}
	
}