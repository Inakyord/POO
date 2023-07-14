public class PruebaClassNotFound{
	public static void main(String[] args){

		System.out.println("Se declara Figura cuadro = new Figura();");
		try{
			Figura cuadro = new Figura();
			System.out.println(cuadro);
		}catch(ClassNotFoundException e){
			System.out.println("EXCEPXION no se encontro clase Figura...");
		}
		
	}
}