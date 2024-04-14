package POO;
import java.util.Scanner;

public class Bdia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuál es tu nombre? ");
        String nome = entrada.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(("Buenos días, ") + nome);
        }
        entrada.close();
    }
}