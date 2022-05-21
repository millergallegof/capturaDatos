package proyecto;

import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");
        String nomUsuario = scanner.nextLine();
        System.out.println("Ingrese numero de Celular");
        String numCelular = scanner.nextLine();
        System.out.println("Ingrese Edad");
        String edad = scanner.nextLine();
        System.out.println("Bienvenido señor " + nomUsuario + " es un placer para nosotros contar con una persona de "+ edad + " años.\n" +
                "Próximamente nos comunicaremos con usted al numero "+ numCelular + ".\n" +
                "Feliz día");
    }
}
