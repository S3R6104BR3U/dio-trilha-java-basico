import javax.swing.*;

public class UncheckedException {
    public static void main (String[] args) {

        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseUnsignedInt(b));
            System.out.println("Resultado: " + resultado);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            continueLooping = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada Invalida Informe um número inteiro");
            //e.printStackTrace();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Impossível dividir por zero");
        }
        
        finally {
            System.out.println("Chegou no finally");
        }


        } while (continueLooping);
        
        System.out.println("O código continua...");

    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}