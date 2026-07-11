import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = telcado.next();

        System.out.print("Digite o segundo número: ");
        int n2 = telcado.next();
        
        if(n1 > n2) {
            System.out.print("O primeiro número é maior");
        }
        else if(n1 < n2) {
            System.out.print("O segundo número é maior");
        }
        else{
            System.out.print("Os números são iguais ");
        }
        




        teclado.close();
    }
}
