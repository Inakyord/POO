public class PruebaArithmetic{
	public static void main(String[] args){
		int a = 0;
		int b = 2;
		int c = -1;

		try{
			System.out.println("\n Valores:\n a = 0\n b = 2\n c = -1");
			System.out.println(" Se calculara c = b/a...");
			c = b/a;
		}catch (ArithmeticException e){
			System.out.println("\n Se produjo una excepcion.\n No se pudo modificar c.");

		}

		System.out.println(" Impresion de "+b+" entre "+0+ " es = "+c);
	}
}