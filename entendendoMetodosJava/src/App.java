import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
          // Calculadora
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();

        System.out.println("Selecione a operação soma(+), subtração(-), multiplicação(*) ou divisão(/): ");
        String operacao = scan.next();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scan.nextDouble();
      
        System.out.println("Exercício calculadora");
        switch (operacao) {
            case "+" :
                Calculadora.soma(numero1, numero2);
                break;
            case "-" :
                Calculadora.subtracao(numero1, numero2);
                break;
            case "*":
                Calculadora.multiplicacao(numero1, numero2);
                break;
            case "/":
                Calculadora.divisao(numero1, numero2);
                break;
            default:
                System.out.println("Operação Inválida");
                break;

        }

        // Mensagem
        System.out.println("Exercício mensagem");

        System.out.println("Digite primeira hora:");
        int hora1 = scan.nextInt();
        Mensagem.obterMensagem(hora1);

        System.out.println("Digite a segunda hora:");
        int hora2 = scan.nextInt();
        Mensagem.obterMensagem(hora2);

        System.out.println("Digite a terceira hora");
        int hora3 = scan.nextInt();
        Mensagem.obterMensagem(hora3);
        
        // Emprésitmo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        scan.close();
    }
}
