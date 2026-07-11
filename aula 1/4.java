import java.util.Locale;
import java.util.Scanner;
public class atividades {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int opcao;
        double saldo = 500;
        double deposito;
        double sacar;
        String r;
        
        
        do {
            System.out.println("---------------");
            System.out.println("consultar saldo - 1");
            System.out.println("deposito - 2");
            System.out.println("sacar - 3");
            System.out.println("Selecione uma opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é de: %f", saldo);
                case 2:
                    System.out.println("Quanto deseja depositar: ");
                    deposito = teclado.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf("Seu saldo atual é de: %f", saldo);
                case 3:
                    System.out.println("Quanto deseja sacar: ");
                    sacar = teclado.nextDouble();
                    saldo = saldo - sacar;
                    if(saldo > 0) {
                        System.out.println("Saldo insuficiente");
                    }
                    else {
                        System.out.printf("Seu saldo atual é de: %f", saldo);
                    }
                default:
                    System.out.println("Opção invalida");
            }
            System.out.println("Para repetir, digite S");
            r = teclado2.next();
        } while (r.equalsIgnoreCase("S"));
            

        teclado2.close();
        teclado.close();
    }
}
