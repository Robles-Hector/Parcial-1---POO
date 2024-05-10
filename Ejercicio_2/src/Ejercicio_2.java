//package Ejercicio_2; 

import java.util.Scanner;

public class Ejercicio_2 { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int op;
		String Name, LastName;
		double grade1, grade2, grade3;
		double totalGrade;
		
		do {
			System.out.println("--MENU PRINCIPAL--");
			System.out.println("1.Calificaciones obtenidas");
			System.out.println("2. Salir");
			op = scanner.nextInt();
			
			switch (op) {
			case 1: 
				System.out.println("Ingrese el NOMBRE del estudiante: ");
				Name = scanner.next();
				
				System.out.println("Ingrese el APELLIDO del estudiante:  ");
				LastName = scanner.next();
				
				System.out.println("Ingrese la calificacion del PARCIAL 1: ");
				grade1 = scanner.nextDouble();
				
				System.out.println("Ingrese la calificacion del PARCIAL 2: ");
				grade2 = scanner.nextDouble();
				
				System.out.println("Ingrese la calificacion del PARCIAL 3: ");
				grade3 = scanner.nextDouble();
				
				totalGrade = (grade1+grade2+grade3)/3;
				
				System.out.println("Estudiante: "+Name+" "+LastName);
				System.out.println("Calificacion del PARCIAL 1: "+grade1);
				System.out.println("Calificacion del PARCIAL 2: "+grade2);
				System.out.println("Calificacion del PARCIAL 3: "+grade3);
				System.out.println("Calificacion TOTAL DEL SEMESTRE: "+totalGrade);
				
				if(totalGrade >= 14) {
					System.out.println("APROBADO");
				} else {
					System.out.println("REPROBADO");
				}
				break; 
			case 2:
				System.out.println("Saliendo del programa...");
				break;
				default:
					System.out.println("Ingrese una opcion valida (1 o 2)");
					break;
			}
		}while (op!=2);
	}
}
