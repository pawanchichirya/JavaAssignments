package practice;
public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="international";
		String op="";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(op.indexOf(ch)<0){
			    op+=ch;
			}
		}
		System.out.print(op);
	}
}