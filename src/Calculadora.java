import java.util.Scanner;

public class Calculadora implements iCalculadora{
	
	//@Override
	//public double Operar(String n, iStack v) {
		// TODO Auto-generated method stub
		//return 0;
	//}
	
	/* (non-Javadoc)
	 * @see iCalculadora#suma(double, double)
	 */
	@Override
	public double suma(double a, double b) {
		double c = a+b;
		return c;
	}

	/* (non-Javadoc)
	 * @see iCalculadora#resta(double, double)
	 */
	@Override
	public double resta(double a, double b) {
		double c = a-b;
		return c;
	}

	/* (non-Javadoc)
	 * @see iCalculadora#multiplicacion(double, double)
	 */
	@Override
	public double multiplicacion(double a, double b) {
		double c = a*b;
		return c;
	}

	/* (non-Javadoc)
	 * @see iCalculadora#division(double, double)
	 */
	@Override
	public double division(double a, double b) {
		double c = a/b;
		return c;
	}	

	/* (non-Javadoc)
	 * @see iCalculadora#Operar(java.lang.String, iStack)
	 */
	@Override
	public double operar(String n, iStack v) {

		Scanner leer = new Scanner(n);

		while (leer.hasNext()) {
			if (leer.hasNextInt()) {
				v.push(leer.nextInt());
			} else {
				int n2 = (int) v.pop();
				int n1 = (int) v.pop();
				String op = leer.next();

				if (op.equals("+")) {
					v.push(n1 + n2);
				} else if (op.equals("-")) {
					v.push(n1 - n2);
				} else if (op.equals("*")) {
					v.push(n1 * n2);
				} else {
					v.push(n1 / n2);
				}

			}
		}
		double a = (int) v.pop();
		return a;
	}

	
}
