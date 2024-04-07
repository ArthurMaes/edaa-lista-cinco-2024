import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Pessoa> pessoa= new ArrayList<>();

        pessoa.add(new Pessoa("Arthur", 18));
        pessoa.add(new Pessoa("Marcos", 21));
        pessoa.add(new Pessoa("Maria", 80));
        pessoa.add(new Pessoa("Daniel", 31));
        pessoa.add(new Pessoa("Jonata", 19));
        pessoa.add(new Pessoa("Julia", 23));

        pessoa.sort(Comparator.comparingInt(Pessoa::getIdade));

        // Imprimindo a lista ordenada
        for (Pessoa p : pessoa) {
            System.out.println(p);
        }
    }
}