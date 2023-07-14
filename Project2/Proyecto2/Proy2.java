import java.util.Scanner;
import java.util.LinkedList;
import java.io.IOException;

public class Proy2 {

  public static void main(String[] args) throws InterruptedException{
    
    Scanner sc = new Scanner(System.in);

    String nombre, apellidos;
    double monto;
    int opcion;
    LinkedList<CuentaAH> estados = new LinkedList<>();

    Menu menu = new Menu( " Bienvenido a su banco HOYNOFIO MANIANASI\n\n"+
                          " Que desea hacer?:\n"+
                          "\t 1. Registrar compra.\n"+
                          "\t 2. Realizar corte de mes.\n"+
                          "\t 3. Mostrar estados de cuenta anteriores.\n"+
                          "\t 4. Salir", 4);

    System.out.print("\n Ingrese nombre usuario: ");
    nombre = sc.nextLine();
    System.out.print("\n Ingrese apellidos usuario: ");
    apellidos = sc.nextLine();
    System.out.print("\n Cuanto dinero desea ingresar: ");
    monto = sc.nextInt();

    CuentaAH cuentaAhorro = new CuentaAH(nombre, apellidos, monto);

    do{
      opcion = menu.mostrarMenu();
      switch(opcion){
        case 1:
          System.out.println("\n\n Registrar compra.");
          cuentaAhorro.registrarCompra();
          break;
        case 2:
          System.out.println("\n\n Corte de mes.");
          estados.add(cuentaAhorro);
          cuentaAhorro = (CuentaAH) cuentaAhorro.clonar();
          String carga = "";
          for (int i = 0; i < 11; i++) {
              int porcent = i*10;
              System.out.println("Corte Progreso "+carga+" "+porcent+" %");
              carga = carga + "--";
              Thread.sleep(250);
          }
          System.out.println("\n\n Se realizo el corte exitosamente...\n\n");
          break;
        case 3:
          System.out.println("\n\n Mostrar estados de cuenta anteriores.");
          if(estados.isEmpty())
            System.out.println("\n No hay estados, realice el corte de mes.");
          else{
            for(CuentaAH elemento : estados){
              elemento.mostrarCorte();
              System.out.println();
            }
          }
          break;
      }
      if(opcion!=4)
        pressEnter();
    }while(opcion!=4);

  }

  private static void pressEnter(){
        System.out.println("\n Apreite ENTER para continuar ... ");
        try{
            System.in.read();
        }catch (IOException e){
        }
    }

}
