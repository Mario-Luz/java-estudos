import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        byte numero1 = scanner.nextByte();

        System.out.print("Digite o segundo numero: ");
        byte numero2 = scanner.nextByte();

        int result = numero1 + numero2;
        System.out.println("O resultado é " + result);

        scanner.close();
    }
}