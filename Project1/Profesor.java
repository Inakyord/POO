import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Set;

/**
	La clase Profesor es una clase abstracta sobre una estructura de datos que simula los datos de un profesor de la facultad.
	En ella se dan metodos para obtener y cambiar sus atributos, mostrar en pantalla diferentes atributos, y asignar las claves de los grupos que imparte.
	Así mismo se hacen calculas para obtener la edad a partir de la fecha de nacimiento y se usa la clase Calendar para guardar esta fecha.
	@author Inaky Ordiales
	@author David Calderon
	@author Humberto Hernandez
*/

public class Profesor{
	
	static int profesoresRegistrados=0;

	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	String titulo;
	int edad;
	int cuenta;
	int diaNacimiento;
	int mesNacimiento;
	int yearNacimiento;
	Calendar fechaCumple = Calendar.getInstance();
	int numGrupo = 0;
	Set<Integer> clases;

	/**
	<p> Constructor vacio para instancia de la clase Profesor.
	    Dentro suma uno a la variable estatica que cuenta cuantos profesores se han registrado.
	*/
	public Profesor(){ profesoresRegistrados++;}

	/**
	<p> Constructor para la instancia de Profesor.
		Dentro del constructor se asignan los parametros a los atributos de la instancia de Profesor.
		Igualmente dentro se hacen los calculos para las asignaciones de los atributos fechaCumple y edad.
		Al final suma uno a la variable estatica que cuenta cuantos profesores se han registrado.
	@param nombre el nombre de la persona a registrar.
	@param apellidoPaterno el apellido paterno de la persona a registrar.
	@param apellidoMaterno el apellido materno de la persona a registrar.
	@param titulo el titulo educativo que tenga la persona (Licenciado, Ingeniero, Maestro, Doctor).
	@param cuenta el numero de cuenta de trabajador del profesor.
	@param diaNacimiento dia de nacimiento.
	@param mesNacimiento mes de nacimiento.
	@param yearNacimiento anio de nacimiento.
	*/
	public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, String titulo, int cuenta, int diaNacimiento, int mesNacimiento, int yearNacimiento){
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.titulo = titulo;
		this.cuenta = cuenta;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.yearNacimiento = yearNacimiento;

		this.fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
		profesoresRegistrados++;
	}

	/**
	<p> cambia el atributo nombre al parametro que se le pase.
	@param nombre el nombre de la persona.
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	/**
	<p> cambia el atributo apellidoPaterno al parametro que se le pase.
	@param apellidoPaterno el apellido paterno de la persona.
	*/
	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	<p> cambia el atributo apellidoMaterno al parametro que se le pase.
	@param apellidoMaterno el nombre de la apellido materno.
	*/
	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;
	}
	/**
	<p> cambia el atributo titulo al parametro que se le pase.
	@param titulo el titulo de la persona (Licenciado, Ingeniero, Maestro, Doctor).
	*/
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	/**
	<p> cambia el atributo cuenta al parametro que se le pase.
	@param cuenta el numero de cuenta de trabajador de la persona.
	*/
	public void setCuenta(int cuenta){
		this.cuenta = cuenta;
	}
	/**
	<p> cambia el atributo diaNacimiento al parametro que se le pase.
	@param diaNacimiento el dia en el que nacio la persona.
	*/
	public void setDiaNacimiento(int diaNacimiento){
		this.diaNacimiento = diaNacimiento;
		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
	}
	/**
	<p> cambia el atributo mesNacimiento al parametro que se le pase.
	@param mesNacimiento el mes en el que nacio la persona.
	*/
	public void setMesNacimiento(int mesNacimiento){
		this.mesNacimiento = mesNacimiento;
		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
	}
	/**
	<p> cambia el atributo yearNacimiento al parametro que se le pase.
	@param yearNacimiento el anio en el que nacio la persona.
	*/
	public void setYearNacimiento(int yearNacimiento){
		this.yearNacimiento = yearNacimiento;
		fechaCumple.set(yearNacimiento, mesNacimiento, diaNacimiento);
		edad = Period.between(LocalDate.of(yearNacimiento, mesNacimiento, diaNacimiento), LocalDate.now()).getYears();
	}

	/**
	<p> getter del atributo nombre.
	@return regresa una string con el nombre del profesor.
	*/
	public String getNombre(){
		return nombre;
	}
	/**
	<p> getter del atributo apellidoPaterno.
	@return regresa una string con el apellido paterno del profesor.
	*/
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	/**
	<p> getter del atributo apellidoMaterno.
	@return regresa una string con el apellido materno del profesor.
	*/
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}
	/**
	<p> getter del atributo titulo.
	@return regresa una string con el titulo (Licenciado, Ingeniro, Maestro, Doctor) del profesor.
	*/
	public String getTitulo(){
		return titulo;
	}
	/**
	<p> getter del atributo cuenta.
	@return regresa un entero con el numero de cuenta de trabajador del profesor.
	*/
	public int getCuenta(){
		return cuenta;
	}
	/**
	<p> getter del atributo diaNacimiento.
	@return regresa un entero del dia de nacimiento del profesor.
	*/
	public int getDiaNacimiento(){
		return diaNacimiento;
	}
	/**
	<p> getter del atributo mesNacimiento.
	@return regresa un entero del mes de nacimiento del profesor.
	*/
	public int getMesNacimiento(){
		return mesNacimiento;
	}
	/**
	<p> getter del atributo yearNacimiento.
	@return regresa un entero del anio de nacimiento del profesor.
	*/
	public int getYearNacimiento(){
		return yearNacimiento;
	}
	/**
	<p> getter del atributo edad.
	@return regresa un entero del valor de la edad del profesor.
	*/
	public int getEdad(){
		return edad;
	}
	

	/**
	<p> muestra en la pantalla la informacion personal del profesor.
	*/
	public void mostrarProfesor(){
		System.out.println("\n Profesor:\t\t\t"+titulo+" "+nombre+" "+apellidoPaterno+" "+apellidoMaterno);
		System.out.println(" Fecha de nacimiento:\t\t"+fechaCumple.get(Calendar.DAY_OF_MONTH)+" / "+fechaCumple.get(Calendar.MONTH)+" / "+fechaCumple.get(Calendar.YEAR));
		System.out.println(" Edad:\t\t\t\t"+edad);
		System.out.println(" Numero cuenta empleado:\t"+cuenta);
	}

	/**
	<p> muestra en la pantalla la informacion personal del profesor con las clases que da.
	*/
	public void mostrarProfesorClases(){
		System.out.println("\n Profesor:\t\t\t"+titulo+" "+nombre+" "+apellidoPaterno+" "+apellidoMaterno);
		System.out.println(" Fecha de nacimiento:\t\t"+fechaCumple.get(Calendar.DAY_OF_MONTH)+" / "+fechaCumple.get(Calendar.MONTH)+" / "+fechaCumple.get(Calendar.YEAR));
		System.out.println(" Edad:\t\t\t\t"+edad);
		System.out.println(" Numero cuenta empleado:\t"+cuenta);
		mostrarGruposProfesor();
	}

	/**
	<p> muestra en la pantalla la informacion del conjutno clases que da el profesor.
	*/
	public void mostrarGruposProfesor(){
		for (int i = 0; i<clases.size(); i++)
			System.out.println(" Imprimiendo información del grupo. con lista alumnos");
	}

	/**
	<p> asignar / agrega la clave de un grupo al conjutno de clases del profesor.
	@param claveGrupo la clave unica de cada grupo de la facultad.
	*/
	public void asignarGrupo(int claveGrupo){
		clases.add(Integer.valueOf(claveGrupo));
	}


}