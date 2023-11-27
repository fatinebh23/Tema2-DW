import java.util.ArrayList;
import java.util.stream.Stream;

public class MainReceta {
    public static void main(String[] args) {


        Receta receta1= new Receta("Tortilla",400,"verduras");
        Receta receta2= new Receta("Carbonara",800,"carne");
        Receta receta3= new Receta("sopa ",300,"verduras");
        Receta receta4= new Receta("espaguettis",1000,"pastas");
        ArrayList<Receta> recetas = new ArrayList<>();


        Stream<Receta> menosde500calorias =
                recetas.stream()
                        .filter(r ->  r.getCalorias()< 500)
        .map(Receta::getNombre)
                .forEach(System.out::println);

    }
}
