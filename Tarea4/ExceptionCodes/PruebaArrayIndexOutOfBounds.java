public class PruebaArrayIndexOutOfBounds{
	public static void main(String[] args){
		
		int [] primos = {1, 2, 3, 5, 7, 11};
		System.out.println();

		try{
			System.out.println("Indice 6 del arreglo de primos: "+primos[6]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("\n Se produjo una excepcion.\n");
			System.out.println(" Se intento acceder al indice 6");
			System.out.println(" De un arreglo de tamanio: "+primos.length);

		}
	}
}