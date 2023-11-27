import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = reader.nextLine();

        for (int i = 0; i <= 5 ; i++) {
            System.out.println("Hola " + nombre);

        }
    }
}
