public class Operadores {

    public static void main (String[] args) {
       /* String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //=================

        int numero1 = 5;

        numero1++;

        System.out.println(numero1);
        
        boolean variavel = true;

        System.out.println(variavel);

        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel); */


         //operador ternário

         int a, b;

         a = 6;
         b = 6;

         String resultado = a == b ? "verdadeiro" : "falso";
         
        
        System.out.println(resultado);

        //=======

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println("numero 1 é igual ao numero 2? " + simNao);

        //=====

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
    
}
