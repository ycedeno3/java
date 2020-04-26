package cml.ejercicio1.metodos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import cml.ejercicio1.entidad.Paciente2;

public class EjecutorYordany {

	public void archivo() throws IOException {
		InputStream is = null;
		int i;
		char c;
		try {
			// new input stream created
			is = new FileInputStream("./listaPacientes.txt");
			StringBuilder sb = new StringBuilder();
			// reads till the end of the stream
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
				System.out.print(paciente2.getRut());
				System.out.print("|");
				System.out.print(paciente2.getNombre());
				System.out.print("|");
				System.out.print(paciente2.getApellido());
				System.out.print("|");
				System.out.print(paciente2.getEdad());
				System.out.print("|");
				System.out.print(paciente2.getFechaDeContagio());
				System.out.println();
			}

		} catch (Exception e) {
			// if any I/O error occurs
			System.out.println(e);
		} finally {
			// releases system resources associated with this stream
			if (is != null)
				is.close();
		}
	}
}
