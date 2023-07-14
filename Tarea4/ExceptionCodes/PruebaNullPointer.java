public class PruebaNullPointer{
	public static void main(String[] args){

		Figura cuadrado = null;
		System.out.println("\nFigura cuadrado = null");
		System.out.println("Se intenta el comando cuadrado.lados = 4");
		try{
			cuadrado.lados = 4;
		}catch(NullPointerException e){
			System.out.println("Se atrapo la excepcion NullPointerException");
			System.out.println("El objeto tiene como referencia null...");
		}
		System.out.println();
		

	}
}

class Figura{
	public String nombre;
	public int lados;

	public void mostrar(){
		System.out.println("Nombre: "+nombre+", lados: "+lados);
	}
}