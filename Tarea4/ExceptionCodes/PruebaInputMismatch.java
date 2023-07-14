import java.util.Scanner;

public class PruebaInputMismatch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un entero: ");
		sc.nextInt();

		String a = "4.44";
		int b = Integer.parseInt(a);
	}
}