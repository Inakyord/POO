import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFound{
	public static void main(String[] args){

		File archivo = new File("texto.txt");
		System.out.println("Se declara archivo \"texto.txt\";");
		try{
			archivo.getFreeSpace();
		}catch(FileNotFoundException e){
			System.out.println("EXCEPCION no se encontro el archivo...");
		}
		
	}
}