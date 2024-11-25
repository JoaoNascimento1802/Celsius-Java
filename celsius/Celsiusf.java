package celsius;
import java.util.Scanner;
public class Celsiusf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Insira a Temperatura em Celsius :");
		double Celsius = scn.nextDouble();
		
		System.out.print("A temperatura em Kelvin é : " + (Celsius + 273.15 ));
		System.out.print("A temperatura em Fahrenheit é : " + ((Celsius * 1.8) + 32));
		
		
		
		

	}

}
