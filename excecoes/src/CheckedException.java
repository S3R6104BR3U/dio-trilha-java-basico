import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import javax.swing.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que você deseja imprimir!" + e.getCause());
        } finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();

    }
}
