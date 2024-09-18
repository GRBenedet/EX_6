import java.util.Scanner;

public class Exercicios_1 {

    public static void main(String[] args) {
        System.out.println(soma(0));

    }

    public static int soma(int resultado) {
        Scanner leia = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("valor : ");
        valor1 = leia.nextInt();
        System.out.println("valor : ");
        valor2 = leia.nextInt();
        return (resultado = valor1 + valor2);
    }

}