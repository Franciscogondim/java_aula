package exercicio1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client c = new Client();
        System.out.println("Nome:");
        c.setNome(sc.next());
        System.out.println("RG:");
        c.setRg(sc.next());
        System.out.println("CPF:");
        c.setCpf(sc.next());
        System.out.println("Telefone:");
        c.setTelefone(sc.next());
        System.out.println("Endereço:");
        c.setEndereço(sc.next());
        System.out.println("Email:");
        c.setEmail(sc.next());

        System.out.printf("Nome: %s / RG: %s / CPF: %s / Telefone: %s / Endereço: %s / Email: %s/",c.getNome(),c.getRg(),c.getCpf(),c.getTelefone(),c.getEndereço(),c.getEmail());

        sc.close();
    }
}
