import java.util.Scanner;
public class Ejercicio11{
  public static void main(String[]args){
    Scanner ingreso = new Scanner(System.in);
    String palab1, palab2, mayor = "";
    int cont1, cont2, diferencia;
   
    System.out.print("Ingresa una palabra: ");
    palab1 = ingreso.next();
    System.out.print("Ingresa otra palabra: ");
    palab2 = ingreso.next();
    cont1 = palab1.length();
    cont2 = palab2.length();
    diferencia = Math.abs(cont1 - cont2); 
   
    if (cont1 > cont2){
      System.out.printf(" palabra mayor es ", palab1);
    }
    if (cont1 < cont2){
      System.out.printf("lapalabra mayor es ", palab2);
    }
    if(cont1 == cont2){
      System.out.printf("Las palabras tienen misma longitud");
    }
   
    System.out.printf("La diferencia es de %d letra", diferencia);

  }
}