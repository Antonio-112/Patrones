package util;

/*
 * Creado por Antonio
 */
public class Patrones {

	//Patron numero 1
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
	
	//Patron numero 2
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
	//Patron numero 3
	public void Patron3(int n) {
		int x = 0;
		for(int i=n;i>0;i--) {
			x +=1;
			for(int j=0;j<n;j++) {
				if(j==i-1) System.out.printf("x");
				else if(j==x-1) System.out.printf("x");
				else System.out.printf(" ");
			}
			System.out.println("");
		}

	}
	
	//Patron numero 4
	public void Patron4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(!(i==n-1) & j==n-1) System.out.printf(" ");
			else if(!(i==0) & j==0) System.out.printf(" ");
			else System.out.printf("*");
			}
			System.out.println("");
		}

	}

}
