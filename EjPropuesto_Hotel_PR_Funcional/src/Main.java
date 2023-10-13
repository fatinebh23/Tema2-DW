import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Hotel> hoteles = new ArrayList<>();
        hoteles.add(new Hotel("Hola", "Santander",3));
        hoteles.add(new Hotel("adios", "Santander",2));
        hoteles.add(new Hotel("buenos dias", "Barcelona",3));
        hoteles.add(new Hotel("tardes", "Santander",4));
        hoteles.add(new Hotel("noches", "Valencia",5));
        hoteles.add(new Hotel("flor", "Marbella",2.5));

        //obtener una sublista con hoteles suyo rating sea del al menos 3

        hoteles.stream()

                .filter(r-> r.getRating()>=3)
                .map(Hotel::getNombre)
                .forEach(System.out::println);

        //Mostrar por pantalla los nombres de los hoteles de la ciudad de Santander

       String hotelSantander= hoteles.stream()
                .filter(H->H.getCiudad()=="Santander")
                .map(Hotel::getNombre)
                .collect(Collectors.joining(",","Los hoteles de santander son ","."));
        System.out.println(hotelSantander);

        //Obtener la media de rating de los hoteles de la lista
        double media=  hoteles.stream()
                .mapToDouble(Hotel::getRating)
                .average().getAsDouble();
        System.out.println(media);


        //Ordenar los hoteles de mayor  a menor rating
        hoteles.stream()
                .filter(h->h.getRating()<6)
                .sorted((h1,h2)-> (int) (h2.getRating()-h1.getRating()))
                .map(Hotel::getNombre)
                .forEach(System.out::println);



    }
}