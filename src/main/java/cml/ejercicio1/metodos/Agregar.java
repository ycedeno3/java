package cml.ejercicio1.metodos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Agregar{ 

	public boolean nuevoPaciente(Scanner test) throws IOException {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {			
			System.out.print("RUT del paciente: ");
			String rut = test.next();
			System.out.print("Nombre/s del paciente: ");
			String name = test.next();
			System.out.print("Apellido/s del paciente: ");
			String apellido = test.next();
			System.out.print("Edad del paciente: ");
			int edad = test.nextInt();
			System.out.print("Estado COVID-19 del paciente: ");
			boolean d = test.nextBoolean();
			System.out.print("Fecha de Contagio: ");
			String fecha = test.next();
			System.out.println("Se ha ingresa la siguiente información dentro del sistema:");
			System.out.println("Rut: " + rut);
			System.out.println("Nombre/s: " + name);
			System.out.println("Apellido/s: " + apellido);
			System.out.println("Edad: " + edad);
			System.out.println("Estado COVID-19: " + d);
			System.out.println("Fecha: " + fecha);
			String data = rut + ";" + name + ";" + apellido + ";" + edad + ";" + d + ";" + fecha;
			File file = new File("./listaPacientes.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.newLine();
			System.out.println("información agregada!");
			System.out.println();
			bw.close();
			fw.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			bw.close();
			fw.close();
		}
		return false;
	}
}