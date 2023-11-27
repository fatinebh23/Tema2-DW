import  java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [ ] args)
    {
        Scanner objEntrada = new Scanner(System.in);
        System.out.println("Escribe un numero para sacar sus factores primos");
        int numero = objEntrada.nextInt();
        factor(numero);
    }

    static void factor(int numero)
    {
        int num = 2;

        while(numero!=1)
        {
            while(numero%num==0)
            {
                System.out.println(num);
                numero /= num;
            }
        }
    }
}
