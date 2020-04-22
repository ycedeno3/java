package cml.ejercicio1.metodos;

import java.util.Scanner;

public class Opciones {

	
	public void consultacovid() {
		 Scanner scan = new Scanner(System.in);
		 String resultado;
		 do {
		 System.out.println("Es covit positivo diga SI o NO");
		 resultado = scan.next();
		 }while(!resultado.equals("SI")&&!resultado.equals("NO"));
		 scan.close();
	}
}
