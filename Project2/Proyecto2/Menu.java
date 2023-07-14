import java.util.Scanner;

public class Menu{
	
	private String texto;
	private int opciones;

	public Menu(String textoMenu, int opciones){
		setTexto(textoMenu);
		if (!setOpciones(opciones))
			System.out.println(" El numero de opciones probablemente sea incorrecto.");
	}

	public final void setTexto(String texto){
		this.texto = texto;
	}
	public String getTexto(){
		return texto;
	}

	public final boolean setOpciones(int opciones){
		if (opciones>1){
			this.opciones = opciones;
			return true;
		}
		return false;
	}
	public int getOpciones(){
		return opciones;
	}

	public int mostrarMenu(){
		System.out.println("\n\n"+getTexto());
		System.out.print(" Eleccion: ");
		return obtenerOpcion();
	}
	public int obtenerOpcion(){
		Scanner sc = new Scanner(System.in);

		int opcion = sc.nextInt();
		while (opcion<1 || opcion>opciones){
			System.out.println("\n Opcion NO VALIDA.");
			return mostrarMenu();
		}
		return opcion;
	}

}