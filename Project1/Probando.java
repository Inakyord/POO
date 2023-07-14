public class Probando{
	public static void main(String[] args){

		Profesor primero = new Profesor("raul", "gomez", "hermosillo", "Doctor", 379427, 07, 06, 2000);

		primero.mostrarProfesor();

		Alumno segundo = new Alumno("raul", "gomez", "hermosillo", 379427, 07, 06, 2000, 110, "Ingenieria en Compu", 2);

		segundo.mostrarAlumno();
	}
}