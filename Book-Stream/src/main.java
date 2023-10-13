import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void Main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro(600, "Casa","Marcos"));
        libros.add(new Libro(300, "Flor","Anna"));
        libros.add(new Libro(600, "Montaña","Patri"));
        libros.add(new Libro(250, "Libros","Claudia"));
        libros.add(new Libro(200, "Vida","Alvaro"));
        libros.add(new Libro(400, "Manta","Alvaro"));


        // Obtener la cantidad de libros con más de 500 páginas
        System.out.println(" la cantidad de libros con más de 500 páginas: ");
        long cantidad= libros.stream()
                .filter(p-> p.getNumPaginas()>500)
                .count();
        System.out.println(cantidad);


        //Obtener la cantidad de libros con menos de 300 páginas.
        System.out.println("la cantidad de libros con menos de 300 páginas:");
        long cantidad2= libros.stream()
                .filter(p-> p.getNumPaginas()<300)
                .count();
        System.out.println(cantidad2);


        //Listar el título de todos aquellos libros con más de 500 páginas
        System.out.println("el título de todos aquellos libros con más de 500 páginas:");
        libros.stream()
                .filter(p-> p.getNumPaginas()>500)
                .map(Libro::getTitulo)
                .forEach(System.out::println);

        //Mostrar en consola el título de los 3 libros con mayor número de páginas.
        System.out.println("el título de los 3 libros con mayor número de páginas: ");
        libros.stream()
                .sorted((p1,p2)-> Integer.compare(p2.getNumPaginas(), p1.getNumPaginas()))
                .limit(3)
                .forEach(System.out::println);

        //Mostrar en consola la suma total de las páginas de todos los libros.
        System.out.println("La suma total de las páginas de todos los libros es :");
        int totalpag = libros.stream()
                .mapToInt(Libro::getNumPaginas)
                .sum();
        System.out.println(totalpag);

        //Mostrar en consola todos aquellos libros que superen el promedio en cuanto a número de páginas se refiere

        System.out.println("Aquellos libros que superen el promedio en cuanto a número de páginas son: ");
        double mediaPag = libros.stream()
                .mapToDouble(Libro::getNumPaginas)
                .average()
                .orElse(0);

        libros.stream()
                .filter(l->l.getNumPaginas()>mediaPag)
                .map(Libro::getTitulo)
                .forEach(System.out::println);

        //Mostrar en consola los autores de todos los libros, sin repetir nombres de autores.
        System.out.println(" los autores de todos los libros sin repetir son:" );
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(System.out::println);

        //Mostrar en consola los autores que tengan más de 1 libro listado.
        System.out.println("Los autores que tengan más de 1 libro listado son: ");
//no se hacerlo

        //Obtener el libro con mayor número de páginas
       System.out.println("el libro con mayor número de páginas es: ");
        libros.stream()
                .max(Comparator.comparingInt(Libro::getNumPaginas))
                .get().getTitulo();
        //no se hacerlo

        //Crear una lista de Strings con todos los títulos de los libros
        System.out.println("Listar los titulos: ");
      List<String> titulos = libros.stream()
                .map(Libro::getTitulo)
              .toList();



    }
}
