import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu RG: ");
        String rg = teclado.next();

        System.out.print("Digite seu Telefone: ");
        String tel = teclado.next();

        System.out.print("Digite seu Endereço: ");
        String end = teclado.nextLine();

        System.out.print("Digite seu Email: ");
        String email = teclado.next();

        System.out.printf("Olá %s, RG: %s, Telefone: %s, Endereço: %s, Email: %s.",nome,rg,tel,end,email);





        teclado.close();
    }
}
