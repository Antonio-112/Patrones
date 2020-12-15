package util;

public class Patrones {
	
	public void Patron1(int n) {	
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j =0;j<n;j++) {
				if(i==0 || i==n-1) System.out.printf("*");
				else if((i>0 || i<n)&(j==0 || j==n-1)) System.out.printf("*");
				else System.out.printf(" ");
			}
		}
		System.out.println();
	}
	
	public void Patron2(int n) {
		for(int i=0;i<n;i++) System.out.printf("*"); 
		System.out.println();
		for(int i=n;i>2;i--) {
			for(int j=0;j<n;j++) {
				if(j==i-2) System.out.printf("*");
				else System.out.printf(" ");
			}
			System.out.println("");
		}
		for(int i=0;i<n;i++) System.out.printf("*");
		System.out.println();
	}

}
