import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();


        productos.add("prod1",9.99,2);
        productos.add("ddd2");
        productos.add("ddd2");
        productos.add("ddd2");
        productos.add("ddd2");


        /*productos.stream()
                .map(p -> p.getPrecio())
                //.map(Producto::getPrecio)
                .filter(precio -> precio>10)
                .forEach(System.out::println);
                */


        /*productos.stream()
                .sorted((p1,p2)->(int) (p1.getPrecio()-p2.getPrecio()))
                .map(Producto::getPrecio)
                .forEach(System.out::println);*/

      /*  String prodMay10=productos.stream()
                .filter(p->p.getPrecio()>10)
                .sorted((p1,p2)->(int) (p1.getPrecio()-p2.getPrecio()))
                .map(Producto::getNombre)
                .collect(Collectors.joining(",","Productos mayores de 10","."));
        System.out.println(prodMay10);*/
//hacer medias
      double media=  productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average().getAsDouble();
        System.out.println(media);

    }
}
