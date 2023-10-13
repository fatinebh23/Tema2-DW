import java.util.ArrayList;
import java.util.List;

public class Match {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
                textos.add("aa1");
                textos.add("bb2");
                textos.add("cc3");
                textos.add("ff3");

               /* boolean resultado =textos.stream()
                        .anyMatch(t->t.startsWith("a"));
        System.out.println(resultado);*/

        /*boolean resultado =textos.stream()
                .allMatch(t->t.startsWith("a"));
        System.out.println(resultado);*/

        boolean resultado =textos.stream()
                .noneMatch(t->t.startsWith("a"));
        System.out.println(resultado);

    }}
