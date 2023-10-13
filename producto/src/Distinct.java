import java.util.ArrayList;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {

        List<Integer> enteros =new ArrayList<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);


        enteros.stream()
                .distinct()
        .forEach(System.out::println);
    }
}
