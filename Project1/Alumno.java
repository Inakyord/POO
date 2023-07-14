import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

/**
	La clase Alumno es una clase abstracta sobre una estructura de datos que simula los datos de un alumno de la facultad.
	En ella se dan metodos para obtener y cambiar sus atributos, mostrar en pantalla diferentes atributos, y asignar las claves de los
	grupos a los que se inscribe (teniendo un limite de máximo 3).
	Así mismo se hacen calculos para obtener la edad a partir de la fecha de nacimiento y se usa la clase Calendar para guardar esta fecha.
	@author Inaky Ordiales
	@author David Calderon
	@author Humberto Hernandez
*/

public class Alumno{

	static int alumnosRegistrados=0;

	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;
	int cuenta;
	int diaNacimiento;
	int mesNacimiento;
	int yearNacimiento;
	Calendar fechaCumple = Calendar.getInstance();
	String nombreCarrera;
	int claveCarrera;
	int semestre;
	int numGrupo = 0;
	int[] clavesGrupo = new int[3];

	/**
	<p> Constructor vacio para instancia de la clase Alumno.
	    Dentro suma uno a la variable estatica que cuenta cuantos alumnos se han registrado.
	*/
	public Alumno(){ alumnosRegistrados++;}

	/**
	<p> Constructor para la instancia de Profesor.
		Dentro del constructor se asignan los parametros a los atributos de la instancia de Profesor.
		Igualmente dentro se hacen los calculos para las asignaciones de los atributos fechaCumple y edad.
		Al final suma uno a la variable estatica que cuenta cuantos profesores se han registrado.
	@param nombre el nombre de la persona a registrar.
	@param apellidoPaterno el apellido paterno de la persona a registrar.
	@param apellidoMaterno el apellido materno de la persona a registrar.
	@param cuenta el numero de cuenta de trabajador del profesor.
	@param diaNacimiento dia de nacimiento.
	@param mesNacimiento mes de nacimiento.
	@param yearNacimiento anio de nacimiento.
	@param claveCarrera la clave para las carreras de ingenieria.
	@param semestre el semestre menor del que no haya cursado todas las materias.

	*/
	public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int cuenta, int diaNacimiento, int mesNacimiento, int yearNacimiento, int claveCarrera, int semestre){
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.cuenta = cuenta;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.yearNacimiento = yearNacimiento;
		this.claveCarrera = claveCarrera;
		this.semestre = semestre;

		String[] carreras=	{"Ingnieria Civil", "Ingenieria de Minas y Metalurgia", "Ingenieria Electrica Electronica ", "Ingenieria en Computacion",
							 "Ingenieria en Telecomunicaciones", "Ingenieria Geofísica", "Ingenieria Geológica", "Ingenieria Industrial",
							 "Ingenieria Mecánica", "Ingenieria Petrolera", "Ingenieria Mecatronica", "Ingenieria Geomatica",
							 "Ingenieria en Sistemas Biomédicos", "Ingenieria Ambiental", "Ingenieria Aeroespacial"};
		nombreCarrera = carreras[claveCarrera];

		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
		alumnosRegistrados++;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;
	}
	public void setCuenta(int cuenta){
		this.cuenta = cuenta;
	}
	public void setDiaNacimiento(int diaNacimiento){
		this.diaNacimiento = diaNacimiento;
		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
	}
	public void setMesNacimiento(int mesNacimiento){
		this.mesNacimiento = mesNacimiento;
		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
	}
	public void setYearNacimiento(int yearNacimiento){
		this.yearNacimiento = yearNacimiento;
		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
	}
	public void setClaveCarrera(int claveCarrera, String nombreCarrera){
		this.claveCarrera = claveCarrera;
		this.nombreCarrera = nombreCarrera;
	}

	public String getNombre(){
		return nombre;
	}
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}
	public int getCuenta(){
		return cuenta;
	}
	public int getDiaNacimiento(){
		return diaNacimiento;
	}
	public int getMesNacimiento(){
		return mesNacimiento;
	}
	public int getYearNacimiento(){
		return yearNacimiento;
	}
	public int getEdad(){
		return edad;
	}
	public int getClaveCarrera(){
		return claveCarrera;
	}
	public String getNombreCarrera(){
		return nombreCarrera;
	}


	public void mostrarAlumno(){
		System.out.println("\n Alumno:\t\t\t"+nombre+" "+apellidoPaterno+" "+apellidoMaterno);
		System.out.println(" Fecha de nacimiento:\t\t"+fechaCumple.get(Calendar.DAY_OF_MONTH)+" / "+fechaCumple.get(Calendar.MONTH)+" / "+fechaCumple.get(Calendar.YEAR));
		System.out.println(" Edad:\t\t\t\t"+edad);
		System.out.println(" Numero de cuenta:\t\t"+cuenta);
		System.out.println(" Carrera:\t\t\t"+nombreCarrera);
		System.out.println(" Clave carrera:\t\t\t"+claveCarrera);
	}


	public void mostrarAlumnoClases(){
		System.out.println("\n Alumno:\t\t\t"+nombre+" "+apellidoPaterno+" "+apellidoMaterno);
		System.out.println(" Fecha de nacimiento:\t\t"+fechaCumple.get(Calendar.DAY_OF_MONTH)+" / "+fechaCumple.get(Calendar.MONTH)+" / "+fechaCumple.get(Calendar.YEAR));
		System.out.println(" Edad:\t\t\t\t"+edad);
		System.out.println(" Numero de cuenta:\t\t"+cuenta);
		System.out.println(" Carrera:\t\t\t"+nombreCarrera);
		System.out.println(" Clave carrera:\t\t\t"+claveCarrera);
		mostrarGruposAlumno();
	}

	public void mostrarGruposAlumno(){
		int i = 0;
		do{
			if (clavesGrupo[i]!=0)
				System.out.println(" Imprimiendo información del grupo. sin lista, con profesor");
		}while(i<2);
	}

	public void asignarGrupo(int claveGrupo){
		clavesGrupo[numGrupo] = claveGrupo;
		numGrupo++;
	}


}