package practice;

public class UniqueCharacters {
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		String op="";
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					char ch=s.charAt(i);
					if(op.indexOf(ch)<0){
						op+=s.charAt(i);
						break;
					}
					break;
				}
			}
		}
		if(op.length()>0){
			System.out.println("given string doesnt contain all unique characters");
		}
		else{
			System.out.println("given string contains all unique characters");
		}
	}
}
