import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
        textos.add("ddd2");
        textos.add("aaa2");
        textos.add("bb1");
        textos.add("aaa1");
        textos.add("bbb3");
        textos.add("ddd2");
        textos.add("ccc");
        textos.add("bbb2");
        textos.stream()
                //nos vamos a quedar con la longitud del string
                .map(String::length)
        .forEach(System.out::println);
    }
}
