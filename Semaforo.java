import java.util.Scanner;
public class Semaforo {
enum Estado {
ROJO, AMARILLO, VERDE
}
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Estado estadoActual = Estado.ROJO;
    boolean finalizado = false;
    
    while (!finalizado) {
      switch (estadoActual) {
        case ROJO:
          System.out.println("Semáforo en ROJO");
          break;
        case AMARILLO:
          System.out.println("Semáforo en AMARILLO");
          break;
        iicase VERDE:
          break;
      }
      System.out.println("Presiona Enter para cambiar de estado o escribe FIN para salir:");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("FIN")) {
        finalizado = true;
      } 
      else {
        estadoActual = siguienteEstado(estadoActual);i
          }
    }
    System.out.println("Programa finalizado.");
    scanner.close();
  }
  public static Estado siguienteEstado(Estado estadoActual) {
    switch (estadoActual) {
      case ROJO:
        return Estado.AMARILLO;
      case AMARILLO:
        return Estado.VERDE;
      case VERDE:
        return Estado.ROJO;
      default:
        return estadoActual;
    }
  }
}
