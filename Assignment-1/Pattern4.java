
public class Pattern4 {
	public static void main(String[] args) {
		int rows=8;
		int columns=14;
		for(int i=0; i<rows; i++ ) {
			for(int j=0;j<columns;j++) {
				if(i==rows-1 ||i==rows-2 || j==0 || j==columns-1 || i>=j || i+j>=columns-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
