import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SomarDoisNumeros {
    
    public static void main (String[] args) {
        
        Scanner lerNumero = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = lerNumero.nextInt();
        System.out.println("Digite o Segundo número:");
        int numero2 = lerNumero.nextInt();
        int resultado = numero1 + numero1;
        System.out.println(numero1 + " mais " + numero2 + " é igual a " + resultado);

        LocalDate data = LocalDate.now();
        System.out.println(data);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(data.format(formato));

    }
}
