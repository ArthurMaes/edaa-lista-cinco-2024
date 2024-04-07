import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        
    
    List<Animal> animais = new ArrayList<>();
    animais.add(new Animal("Jacaré"));
    animais.add(new Animal("Girafa"));
    animais.add(new Animal("Elefante"));
    animais.add(new Animal("Zebra"));
    animais.add(new Animal("Cachorro"));
    animais.add(new Animal("Gato"));
    animais.add(new Animal("Cobra"));
    animais.add(new Animal("Morcego"));


    animais.sort((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));

        
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}