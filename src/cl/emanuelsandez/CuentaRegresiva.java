//Programa que realiza la cuenta regresiva 
package cl.emanuelsandez;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class CuentaRegresiva {

	public static void main(String[] args) {
		int i;
		System.out.println("Bienvenido a cuenta regresiva, ingrese un valor para iniciar");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		while (i > 0) { //cuando lleguemos a cero terminamos.
		System.out.printf("%d\n",i);
		i--; //en cada iteración descontamos 1
		try {
		TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
sc.close();
	}

}
