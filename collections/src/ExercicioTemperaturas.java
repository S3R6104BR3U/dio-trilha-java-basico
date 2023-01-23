import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ExercicioTemperaturas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<Double>();
        List<String> meses = new ArrayList<String>();
        meses.add("janeiro");
        meses.add("fevereiro");
        meses.add("março");
        meses.add("abril");
        meses.add("maio");
        meses.add("junho");

        System.out.println("Calcule a temperatura média dos 6 primeiros meses do ano");

        Double somaTemperaturas = 0.0;

        for(int count = 0; count <= 5; count++) {
            String mes = meses.get(count);
            System.out.println("Digite Temperatura de " + mes + ":");
            double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);
            somaTemperaturas = somaTemperaturas + temperatura;
        }

        Double media = somaTemperaturas / 6;

        System.out.println(meses);
        System.out.println(temperaturas);
        System.out.println("A média das temperaturas é: " + media);

        System.out.println("Os meses com temperatura acima da média são: ");

        Integer ordem = 1;
        for(int count = 0; count <=5; count++) {
            Double temperatura = temperaturas.get(count);
            String mes = meses.get(count);

            if (temperatura > media) {
                System.out.println( ordem + " - " + mes + ": " + temperatura);
            }
            ordem++;
        }


        
        
        
    }

    
}


