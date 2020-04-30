package cml.ejercicio1.metodos;

import java.awt.Menu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import cml.ejercicio1.entidad.Paciente2;

public class Agregar {

	public void nuevoPaciente() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("RUT del paciente: ");
		String rut = in.next();
		System.out.print("Nombre/s del paciente: ");
		String name = in.next();
		System.out.print("Apellido/s del paciente: ");
		String apellido = in.next();
		System.out.print("Edad del paciente: ");
		int edad = in.nextInt();
		System.out.print("Estado COVID-19 del paciente: ");
		boolean d = in.nextBoolean();
		System.out.print("Fecha de Contagio: ");
		String fecha = in.next();
		System.out.println("Se ha ingresa la siguiente información dentro del sistema:");
		System.out.println("Rut: " + rut);
		System.out.println("Nombre/s: " + name);
		System.out.println("Apellido/s: " + apellido);
		System.out.println("Estado COVID-19: " + d);
		System.out.println("Fecha: " + fecha);
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			String data = rut + ";" + name + ";" + apellido + ";" + d + ";" + fecha;
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
//DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
//System.out.println("Fecha: " + formatoFecha.format(date));
// @SuppressWarnings("deprecation")
//Date date = new Date(0, 0, 0);   
//System.out.println("Se ha ingresa la información dentro del sitema");
//	Date date = (java.sql.Date) Calendar.getInstance().getTime();
//	// Display a date in day, month, year format
//	DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//	String today = formatter.format(date);
//	System.out.println("Today : " + today);
//EjecutorYordany ejecutor = new EjecutorYordany();
//ejecutor.archivo();