public class PruebaStringIndexOutOfBounds{
	public static void main(String[] args){
		
		String hola = "Hola amigo.";

		try{
			System.out.println(hola.charAt(11));
		}catch (StringIndexOutOfBoundsException e){
			System.out.println("\n Se produjo una excepcion.\n");
			System.out.println(" Se intento obtener caracter 11");
			System.out.println(" De un String de tamanio: "+hola.length());

		}
	}
}