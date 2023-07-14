public class PruebaClassCast{
	public static void main(String[] args){
		System.out.println("\nObject x = new Integer(4);");
		System.out.println("System.out.println((String)x);\n");
		Object x = new Integer(4);
		System.out.println((String)x);
	}
}