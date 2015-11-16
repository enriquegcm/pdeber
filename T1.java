package Deberes;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		//primer ejercicio
		Scanner sc=new Scanner(System.in);
				int i,N;
				double acum=0;
				int acum1=0;
				System.out.println("Bienvenidos al sistema");
					System.out.println("Ingrese el número de cuantos alumnos se promediará:");
					N = sc.nextInt();
				double [] num =new double[N];
				for (i=0;i<N;i++){
					acum1++;
					System.out.println("Ingrese la nota del alumno "+acum1);
					num [i] = sc.nextDouble();
					acum=acum+num [i];
				}
				acum=acum/N;
				System.out.println("El promedio es: " +acum);

			}

		}


		
		
