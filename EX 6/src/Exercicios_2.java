import java.util.Scanner;

public class Exercicios_2 {
    public static void main(String[] args) {
        System.out.println(media(0));    
    
        }
    
    
        public static float media (int aritimedica){
            int valor1, valor2, valor3, valor4;
            float resultado;
            Scanner ler = new Scanner(System.in);
            System.out.println("Primeiro valor : ");
                valor1 = ler.nextInt();
                System.out.println("Segundo valor : ");
                valor2 = ler.nextInt();
                System.out.println("Terceiro valor : ");
                valor3 = ler.nextInt();
                System.out.println("quarto valor : ");
                valor4 = ler.nextInt();
                return (resultado = ((valor1 + valor2 + valor3 + valor4)/4));
        }
}
