import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class PruebaParse{
	public static void main(String[] args){
		String dateStr = "2011-11-19";
		System.out.println("\nString pasada: "+dateStr);
		System.out.println("Formato requerido: yyyy-MM-dd");
		DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date date;

		try {
			date = formato.parse(dateStr);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}