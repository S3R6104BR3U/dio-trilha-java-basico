public class RodarAplicacao {
    
    public static void main(String[] args) {

        //Normal sem upcast e downcast
        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        //Down cast deve ser evitado
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
     
}
