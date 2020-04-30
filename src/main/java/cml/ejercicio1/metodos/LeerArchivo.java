package cml.ejercicio1.metodos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import cml.ejercicio1.entidad.Paciente2;

public class LeerArchivo {

	public void leer(String rut) throws IOException {
		InputStream is = null;
		int i;
		char c;
		try {
			is = new FileInputStream("./listaPacientes.txt");
			StringBuilder sb = new StringBuilder();
			List<Paciente2> listaPaciente = new ArrayList<Paciente2>();
			int columna = 0;
			Paciente2 paciente = new Paciente2();
			String string;
			while ((i = is.read()) != -1) {
				c = (char) i;
				if (!(c == ';') && !(c == '\n')) {
					sb.append(c);
				} else {
					string = sb.toString().trim();
					if (columna == 0) {
						paciente.setRut(string);
					}
					if (columna == 1) {
						paciente.setNombre(string);
					}
					if (columna == 2) {
						paciente.setApellido(string);
					}
					if (columna == 3) {
						paciente.setEdad(string);
					}
					if (columna == 4) {
						paciente.setEstadoCovid(string);
					}
					if (columna == 5) {
						paciente.setFechaDeContagio(string);
					}
					columna++;
					sb = new StringBuilder();
				}
				if (columna == 6) {
					listaPaciente.add(paciente);
					paciente = new Paciente2();
					columna = 0;
				}
			}
			for (Paciente2 paciente2 : listaPaciente) {
				if (rut.contains(paciente2.getRut())) {
					System.out.print("El rut: " + rut + " ya Existe, puedes realizar las siguientes acciones en el sistema");
					System.out.println();
					System.out.println("2. Modificar       3. Eliminar       4. Salir");
					break;
				} else {
//					System.out.print(paciente2.getRut());
//					System.out.print("|");
//					System.out.print(paciente2.getNombre());
//					System.out.print("|");
//					System.out.print(paciente2.getApellido());
//					System.out.print("|");
//					System.out.print(paciente2.getEdad());
//					System.out.print("|");
//					System.out.print(paciente2.getFechaDeContagio());
//					System.out.println();
				}
			}
			System.out.print("El rut: " + rut + " no existe, puede realizar las siguientes acciones en el sistema");
			System.out.println();
			System.out.println("1. Agregar       4. Salir");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (is != null)
				is.close();
		}
	}
}