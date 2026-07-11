package q2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("Nome do Produto:");
        p.setNome(sc.next());
        System.out.println("Quantidade:");
        p.setQuantidade(sc.nextInt());
        System.out.println("Preço Unitário:");
        p.setPreco(sc.nextDouble());

        p.calculo();
        double total,valorpago,calculo2,calculo3;

        if(p.getCal() > 500) {
            total = p.getCal() * 0.85;
        } else {
            total = p.getCal();
        }
        System.out.printf(" Valor da Compra:R$%.2f",p.getCal());
        System.out.println(" Valor Pago:R$");
        valorpago = sc.nextDouble();
        if (valorpago < total) {
            calculo2 = total - valorpago;
            System.out.printf("Valor pago foi insuficiente, falta R$%.2f",calculo2);
        } else if (valorpago > total) {
            calculo3 = valorpago - total;
            System.out.printf("O Troco é de:R$%.2f",calculo3);
        } else{
            System.out.println("Compra realizada com sucesso");
        }

    }
}
