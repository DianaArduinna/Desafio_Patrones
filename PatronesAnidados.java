package patronesanidados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {
		System.out.println();
		imprimirMenu();
		System.out.println();
	}
	

	// --------------Menu

	static void imprimirMenu() { // metodo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el tamano de la figura :");
		
		int n = sc.nextInt();
				
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardar la opcion del usuario
        
 
        while (!salir) {
        	
        	System.out.println();
            System.out.println("1. Patron Cuadro");
            System.out.println("2. Patron Z");
            System.out.println("3. Patron X");
            System.out.println("4. Patron Miscelaneo");
            System.out.println("5. Salir");
            System.out.println();
 
            try {
 
                System.out.println("Elija la figura que desea");
                System.out.println();
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Cuadrado");
                        System.out.println();
                        printPatron1(n);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la figura Zeta");
                        printPatron2(n);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la figura X");
                        System.out.println();
                        printPatron3(n);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Has seleccionado Miscelaneo");
                        System.out.println();
                        printPatron4(n);
                        System.out.println();
                        break;
                    case 5:
                    	System.out.println("Bye, bye XD");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        sn.close();
        sc.close();

	}
	
	

	// --------------patron 1 -------

	private static void printPatron1(int n) {

		int i, j;
		if (n==1) {
            System.out.printf("*");
        }
	 else {

		for (i = 0; i < n; i++) {

			System.out.printf("*");
		}
		System.out.print("\n");

		for (j = 0; j < n - 2; j++) {
			System.out.printf("*");

			for (i = 0; i < n - 2; i++) {
				System.out.printf(" ");
			}

			System.out.printf("*");
			System.out.printf("\n");
		}

		for (i = 0; i < n; i++) {

			System.out.printf("*");
		}
		System.out.printf("\n");

	}
	}
	
	private static void printPatron2(int n) {
		int i,j;
		for (i=0; i<n; i++) {  //linea 1
			System.out.printf("*");
		}
		System.out.printf("\n");

		for (j=0; j<n-2; j++) {   //Columna
			System.out.printf(" ");
			for (i=3; i<n-j; i++) {  // Linea
				System.out.printf(" ");
			}
			System.out.printf("*");
			System.out.printf("\n");
		}
		
		if (n>1) {
			for (i=0; i<n; i++) {
				System.out.printf("*");
				
			}
			System.out.printf("\n");
		}
		
	}
	
	private static void printPatron3(int n) {
		int i,j;
		for(i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				if (i==j || i+j==n-1) {
					System.out.printf("x");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	private static void printPatron4(int n) {
		
		int i, j;
		
		if (n == 1) {
			System.out.printf("*");
		} else {

			// parte superior

			for (i=0; i<n; i++) { // fila

				System.out.printf("*");
			}
			System.out.print("\n");

			// Parte central
			for (j = 0; j < n - 2; j++) {
				System.out.printf(" ");
				for (i = 0; i < n - 1; i++) {
					System.out.print("*");

				}
				System.out.print("\n");

			}

		
		// parte inferior
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(" ");
			}

			System.out.printf("*");
		}
		System.out.printf("\n");

	
		
	}
}
	}


