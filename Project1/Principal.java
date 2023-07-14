import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion2 = 0;
		String contrasenia;
		String contraseniaCorrecta = "contra";
		Menu menuPrincipal = new Menu(	"\t\t\t\t\t SISTEMA DE INSCRIPCIONES\n"+
										"\t\t\t\t\t  FACULTAD DE INGENIERIA\n"+
										"\t\t\t\t\t INGENIERIA EN COMPUTACION\n"+
										"\t______________________________________________________________________________________\n"+
										"\t--------------------------------------------------------------------------------------\n\n\n"+
										"\t\t 1. Acceso Alumnos.\n\n"+
										"\t\t 2. Acceso Profesores.\n\n"+
										"\t\t 3. Acceso Tecnicos/Coordinadores\n\n"+
										"\t\t 4. Salir.\n\n", 4);

		Menu menuAlumno = new Menu(	"\t\t\t\t\t SISTEMA DE INSCRIPCIONES\n"+
									"\n"+
									"\t\t\t\t\t       MENU ALUMNO\n"+
									"\t______________________________________________________________________________________\n"+
									"\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n"+
									"\t\t 1. Registrar Alumno.\n\n"+
									"\t\t 2. Mostrar alumnos.\n\n"+
									"\t\t 3. Inscribir materias.\n\n"+
									"\t\t 4. Regresar.\n\n", 4);

		Menu menuProfesor = new Menu(	"\t\t\t\t\t SISTEMA DE INSCRIPCIONES\n"+
										"\n"+
										"\t\t\t\t\t       MENU PROFESOR\n"+
										"\t______________________________________________________________________________________\n"+
										"\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n"+
										"\t\t 1. Registrar Profesor.\n\n"+
										"\t\t 2. Mostrar profesores.\n\n"+
										"\t\t 3. Asignar grupo a Profesor.\n\n"+
										"\t\t 4. Regresar.\n\n", 4);

		Menu menuTecnico = new Menu(	"\t\t\t\t\t SISTEMA DE INSCRIPCIONES\n"+
									"\n"+
									"\t\t\t\t\t       MENU TECNICO\n"+
									"\t______________________________________________________________________________________\n"+
									"\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n"+
									"\t\t 1. Crear Asignaturas.\n\n"+
									"\t\t 2. Cambiar datos alumno.\n\n"+
									"\t\t 3. Cambiar datos profesor.\n\n"+
									"\t\t 4. Regresar.\n\n", 4);


		do{
			opcion = menuPrincipal.mostrarMenu();
			switch (opcion){
				case 1:
					do{
						opcion2 = menuAlumno.mostrarMenu();
						switch (opcion2){
							case 1:
								System.out.println("\n\n\t Registrar Alumno.");
								break;
							case 2:
								System.out.println("\n\n\t Mostrar Alumnos.");
								break;
							case 3:
								System.out.println("\n\n\t Inscribir materias Alumno.");
								break;
						}
					}while(opcion2!=4);
					break;
				case 2:
					do{
						opcion2 = menuProfesor.mostrarMenu();
						switch (opcion2){
							case 1:
								System.out.println("\n\n\t Registrar Profesor.");
								break;
							case 2:
								System.out.println("\n\n\t Mostrar Profesor.");
								break;
							case 3:
								System.out.println("\n\n\t Asignar grupo.");
								break;
						}
					}while(opcion2!=4);
					break;
				case 3:
					System.out.print("\n\n\n\tIngrese la contrasenia de los tecnicos (es: contra).\n\n\tCONTRASENIA: ");
					contrasenia = sc.nextLine();
					if (contraseniaCorrecta.compareTo(contrasenia)==0){
						System.out.println("\n\n\n Contrasenia CORRECTA, BIENVENIDO...");
						do{
							opcion2 = menuTecnico.mostrarMenu();
							switch (opcion2){
								case 1:
									System.out.println("\n\n\t Crear Asignatura.");
									break;
								case 2:
									System.out.println("\n\n\t Cambiar datos alumno.");
									break;
								case 3:
									System.out.println("\n\n\t Cambiar datos profesor.");
									break;
							}
						}while(opcion2!=4);
					}else{
						System.out.println("\n\n\n Contrasenia INCORRECTA ...");
					}
					
					break;
			}
		}while (opcion!=4);
		

		

		System.out.println("\n\n\t\tSALIENDO ...\n\n");



	}

}