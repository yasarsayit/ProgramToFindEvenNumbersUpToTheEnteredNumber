package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		int k , total=0 , number=0 , avg=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter the number: ");
		k = scanner.nextInt();
		
		for(int i=0; i<=k; i++) {
		
		if((i % 3 ==0) && (i % 4 == 0)) {
		System.out.println(i);
		
		total +=i ;
		number++;
		
		}
	}
	    avg = total / (number-1);
	    /* 0 dahilliğini kaldırmak için -1 yaptık */
		
	    System.out.print(" Average: "+ avg);	
	}

}
