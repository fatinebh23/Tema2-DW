import org.example.Main;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class numero_mayor_test {

    @Test
    public void test1() {
        int a=5;
        int b=3;
        int c=7;
        Main main = new Main();

      assertEquals(main.numero_mayor(a,b,c),7);
    }
    @Test
    public void test2() {
        int a=5;
        int b=3;
        int c=4;
//otor ejemplo para hacer donde se puede ver mas claro

        Main main = new Main();
        int expresult=5;
        int result = main.numero_mayor(a,b,c);
        assertEquals(expresult,result);
    }
    @Test
    public void test3() {
        int a=5;
        int b=7;
        int c=6;
        Main main = new Main();

        assertEquals(main.numero_mayor(a,b,c),7);
    }

    @Test
    public void test4() {
        int a=5;
        int b=7;
        int c=9;
        Main main = new Main();

        assertEquals(main.numero_mayor(a,b,c),9);
    }


}
