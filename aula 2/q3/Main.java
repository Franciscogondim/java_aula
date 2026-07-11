package q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente("Ana","123","456","(83)99999-9999","Rua ABC","ana@uniesp.edu.br");
        System.out.printf("Nome: %s / Rg: %s / Cpf: %s / Telefone: %s / Endereço: %s / Email: %s ",c.getNome(),c.getRg(),c.getCpf(),c.getTelefone(),c.getEndereco(),c.getEmail());
        sc.close();
    }
}
