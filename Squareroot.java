package newJava;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=0;
		for(int i=0;i<=n;i++) {
			if(i*i<=n) {
				 ans=i;
			}
		}
		
   System.out.println(ans);
	}

}
