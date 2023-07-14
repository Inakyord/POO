import java.lang.NoSuchFieldException;
import java.lang.NoSuchMethodException;
public class NoSuchThing{
	public static void main(String[] args){
		Figura forma = new Figura();
		try{
			forma.edad = 5;
		}catch(NotSuchFieldException e){
			System.out.println("No existe ese atributo");
		}
		try{
			forma.mostrarTodo();
		}catch(NotSuchMethodException e){
			System.out.println("No existe ese metodo");
		}
	}

}
class Figura{
	public String nombre;
	public int lados;

	public void mostrar(){
		System.out.println("Nombre: "+nombre+", lados: "+lados);
	}
}