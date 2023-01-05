import java.util.Random;

public class NumerosAleatorios {
    public static void main (String[] args) {
        Random random = new Random();

        int[] NumerosAleatorios = new int[20];

        for(int i = 0; i < NumerosAleatorios.length; i++ ){
            int numero = random.nextInt(100);
            NumerosAleatorios[i] = numero;

        }

        System.out.print("Numeros Aleatórios: ");
        for (int numero : NumerosAleatorios) {
            System.out.print(numero + " ");
        }


        System.out.print("\nAntecessor dos Numeros Aleatórios: ");
        for (int numero : NumerosAleatorios) {
            System.out.print(numero - 1 + " ");
        }
        
        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for (int numero : NumerosAleatorios) {
            System.out.print(numero + 1 + " ");
        }

        
        

    }
    
}
