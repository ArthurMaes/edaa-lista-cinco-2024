public class Programa {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();

        lista.adicionarItem("Arroz", 30.99);
        lista.adicionarItem("Leite", 7.99);
        lista.adicionarItem("Biscoito", 2.50);

        lista.listarCompras();

        Compras achar = lista.buscarItemPorNome("Arroz");
        if (achar != null){
            System.out.println(achar);
        }
        else{
            System.out.println("O Item não existe");
        }
    }
}