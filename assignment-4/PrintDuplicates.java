package practice;

public class PrintDuplicates {
	public static void main(String[] args) {
		String s="international";
		String op="";
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					char ch=s.charAt(i);
					if(op.indexOf(ch)<0){
						op+=s.charAt(i);
					}
					break;
				}
			}
		}
		System.out.println(op);
	}
}
