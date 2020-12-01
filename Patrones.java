package patrones;

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero :");
		int n = sc.nextInt();
		int i;
		System.out.println("Su patron es :");

		sc.close();
		for (i = 0; i <= n%4; i++) {
			if (i % 4 == 0)
				System.out.printf("*.*.*");
			else
				System.out.printf(".*.*");
		}
		System.out.printf("\n");

		for (i = 0; i < n; i++) {
				if (i % 4 == 0) 
					
					System.out.print("1234");
				else
					System.out.print("1234");
				
			}

			System.out.printf("\n");

			for (i = 0; i < n; i++) {
				if (i % 2 == 0)
					System.out.printf("||*||*");
				else
					System.out.printf("||*||*");
			}

			System.out.printf("\n");

		}

	}




