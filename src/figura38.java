import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class figura38 {

    public static void main(String[] args) {

        // declarar la colección
        Set<String> lista = new LinkedHashSet();

        lista.add("hola");
        lista.add("programadores");
        lista.add("que tal?");
        lista.add("mañana día libre");
        lista.add("programadores"); // candidato a no ser agregado
        lista.add("necesitamos vacaciones");

        // recorrer la colección
        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}