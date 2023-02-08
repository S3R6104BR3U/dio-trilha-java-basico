import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;


public class ExercicioPropostoArcoIres {
    public static void main (String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íres");

        Set<String> coresArcoIris = new HashSet<>();
           coresArcoIris.add("vermelho");
           coresArcoIris.add("laranja");
           coresArcoIris.add("amarelo");
           coresArcoIris.add("verde");
           coresArcoIris.add("azul");
           coresArcoIris.add("anil");
           coresArcoIris.add("violeta");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores uma abaixo da outra:");
        for (String cor: coresArcoIris) System.out.println(cor);
    
        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
       
        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        Set<String> coresArcoIres3 = new LinkedHashSet<>(
            Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho")
        );
        System.out.println(coresArcoIres3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIres3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
      
        

        System.out.println("Exiba todas as cores que começam com a letra 'v' : ");
        for (String cor: coresArcoIris) {
            if (cor.startsWith("v")) System.out.println(cor);
        }
        
        System.out.println("Exiba todas as cores que terminam com a letra 'o' : ");
        for (String cor: coresArcoIris) {
            if (cor.endsWith("o")) System.out.println(cor);
        }


        System.out.println("Remova todas as cores que não começam com a letra 'v': ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
            while (iterator2.hasNext()) {
                if (!iterator2.next().startsWith("v")) iterator2.remove();
            }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
            coresArcoIris.clear();
            
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}



