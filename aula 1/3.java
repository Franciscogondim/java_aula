import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        double valorf;
        double vinsert;
        double troco;
        System.out.print("Nome do produto: ");
        String nome = teclado.nextLine();

        System.out.print("Quantidade: ");
        int qntd = teclado2.nextInt();

        System.out.print("Valor: ");
        double valor = teclado2.nextDouble();

        double cal = qntd * valor;

        if (cal > 500) {
            valorf = cal * 0.85;
        } else {
            valorf = cal;
        }
        System.out.printf("O valor final é %f", valorf);
        System.out.println("Valor inserido: ");
        vinsert = teclado2.nextDouble();

        if (vinsert == valorf) {
            System.out.println("Compra concluida");
        } else if (vinsert > valorf) {
            troco = vinsert - valorf;
            System.out.printf("Seu troco é: %f",troco);
        }
        else{
            troco =  valorf - vinsert;
            System.out.printf("Falta: %f",troco);
            
        }
        
        teclado2.close();
        teclado.close();
    }
}    
