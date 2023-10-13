import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filter {
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
                .filter(text -> text.startsWith("a"))
                .filter(text -> text.endsWith("2"))
        .forEach(System.out::println);
//otra opcion
        textos.stream()
                .filter(text -> text.startsWith("a") && text.endsWith("2"))

                .forEach(System.out::println);



        }
    }

