import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            
            System.out.println(tabuada + "X" + i + "=" + (tabuada * i));

        }

        /*Tabuada com while */
        Scanner ler = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada2 = ler.nextInt();
        int count = 0;

        while (count <= 10) {
            System.out.println(tabuada2 + "X" + count + "=" + (tabuada2 * count));
            count++;
        }

        /*Tabuada com Do While */

        Scanner ler2 = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada3 = ler2.nextInt();
        int i = 0;

        do {
            System.out.println(tabuada3 + "X" + i + "=" + (tabuada3 * i));
            i++;
        } while(i<=10);






    }
    
}
