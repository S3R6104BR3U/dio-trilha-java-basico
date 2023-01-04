import java.util.Scanner;
public class ExecicioControleDeFluxo {

    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia:");
        String dia = leitor.next();

        switch (dia){
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terca":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }

        System.out.println("Digite nome do mês:");
        String mes = leitor.next();

        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "julho":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }


    }
    
}
