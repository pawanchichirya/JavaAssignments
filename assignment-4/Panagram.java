package practice;

public class Panagram {
	public static void main(String[] args) {
		boolean flag=false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s1=s1.replace(" ", "");
		
		char[] chArray=s1.toCharArray();
		
		int[] arr=new int[26];
		
		for(int i=0;i<chArray.length;i++)
		{
			int index=chArray[i]-65;
			arr[index]++;
		}
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("pangram");
		}
	}
}
