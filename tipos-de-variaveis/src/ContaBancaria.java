import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    
    int numero;
    String nomeAgencia;
    float saldo; 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome da Agência:");
        String nomeAgencia = scanner.next();

        System.out.println("O seu saldo é de:");
        float saldo = scanner.nextFloat();
        
        System.out.println("O seu número de conta é:");
        int numero = scanner.nextInt();

        System.out.println("Olá! A sua agência é " + nomeAgencia + ", com o número de conta " + numero + "." + " O seu saldo é de: " + saldo + " reais.");

    }

}

