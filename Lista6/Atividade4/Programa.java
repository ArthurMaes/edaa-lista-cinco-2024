import java.util.ArrayList;
import java.util.List;



public class Programa {
    public static void main(String[] args) {
   List<Pais> paises = new ArrayList<>();
   
   paises.add(new Pais("Alemanha"));
   paises.add(new Pais("Argentina"));
   paises.add(new Pais("Portugal"));
   paises.add(new Pais("Brasil"));
   paises.add(new Pais("Japão"));
   paises.add(new Pais("França"));
   paises.add(new Pais("Coréia"));
   paises.add(new Pais("China"));

   paises.sort((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));

   for(Pais p : paises){
    System.out.println(p);
   }

    }

}