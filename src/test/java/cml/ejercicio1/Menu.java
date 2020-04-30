package cml.ejercicio1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import cml.ejercicio1.metodos.Agregar;
import cml.ejercicio1.metodos.LeerArchivo;

public class Menu {

	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		boolean agregar = false;
		boolean salir = false;
		int opcion;

		while (!salir) {
			String s = "Sistema de Manejo de pacientes con COVID-19.";
			Scanner scan = new Scanner(s);
			System.out.println(scan.nextLine());
			scan.close();
			System.out.println("");
			System.out.println("--------Ingresar Información de Paciente--------");
			scan.close();
			Scanner in = new Scanner(System.in);
			System.out.print("Ingrese RUT del paciente: ");
			String rut = in.next();		
			
			LeerArchivo ejecutor = new LeerArchivo();
			ejecutor.leer(rut);
			
			try {
				System.out.println("Digite el numero de la opcion que desea relaizar: ");
				opcion = sn.nextInt();
				switch (opcion) {

				case 1:
					agregar = true;
					System.out.println("Ingresa datos del Paciente: ");
					Agregar r = new Agregar();
					r.nuevoPaciente();
					break;
				case 2:
					System.out.println(
							"El paciente  ya esta ingresado, Desea modificar los datos del paciente:");
					break;

				case 3:
					System.out.println("Deseas eliminar al Paciente: ?");
					break;

				case 4:
					salir = true;
					System.out.println("Has salido del sistema");
					break;

				default:
					System.out.println("Opcion incorrecta, por favor selecciona una opcion valida");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un numero");
				sn.next();
			}
		}
	}
}
