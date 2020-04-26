package cml.ejercicio1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import cml.ejercicio1.metodos.Agregar;

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
			int rut = in.nextInt();		
			
//			try (FileWriter fw = new FileWriter("./prueba.txt");
//					FileReader fr = new FileReader("./prueba.txt")) {
//				// Escribimos en el fichero un String y un caracter 97 (a)
//				fw.write(rut);
////				fw.write(97);
//				// Guardamos los cambios del fichero
//				fw.flush();
//				// Leemos el fichero y lo mostramos por pantalla
//				int valor = fr.read();
//				while (valor != -1) {
//					System.out.print(rut);
//					valor = fr.read();
//				}
//			} catch (IOException e) {
//				System.out.println("Error E/S: " + e);
//			}
//			Ejecutor ejecutor = new Ejecutor();
//			Ejecutor.main(rut);
//			System.out.println("Ingrese un dato tipo numerico");
//			ejecutor.main(args);
//			System.out.println("Rut: " + rut);
			System.out.println("1. Agregar	2. Modificar	3. Eliminar	4. Salir");

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
