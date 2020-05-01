package cml.ejercicio1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import cml.ejercicio1.metodos.Agregar;
import cml.ejercicio1.metodos.LeerArchivo;

public class Menu {

	public static Scanner test = null;

	public static void main(String[] args) throws IOException {
		
		boolean salir = false;		
		while (!salir) {
			try {
			String s = "Sistema de Manejo de pacientes con COVID-19.";
			Scanner scan = new Scanner(s);
			System.out.println(scan.nextLine());
			scan.close();
			System.out.println("");
			System.out.println("--------Ingresar Información de Paciente--------");
			test = new Scanner(System.in);
			System.out.print("Ingrese RUT del paciente: ");
			String rut = test.next();
			if(new LeerArchivo().leer(rut)==false)
			{
				System.out.print("El rut: " + rut + " no existe, puede realizar las siguientes acciones en el sistema");
				System.out.println();
				System.out.println("1. Agregar       2. Salir");
				String opcionFalse;
				do {
				 opcionFalse = test.next();
				 if(!opcionFalse.equals("1")&&!opcionFalse.equals("2")){
					 System.out.println("Opcion incorrecta seleccione 1. Agregar  2. Salir");
				 }				
				}while(!opcionFalse.equals("1")&&!opcionFalse.equals("2"));
				int optFalse  = Integer.parseInt(opcionFalse);
				switch (optFalse) {
				case 1:
					if(new Agregar().nuevoPaciente(test))
					{
						System.out.println("Paciente Ingresado");
					}else {
						System.out.println("Problemas al ingresar Paciente");
					}					
					break;
				case 2:
					salir = true;
					break;
				default:
					break;
				}			
			}else {
				System.out.print("El rut: " + rut + " ya Existe, puedes realizar las siguientes acciones en el sistema");
				System.out.println();
				System.out.println("2. Modificar       3. Eliminar       4. Salir");
			}			
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un numero");
				test.next();
			}finally {
				
			}
		}
		test.close();
	}
}
