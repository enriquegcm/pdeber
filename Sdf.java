package Deberes;

import java.util.Scanner;

public class Sdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tercer ejercicio
		double mont;
				Scanner sc = new Scanner(System.in); 
				System.out.println("Bienvenidos al sistema");
				System.out.println("Ingrese el monto de la compra");
		        mont= sc.nextDouble();
				System.out.println("Men�");
				System.out.println("1. Bolita Roja");
				System.out.println("2. Bolita Amarilla");
				System.out.println("3. Bolita Blanca");
				System.out.println("4.Salir");
				System.out.println("Seleccione una Opci�n");
				int op=sc.nextInt();
				switch (op){
				case 1:
					double desc= mont-(mont*0.40);
					double iva=(desc*0.12);
					double to=(desc+iva);
					System.out.println("Su total a pagar es:" +to);
					break;
				case 2:
					double desc1= mont-(mont*0.25);
					double iva1=(desc1*0.12);
					double tot=(desc1+iva1);
					System.out.println("Su total a pagar es:" +tot);
					break;
			    case 3:
			    	double iva2=(mont*0.12);
			    	double total=(mont+iva2);
			    	System.out.println("Su total a pagar es:" +total);
			    	break;
		        case 4:
		        	System.out.println("Gracias por utlizar el sistema");
			}
			}

		}