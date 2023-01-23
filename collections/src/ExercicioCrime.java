import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioCrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <String> perguntas = new ArrayList<>();
        List <String> respostas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
                String resposta = scan.next();
                if (resposta.equals("sim")) respostas.add(resposta);
        }

        System.out.println(respostas.size());

        switch (respostas.size()) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;

        }
        
    }
    
}
