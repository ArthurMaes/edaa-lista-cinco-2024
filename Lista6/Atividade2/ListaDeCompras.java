import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras implements Contrato{
private List<Compras> itens;
    public ListaDeCompras() {
         this.itens = new ArrayList<>();
        
}

    @Override
    public void adicionarItem(String nome, Double preco) {
        Compras novoItem = new Compras(nome,preco);
        itens.add(novoItem);
        
    }

    @Override
    public Compras buscarItemPorNome(String nome) {
        for (Compras n :itens ) {
            if (n.getNome().equalsIgnoreCase(nome)) {
                return n;
            }
        }
        
        return null;
    }

    @Override
    public void listarCompras() {
        if(itens.isEmpty()){
            System.out.println("A Lista de Compras está vazia");
        }
        else{
            System.out.println("Lista de Itens");
            for(Compras n:itens){
            System.out.println(n);
        }
    }
        
    }
    
}