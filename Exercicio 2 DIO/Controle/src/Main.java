import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        cont.setN1(scan.nextInt());
        System.out.println("Informe o segundo numero: ");
        cont.setN2(scan.nextInt());

        cont.cont();
    }
}