import java.util.LinkedList;
import java.util.Scanner;

public class CuentaAH implements ICuenta {

  public static final String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
  public static String nombre;
  public static String apellidos;
  public static String tipo;
  private int mes = 0;
  private String mesPalabra = meses[mes];
  private double monto;
  private LinkedList<String> compras = new LinkedList<>();
  private LinkedList<Float> precios = new LinkedList<>();

  public CuentaAH(String nombre, String apellidos, double monto) {
    tipo = "Ahorro";
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.monto = monto;
  }

  public void registrarCompra(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\n Que cosa compro?: ");
    compras.add(sc.nextLine());
    System.out.print("\n Cuanto costo?: ");
    precios.add(sc.nextFloat());
  }

  public void mostrarCorte(){
    float auxiliar = 0;
    int i = 0;
    System.out.println("\n Estado de cuenta del cliente "+nombre+" "+apellidos);
    System.out.println(" Para el mes de "+mesPalabra+"\n");
    for(Float elemento : precios){
      System.out.print(" Compra: "+compras.get(i));
      System.out.println(" Precio: "+elemento);
      auxiliar += elemento;
      i++;
    }
    System.out.println(" Monto inicio de mes: $"+(monto));
    System.out.println(" Gasto del mes: $"+auxiliar);
    System.out.println(" Monto fin del mes: $"+(monto-auxiliar));
    System.out.println(" ________________________________________");
  }

  

  public void setMonto(double monto) {
    this.monto=monto;
  }

  public double getMonto() {
    return monto;
  }


  @Override
  public ICuenta clonar() {
    CuentaAH cuenta = null;

    try {
      cuenta = (CuentaAH) clone();
      LinkedList<String> listaNueva1 = new LinkedList();
      LinkedList<Float> listaNueva2 = new LinkedList();
      cuenta.compras = listaNueva1;
      cuenta.precios = listaNueva2;
      cuenta.mes+=1;
      int auxiliar = 0;
      cuenta.mesPalabra = meses[cuenta.mes];
      for(Float elemento : precios)
        auxiliar += elemento;
      cuenta.monto -= auxiliar;
    } catch(CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return cuenta;
  }

  @Override
  public String toString() {
    return "CuentaAH [tipo="+tipo+", monto="+monto+"]";
  }

}
