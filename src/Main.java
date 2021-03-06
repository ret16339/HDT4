import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Mar�a Mercedes Retolaza Reyna, 16339 
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{

		Calculadora c = new Calculadora();
		BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
		String linea = br.readLine();

                StackFactory f = new StackFactory();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de la implementacion que desea utilizar: ");
		System.out.println("1. ArrayList");
		System.out.println("2. Vector");
		System.out.println("3. Lista Simple");
		System.out.println("4. Lista Doble");
		System.out.println("5. Lista Circular");
		System.out.println("6. Salir");
		int seleccion = teclado.nextInt();

		switch (seleccion) {
			case 1:
				iStack v = f.getStack("AL");
                                double a = c.operar(linea, v);
                                System.out.println(a);
				break;
			case 2:
				v = f.getStack("V");
                                a = c.operar(linea, v);
                                System.out.println(a);
				break;
			case 3:
				v = f.getStack("LS");
                                a = c.operar(linea, v);
                                System.out.println(a);
				break;
			case 4:
				v = f.getStack("LD");
                                a = c.operar(linea, v);
                                System.out.println(a);
				break;
			case 5:
				v = f.getStack("LC");
                                a = c.operar(linea, v);
                                System.out.println(a);
				break;
			case 6:
				System.out.println("Puede Retirarse");

				System.exit(0); 

				break;
			default:
				System.out.println("Porfavor Elija algo del men�: ");
		}

		

	}
}