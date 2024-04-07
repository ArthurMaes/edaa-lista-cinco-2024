public class Programa {
   public static void main(String[] args) {
    ListContatos lista = new ListContatos();

        lista.adicionarContato("Pedro", "926154921", "5789219089");
        lista.adicionarContato("Maria", "110893946", "2197491284");


        lista.listarContatos();

        Contato contato = lista.buscarContatoPorNome("Maria");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
   }
}