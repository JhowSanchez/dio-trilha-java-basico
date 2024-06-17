import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaTerminal cont = new ContaTerminal();

        System.out.println("Por favor, digite o numero da Agencia: ");
        cont.setAgencia(scan.next());
        System.out.println("Por favor, digite seu nome: ");
        cont.setNomeCli(scan.next());
        System.out.println("Por favor, digite seu saldo: ");
        cont.setSaldo(scan.nextDouble());

        System.out.println("Ola, "+cont.getNomeCli()+", Obrigado por criar uma conta em nosso banco, sua agencia e "+cont.getAgencia()+", conta "+cont.getNumero()+" e seu saldo "+cont.getSaldo()+" ja esta disponivel para saque");
    }
}