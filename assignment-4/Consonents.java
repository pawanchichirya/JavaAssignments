package practice;

public class Consonents {
	public static void main(String[] args) {
		int consonent=0, vowel=0, special=0;
		String str="pawan@#$chichriya";
	    for (int i=0;i<str.length();i++) {
	        char ch =str.charAt(i);
	        if ((ch>='a' && ch <='z') || (ch>='A' && ch<='Z')){
	            ch=Character.toLowerCase(ch);
	            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	                vowel++;
	            else
	                consonent++;
	            }
	        else
	            special++;
	        }
	    System.out.println("consonent: " + consonent);
	    System.out.println("vowels: " + vowel);
	    System.out.println("special characters: " + special);
	}
}
