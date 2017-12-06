package vista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio");
		String  ruc = sc.nextLine();
		String  precio = sc.nextLine();
		
		
		
		String xml = "<dat name=\"precio\">"+ruc+"</dat> "
				+ "<precio>"+precio+"</precio>";
		
		System.out.println("XML" + xml);
		
		FileWriter fw;
		try {
			fw = new FileWriter("mi.xml");
			BufferedWriter archivo = new BufferedWriter(fw);
			archivo.append(xml);
			archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
