package practice;

public class Anagram {
	public static void main(String[] args) {
		String s1="race";
		String s2="care";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		sortArray(arr1);
		sortArray(arr2);
		
		boolean flag=true;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}
	}
	
	public static void sortArray(char[] arr) {
		int n=arr.length;
       
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=(char) temp;
                }
            }
        }
	}
}
