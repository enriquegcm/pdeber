package Deberes;
import java.util.Scanner;
public class Asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2 ejercicios
			Scanner sc=new Scanner(System.in);
					int i;
					double acum=0;
					int acum1=0;
					System.out.println("Bienvenidos al sistema");
					System.out.println("Ingrese las 50 notas, por favor");
					double [] num =new double[50];
					for (i=0;i<50;i++){
						acum1++;
						System.out.println("Ingrese las nota "+acum1);
						num [i] = sc.nextDouble();
						acum=acum+num [i];
					}
					acum=acum/50;
					System.out.println("Promedio es: " +acum);
					if (acum<7){
						System.out.println("Esta reprobado");
					}else if(acum>=7){
						System.out.println("Esta aprobado");
					}
				}

			}
